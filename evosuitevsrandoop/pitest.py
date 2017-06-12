import os

if __name__ == '__main__':
    os.system('mvn clean install org.pitest:pitest-maven:mutationCoverage')