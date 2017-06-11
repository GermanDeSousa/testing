import os


def build_directory(i, class_name):
    os.system("mkdir evosuite-result/{directory}".format(directory=class_name + str(i)))


def main():
    class_list = ["collections.comparators.FixedOrderComparator", "collections.iterators.FilterIterator",
                  "collections.map.PredicatedMap", "math.genetics.ElitisticListPopulation"]

    randoop_location = "../../randoop-3.1.2/randoop-all-3.1.2.jar"
    evosuite_location = "../../evosuite-1.0.5.jar"
    binary_location = "/home/sherman1000/Desktop/Facu/Testing/TP2/evosuitevsrandoop/target/classes"

    for class_name in class_list:
        for i in range(30):
            evosuite_command = "java -jar {evosuite_location} -Dsearch_budget=60 -projectCP {binary_location} " \
                               "-class {class_name}  -base_dir=".format(
                evosuite_location=evosuite_location, binary_location=binary_location, class_name=class_name,
                directory=class_name + str(i))

            os.system(evosuite_command)
