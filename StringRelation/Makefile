package= nz.ac.auckland.softeng281
bin = bin
ifeq ($(OS),Windows_NT)
	src = src\main\java
	src_test = src\test\java
    classpath = $(bin);lib\junit-4.13.1.jar;lib\hamcrest-core-1.3.jar
    package_path = nz\ac\auckland\softeng281
    delimiter = \\
    clean_command = rd /s /q
else
	src = src/main/java
	src_test = src/test/java
    classpath = $(bin):lib/junit-4.13.1.jar:lib/hamcrest-core-1.3.jar
    package_path = nz/ac/auckland/softeng281
    delimiter = /
    clean_command = rm -rf
endif

src_path = $(src)$(delimiter)$(package_path)$(delimiter)
src_test_path = $(src_test)$(delimiter)$(package_path)$(delimiter)

all: dependencies clean build test

dependencies:
	which java javac

clean:
	$(clean_command) $(bin)$(delimiter)$(package_path)$(delimiter)

build: clean
	javac -cp $(classpath) -d $(bin) $(src)/$(package_path)/SetOfStrings.java  $(src)/$(package_path)/StringRelation.java $(src_test)/$(package_path)/SetOfStringsTest.java $(src_test)/$(package_path)/StringRelationTest.java 

clean:
	rm -rfv $(bin)/*

test: clean build
	java -cp $(classpath) org.junit.runner.JUnitCore $(package).SetOfStringsTest $(package).StringRelationTest


run: clean build 
	java -cp $(classpath) $(package).SetOfStringsTest $(package).StringRelationTest

