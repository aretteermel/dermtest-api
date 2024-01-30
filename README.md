# Test assignment
This is test assignment by Arette Ermel

## Running app locally
* Run `dermtest-api [clean]` if necessary
* Run `dermtest_db`
* Run `dermtest-api [install]`
* Run `DermtestApiApplication-dev`

You can also run application in terminal after successful Maven clean & install
* docker compose up -d --no-deps --build db
* java -jar target/dermtest-api-0.0.1-SNAPSHOT.jar --spring.profiles.active=dev
* java -jar target/dermtest-api-0.0.1-SNAPSHOT.jar --spring.profiles.active=prod

## Application functionality
* When you first start application you have empty database with created table 'doctor'
* You can add, get, edit and delete doctor's data

## Project Tasks Documentation
1. Add Lombok
   * **Description:** Integrated Lombok library.
   * **Solution:** Added Lombok dependency to the project and used @Data annotation in data model Doctor for reducing boilerplate code.
   * **Time Taken**: About 0.5 hours.
2. Create Runnable Docker Image
   * **Description:** Configured the project to be runnable as a Docker container.
   * **Solution:** I created a Docker Compose file (`docker-compose.yml`) to define a service (`db`) using a PostgreSQL Docker image. This service sets up a PostgreSQL database named `dermtest` and creates a `doctor` table with specified columns using the `init.sql` file. The `init.sql` file contains SQL statements to create the `dermtest` database and the `doctor` table.
   * **Time Taken:** About 3 hours.
3. Add log4j
   * **Description:** Integrated log4j for logging in the application.
   * **Solution:** Added log4j dependencies and configured the logging properties in DermtestApiApplication for INFO message in console when starting application.
   * **Time Taken:** About 0.5 hours.
4. Add Two Different Configurations for Prod and Dev
   * **Description:** Implemented separate configurations for production and development environments.
   * **Solution:** Created application-prod.properties and application-dev.properties files with different welcome message, port and database properties. But since the prod environment does not have actual datasource url deployed then it fails to start application with prod profile.
   * **Time Taken:** About 2.5 hour.
5. Create Data Model
   * **Description:** Defined a data model Doctor with relevant attributes.
   * **Solution:** Created a Java class with appropriate annotations.
   * **Time Taken:** About 0.5 hours.
6. Create One CRUD-Based Controller with Input/Output JSON
   * **Description:** Developed a controller for CRUD operations, handling JSON input/output.
   * **Solution:** Implemented Spring MVC controller methods for Create, Read, Update, and Delete operations for Doctor data model.
   * **Time Taken:** About 3 hours.
7. Create One JPA Repository for Connecting to Database
   * **Description:** Configured a JPA repository for interacting with the database.
   * **Solution:** Utilized Spring Data JPA to create a repository interface. I simplified the implementation of common database operations with JPA. `DoctorService` class provides methods to interact with the database using the injected `DoctorRepository`. The methods include retrieving, adding, updating, and deleting Doctor entities.
   * **Time Taken:** About 1 hours.
8. Testing Controller, Service and Repository
   * **Time Taken:** About 1.5 hours.
   
**Total Time Spent:** 12.5 hours.