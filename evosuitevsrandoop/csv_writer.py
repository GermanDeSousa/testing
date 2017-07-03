import csv
import os

from bs4 import BeautifulSoup


def write_csv():
    class_list = ["collections.comparators.FixedOrderComparator", "collections.iterators.FilterIterator",
                  "collections.map.PredicatedMap", "math.genetics.ElitisticListPopulation"]

    for class_name in class_list:
        for i in range(30):
            line_coverage, branch_coverage, lines_of_code = get_data_from_jacoco(class_name, i)
            mutation_score = get_data_from_pitest(class_name, i)
            write_data_in_csv(class_name, line_coverage, branch_coverage, mutation_score)


def get_data_from_jacoco(class_name, i):
    file = jacoco_file_directory(class_name, i)
    html_file = open(file, 'r')
    html_source_code = html_file.read()

    soup = BeautifulSoup(html_source_code)
    data_table = soup.find_all('tfoot')[0]
    data_row = data_table.find_all('tr')[0]
    line_coverage = percentage_to_float(data_row.find_all('td')[2].text)
    branch_coverage = percentage_to_float(data_row.find_all('td')[4].text)
    lines_of_code = data_row.find_all('td')[8].text
    return line_coverage, branch_coverage, lines_of_code


def jacoco_file_directory(class_name, i):
    class_name_words = class_name.split('.')
    package_prefix = class_name_words[0] + "." + class_name_words[1]
    test_suite_name = 'TestRegressionTest' + class_name.split('.')[2] + str(i) + 'A0.java'
    jacoco_result_directory = 'jacoco-ut/{test_suite_name}/{package_prefix}/'.format(test_suite_name=test_suite_name,
                                                                                     package_prefix=package_prefix)

    return jacoco_result_directory + class_name_words[2] + ".html"


def pitest_file_directory(class_name, i):
    class_name_words = class_name.split('.')
    pitest_result_directory = 'pitest-results/{class_name}{i_in_string}'.format(class_name=class_name_words[2],
                                                                                i_in_string=str(i))
    root, dirs, files = os.walk(pitest_result_directory).next()
    class_name_words = class_name.split('.')
    file_directory = pitest_result_directory + "/" + dirs[0] + '/' + class_name_words[0] + "." + class_name_words[
        1] + '/index.html'
    return file_directory


def get_data_from_pitest(class_name, i):
    file = pitest_file_directory(class_name, i)
    html_file = open(file, 'r')
    html_source_code = html_file.read()

    soup = BeautifulSoup(html_source_code)
    data_table = soup.find_all('tbody')[1]

    data_row = data_table.find_all('tr')[0]
    mutation_score = percentage_to_float(data_row.find_all(class_='coveragePercentage')[1].text)
    return mutation_score


def write_data_in_csv(class_name, line_coverage, branch_coverage, mutation_score):
    with open('csvs/randoop-result.csv', 'a') as csvfile:
        writer = csv.writer(csvfile)
        writer.writerow([class_name, 'Randoop', line_coverage, branch_coverage, mutation_score])


def percentage_to_float(stringPercent):
    return float(stringPercent.split('%')[0]) / 100.0


if __name__ == '__main__':
    write_csv()
