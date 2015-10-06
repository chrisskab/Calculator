# Calculator
Command Line Java Calculator

Set up as maven project for dependencies

## How to use
Open in IDE of your choice, use Maven to import any dependencies.

Build project or use the command line:> *mvn clean compile assembly:single*

View TestCalculator class in src/test/java for unit tests.

## Example Run in IDE
Create a run configuration for an application, select Main.class as main class.

For program arguments, set "add(1,2)"

## Example Run on the command line
Use the jar generated by the build.

>java -jar target/Calculator-1.0-SNAPSHOT-jar-with-dependencies.jar "add(1,2)"

##Other Example Data:
"add(1, mult(2,3))"               //equals 7

"mult(add(2,2),div(9,3))"         //equals 12

"let(a,5,add(5,5))"               //equals 10

"let(a,5,let(b,mult(a,10),add(b,a)))"       //equals 55

"let(a,let(b,10,add(b,b)),let(b,20,add(a,b)))"     //equals 40
