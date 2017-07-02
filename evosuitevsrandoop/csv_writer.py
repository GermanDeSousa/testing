import csv
from bs4 import BeautifulSoup


def write_csv():
    class_list = ["collections.comparators.FixedOrderComparator", "collections.iterators.FilterIterator",
                  "collections.map.PredicatedMap", "math.genetics.ElitisticListPopulation"]

    for i in range(30):
        for class_name in class_list:
            file_directory = 'pitest-results/{class_name}{i_in_two_digits}'.format(class_name=class_name,
                                                                                   i_in_two_digits=str(i))
            htmlFile = open(file_directory, 'r')
            source_code = htmlFile.read()
            write_in_csv_the_result(class_list, source_code)


def write_in_csv_the_result(class_list, source_code):
    soup = BeautifulSoup(source_code)
    data_table = soup.find_all('tbody')[1]
    j = 0
    for class_name in class_list:
        data_row = data_table.find_all('tr')[j]
        line_coverage = percentage_to_float(data_row.find_all(class_='coveragePercentage')[0].text)
        mutation_score = percentage_to_float(data_row.find_all(class_='coveragePercentage')[1].text)
        with open('csvs/result.csv', 'wb') as csvfile:
            writer = csv.writer(csvfile)
            writer.writerow([class_name, 'Randoop', line_coverage, mutation_score])

        j = j + 1


def percentage_to_float(stringPercent):
    return float(stringPercent.split('%')[0]) / 100.0


if __name__ == '__main__':
    write_csv()
