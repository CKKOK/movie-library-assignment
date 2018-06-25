# Movie Library Assignment

## Application Description
This application consists of a front-end running on Angular 6 as well as a back-end Spring Boot server. The server serves data in a `movies.json` file placed in the same directory as itself via a REST api exposed at `localhost:8080/movies`. The front-end shows the available data in a responsive grid of cards, and allows one to create, edit/update, and delete data. One may also sort the data according to its various fields, and search for specific data.

## Installation

### Running in development environment
1. In the `client` subfolder, run `npm install` to install the necessary dependencies.
2. The back-end server has been pre-compiled and can be run by going to the `server/target` directory and running `java -jar movielibrary-0.1.0.jar`. Should you wish to compile it after amendments, run `mvn package -f "./pom.xml"` in the `server` directory.
3. Start the front-end server by going to the `client` directory and running `ng serve`.
4. Go to `http://localhost:4200` to view the application.

Note: The back-end server listens at `http://localhost:8080` by default, and accepts calls from the front-end at `http://localhost:4200`. Should this change, the new addresses should be reflected at the relevant configurations at `globals.ts` and `MoviesController.java` respectively.

### Compiling for Production
0. Ensure that the domains of the server and client are set correctly in the respective files indicated above in order to avoid CORS errors when the client makes calls to the server.
1. Compile and run the `.jar` file as before.
2. Transpile the front-end scripts by running `ng build --prod --build-optimizer` in the `client` subfolder. Copy the generated files in the `client/dist/client` subfolder to the webroot of the deployment server. 


