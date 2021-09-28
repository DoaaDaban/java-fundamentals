# java-fundamentals

This repo is for practicing Java starting from the very basics

# basics
In the basics folder in Main file I have a class with 3 methods:
* pluralize: is for making the input word plural or keep it singular based on the number
* flipNHeads: is for counting how many time we need to at least get the specified number of heads in a row
* clock: To print the time every second and show how many Hertz the program is operating at

# basic library
- roll Method .
- AverageFinder method .
- lowest average array .
- duplicate elements in array method .

## Linter
1. In the [linter](linter/app/src/main/java/linter) folder in [App](linter/app/src/main/java/linter/App.java) file I have 1 method:
    - missingSemicolon: this method accept a path to a file and check every line for missing semicolons and ignore the line if:
        - line ends With }
        - line ends With {
        - line contains if
        - line contains else
        - line starts With //
        - empty lines
    - In the [test](linter/app/src/test/java/linter/AppTest.java) file I have a test for the method to check if the number of lines that have missing semicolons is right.
