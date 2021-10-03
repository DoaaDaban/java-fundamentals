# java-fundamentals

This repo is for practicing Java starting from the very basics

1. In the [basics](basics) folder in [Main](basics/Main.java) file I have a class with 3 methods:
    - pluralize: is for making the input word plural or keep it singular based on the number
    - flipNHeads: is for counting how many time we need to at least get the specified number of heads in a row
    - clock: To print the time every second and show how many Hertz the program is operating at
1. In the [basiclibrary](basiclibrary) folder in [Library](basiclibrary/lib/src/main/java/basiclibrary/Library.java) file I have 4 methods:
    - roll: accept integer as input and return and array with a length of the input and random values from 1 to 6
    - containsDuplicates: accept an array of integer as input and return true if there was duplicates and false if there wasn't
    - average: accept an array of integer and return the average of that array
    - lowestAvg: accept an array of integer arrays and return the array with the lowest average
    - In the [test](basiclibrary/lib/src/test/java/basiclibrary/LibraryTest.java) file I have a test for every method
1. In the [linter](linter/app/src/main/java/linter) folder in [App](linter/app/src/main/java/linter/App.java) file I have 1 method:
    - missingSemicolon: this method accept a path to a file and check every line for missing semicolons and ignore the line if:
        - line ends With }
        - line ends With {
        - line contains if
        - line contains else
        - line starts With //
        - empty lines
    - In the [test](linter/app/src/test/java/linter/AppTest.java) file I have a test for the method to check if the number of lines that have missing semicolons is right.