# student-manager-rest-api-spring
Basic set up for a RESTful API using SpringBoot based on a student model.

## Features
* Configured to use an H2 database. Can be changed by navigating to src/main/resources/application.properties
* Has a functional get and post request method inside the controller that can store and retreive students | src/main/java/com/example/demo/controller/StudentController.java
* Uses the JpaRepository to access our database | src/main/java/com/example/demo/dao/StudentRepo.java


## Starting the application

* Go to your "StudentManagerApplication" file inside src/main/java/com/example/demo and run the file. 
* You can use postman to test the api endpoints found inside the student controller | src/main/java/com/example/demo/controller/StudentController.java

## Purpose of the application
This application is meant to be a starter sprinboot project so people can familiarize themselves with REST Api's. It can also be easily modifed since it is so bare.
Make this application into what you see fit.

If you want further information on how I set up this application, check out this [medium article](https://medium.com/@emmanuel_tejeda/java-tutorial-creating-a-basic-rest-api-using-springboot-pt1-3ef25e3c903a) I wrote describing my process. There are also useful links scattered around the article if you want to do further research.


