# Movie Library Assignment

## Table of Contents
- [Very Important](#very-important)
- [Context](#context)
- [Goal](#goal)
- [Requirements](#requirements)
    - [Create the SpringBoot application](#__create-the-springboot-application__)
    - [Create the Angular application](#__create-the-angular-single-page-application__)
    - [Generic Specifications](#__generic-specifications__)
- [Bonus](#bonus)

<hr/>
<br/>

## Very Important

Once the candidate considers the test done, <br />
Please send me your GitHub Repo to this address : [jpanetto@maltem.com](mailto:jpanetto@maltem.com)

## Context

This document contains a description and some requirements to take this assignment for Full Stack Java Developers (Angular or other Framework).
<br/>
The application to design is a Movie Library ! 
<br/>
You may have between 1 and 2 days to perform it !
<br/>
To help you in the Design of the application, you have at your disposal :

- a JSON file (movies.json) containing the movie list. A movie is represented as : 

```json
{
  "title":"Avengers: Infinity War",
  "director":"Anthony RUSSO, Joe RUSSO",
  "releaseDate":"25/04/2018",
  "type":"sci-fi"
}
```


## Goal

The Goal is to assert that the candidate has enough technical skills to : 
* Use Git and some basic commands
* Create a SpringBoot application with REST API from scratch
* Create a Client Application (Angular or else) from scratch
* Write Short and Clean Code. (Using for example JUnit)


## Requirements

### __Create the SpringBoot Application__

    1. Create a new GitHub Repository that you will send us.
    2. Create the SpringBoot Application.
    3. You will need to access to the movies.json file (read/write) (design your code in the best way you think it should be).
    4. You have to create a REST Controller to be able to list the movies.
    5. You have to create a REST Controller (or reuse the same) to be able to add/remove/update the list of movies.
    6. Each controller method will be tested individually

### __Create the Angular Single Page Application__

_(If the candidate does not know Angular, use the Framework of your choice)_
    
    1. You should use the most recent Framework versions.
    2. Create the White App.
    3. Add the BootStrap Framework (most recent one too).
    4. The application should have a menu with the following elements : 
        * home
        * list of movies
    5. The home page is just a description of the application.
    6. You have to create a route to display the list of movies in a Grid. 
    7. This grid should let user to sort the elements (1 level sort is enough).
    8. It should be allowed to add/update/delete a movie.
    9. The user should be allowed to search a movie by title, director, release date, type.
    9. These actions should interact with the movies.json file. To keep the state of the modifications.

### __Generic Specifications__

    1. Fill in the README.md file of your repo. 
       It must explain the project but also the way to compile/build/run it.
    2. The code needs to work after we pull and try it (no Bugs).
    3. Organisation and Design are the keys. Design something clean and understandable.
    4. The WebApplication should be as responsive as possible.

## __Bonus__

    1. Improve the movie element to be allowed to have several directors.
        * The Business Model
        * The GUI which displays it
        * The GUI which allows to update/add/delete a movie.
    2. Create models Type, Director so that the code will be easier to understand.
    3. Create a page for authors and movie types. 
        * Grid for the display.
        * Possibility to update the elements.
        * Modifications in the movies.json file.
        * Display the list of films of a Director (on Hover to its name for example).
    
