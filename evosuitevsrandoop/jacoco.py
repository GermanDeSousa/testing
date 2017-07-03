import os


def run_jacoco():
    class_list = ["collections.comparators.FixedOrderComparator", "collections.iterators.FilterIterator",
                  "collections.map.PredicatedMap", "math.genetics.ElitisticListPopulation"]

    for class_name in class_list:
        for i in range(30):
            name = class_name.split('.')[2]

            test_file_name = "TestRegressionTest" + name + str(i) + 'A0.java'

            jacoco_command = "mvn clean install -Dtest_class_to_test={filename} " \
                             "-Djacoco_output={filename}".format(filename=test_file_name)

            os.system(jacoco_command)


if __name__ == '__main__':
    run_jacoco()
