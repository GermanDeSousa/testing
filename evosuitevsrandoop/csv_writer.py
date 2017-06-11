import csv


def write_csv():
    class_list = ["collections.comparators.FixedOrderComparator", "collections.iterators.FilterIterator",
                  "collections.map.PredicatedMap", "math.genetics.ElitisticListPopulation"]

    for class_name in class_list:
        with open(class_name + '.csv', 'wb') as csvfile:
            writer = csv.writer(csvfile)
            writer.writerow(['Spam', 'Lovely Spam', 'Wonderful Spam'])