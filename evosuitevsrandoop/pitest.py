import os


def run_pitest():
    class_list = ["FixedOrderComparator", "FilterIterator",
                  "PredicatedMap", "ElitisticListPopulation"]

    for class_name in class_list:
        for i in range(30):
            pitest_command = "mvn clean install -Dtest_case=RegressionTest{class_name}{i_in_string}A0 " \
                             "-Dtest_class_to_test=RegressionTest{class_name}{i_in_string}A0 " \
                             "-Ddirectory=pitest-results/{class_name}{i_in_string}" \
                             " org.pitest:pitest-maven:mutationCoverage".format(class_name=class_name,
                                                                                i_in_string=str(i))

            os.system(pitest_command)


if __name__ == '__main__':
    run_pitest()
