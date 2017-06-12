import os


def build_directory(i, class_name):
    os.system("mkdir evosuite-result/{directory}".format(directory=class_name + str(i)))


if __name__ == '__main__':
    class_list = ["collections.comparators.FixedOrderComparator", "collections.iterators.FilterIterator",
                  "collections.map.PredicatedMap", "math.genetics.ElitisticListPopulation"]

    randoop_location = "../../randoop-3.1.2/randoop-all-3.1.2.jar"
    evosuite_location = "../../evosuite-1.0.5.jar"
    binary_location = "/home/sherman1000/Desktop/Facu/Testing/TP2/evosuitevsrandoop/target/classes"

    for class_name in class_list:
        for i in range(30):
            build_directory(i, class_name)
            evosuite_command = "java -jar {evosuite_location} -Dsearch_budget=60 -projectCP {binary_location} " \
                               "-base_dir evosuite-result/{directory} -class {class_name}".format(
                evosuite_location=evosuite_location, binary_location=binary_location, class_name=class_name,
                directory=class_name + str(i))

            os.system(evosuite_command)

    for class_name in class_list:
        for j in range(30):
            class_name_to_output_file = class_name.split('.')[2]
            randoop_command = 'java -ea -classpath {randoop_location}:target/ randoop.main.Main gentests --testclass={class_name}' \
                              ' --timelimit=60 --testsperfile=20000 --junit-output-dir=src/test/java/randoop ' \
                              '--regression-test-basename="{regression_file_name}" ' \
                              '--error-test-basename="{error_file_name}"'.format(randoop_location=randoop_location,
                                                                                 regression_file_name="RegressionTest" + class_name_to_output_file + str(
                                                                                     j) + 'A',
                                                                                 error_file_name="ErrorTest" + class_name_to_output_file + str(
                                                                                     j) + 'A',
                                                                                 class_name=class_name)
            os.system(randoop_command)
