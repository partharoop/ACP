package= nz.ac.auckland.softeng281.a3
bin = SetOfStrings/bin

src = SetOfStrings/src
src_test = SetOfStrings/test
classpath = $(bin):SetOfStrings/lib/junit-4.13.1.jar:SetOfStrings/lib/hamcrest-core-1.3.jar
delimiter = /
clean_command = rm -rf

src_path = $(src)$(delimiter)
src_test_path = $(src_test)$(delimiter)

all: dependencies clean build test

dependencies:
	which java javac

clean:
	$(clean_command) $(bin)$(delimiter)

build: clean
	javac -cp $(classpath) -d $(bin) $(src)/SetOfStrings.java $(src_test)/SetOfStringsTest.java 

run: clean build
	java -cp $(classpath) SetOfStrings

dependencies:
	which java javac

clean:
	rm -rfv $(bin)/*


test: clean build
	java -cp $(classpath) org.junit.runner.JUnitCore SetOfStringsTest


