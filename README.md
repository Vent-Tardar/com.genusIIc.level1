# com.genusIIc.vt.level1

### Level 1
Application requirements:

* Simple console application (runnable Jar file).
* Input file names and output file name are specified as command line parameters.
* App should correctly handle errors (not a stack trace).

Input:

* Assume that the Modified file has only modified lines in comparison to the Original file.
* No lines are added or deleted.

Output:
 * List of modified lines (with line numbers).

Sample: 

> 15: <modified line value for line 15>

> 23: <modified line value for line 23>

### Files

Test files:

* test1.txt
* test2.txt
* testing1.txt
* testing2.txt

Java files:

* ~Level_1.java~
* Main.java
* ComperisonDoc.java

### Changes: 

* Changed the algorithm for comparing array elements in file Level_1.java
* Splitting the Level_1 file.java for two files: Main.java and ComperisonDoc.java
