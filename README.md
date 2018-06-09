# Movie Library Assignment

## Context

This document contains a description and some requirements to take this assignment for Full Stack Java Developers (Angular or other Framework).
The application to design is a Movie Library !
To help you in the Design of the application, you have at your disposal :

- a JSON file (movies.json) containing the movie list. A movie is represented as : 

{
  "title":"Avengers: Infinity War",
  "director":"Anthony RUSSO, Joe RUSSO",
  "releaseDate":"25/04/2018",
  "type":"sci-fi"
}


## Goal

The Goal is to assert that the candidate has enough technical skills to : 
* Use Git and some basic commands
* Create a SpringBoot application for REST API from scratch
* Create an Client Application from scratch
* Write Short and Clean Code. (Using for example JUnit)


## Requirements

1. Create the SpringBoot Application
  a. Create a new GitHub Repository that you will send us.
  b. Create the SpringBoot Application
  c. You will need to access to the movies.json file (read/write) (design your code in the best way you think it should be)
  d. You have to create a REST Controller to be able to list the movies
  e. You have to create a REST Controller (or reuse the same, you choose) to be able to add/remove/update the list of movies


2. Create the Angular Single Page Application (If the candidate does not know Angular, use the Framework of your choice)
  a. You should use the most recent Angular version
  b. Create the White App
  c. Add the BootStrap Framework (most recent one too)
  d. The application should have a menu with the following elements : 
    - home
    - list of movies
  e. The home page is just a description of the application
  f. You have to create a route to display the list of movies in a Grid. 
  g. This grid should let user to sort the elements (1 level sort is enough).


## Bonus 
1. Improve the movie element to be allowed to have several directors
2. Create models Type, Director so that the code will be easier to understand
3. Create a page for authors and movie types
