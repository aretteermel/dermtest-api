# Getting Started
This is test assignment by Arette Ermel

### Running app locally
* Run `dermtest-api [clean]` if necessary, NB! it cleans database
* Run `dermtest db`
* Run `dermtest-api [install]`
* Run `DermtestApiApplication-dev`

You can also run application in terminal after successful Maven clean & install
* docker compose up -d --no-deps --build db
* java -jar target/dermtest-api-0.0.1-SNAPSHOT.jar --spring.profiles.active=dev
* java -jar target/dermtest-api-0.0.1-SNAPSHOT.jar --spring.profiles.active=prod

### Application functionality
* When starting application you have empty database with created table 'doctor'
* You can add, get, edit and delete doctor's data