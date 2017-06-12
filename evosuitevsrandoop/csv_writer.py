import csv
from bs4 import BeautifulSoup


def write_csv():
    class_list = ["collections.comparators.FixedOrderComparator", "collections.iterators.FilterIterator",
                  "collections.map.PredicatedMap", "math.genetics.ElitisticListPopulation"]

    htmlFile = open('pitest-result/index.html', 'r')
    source_code = htmlFile.read()

    soup = BeautifulSoup(source_code)
    data_table = soup.find_all('tbody')[1]
    i = 0
    for class_name in class_list:
        data_row = data_table.find_all('tr')[i]
        line_coverage = percentage_to_float(data_row.find_all(class_='coveragePercentage')[0].text)
        mutation_score = percentage_to_float(data_row.find_all(class_='coveragePercentage')[1].text)
        with open('csvs/' + class_name + '.csv', 'wb') as csvfile:
            writer = csv.writer(csvfile)
            writer.writerow([class_name, 'Randoop', line_coverage, mutation_score])

        i = i + 1


def percentage_to_float(stringPercent):
    return float(stringPercent.split('%')[0]) / 100.0


if __name__ == '__main__':
    write_csv()
