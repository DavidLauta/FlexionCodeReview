FlexionCodeReview
GitHub repository https://github.com/DavidLauta/FlexionCodeReview
David Lauta
lautad@gate.net
(561) 289-0502

The Problem:
Our users, who are as comfortable using the command line as they are using a browser, 
need a simple program that will classify triangles based on three numbers. 
The numbers represent the lengths of three line segments that may be able to be arranged 
to form a triangle.

This solution works as a command line application.

To Build:
mvn clean install
or 
mvn clean install -Dmaven.test.skip=true

To Run:
java -cp target\FlexionCodeReview-1.0-SNAPSHOT.jar com.lauta.App

Runtime parameters can be included which define the three sides of the Triangle
i.e
java -cp target\FlexionCodeReview-1.0-SNAPSHOT.jar com.lauta.App 1 2 3
java -cp target\FlexionCodeReview-1.0-SNAPSHOT.jar com.lauta.App 4.4 7.3 9.1

If three parameters are not available on the command line the program will prompt for them.

The output will echo the input and specify the classification of the triangle represented by the three sides.



