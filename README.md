### Docker installation
1. run clean install
`mvn clean install`
2. Then create the build with docker compose to build docker image using built jar file.
`docker build -t spring-product.jar .`
3. Then use following command to start up all the project services (containers).
`docker-compose up`
4. To stop all the services in the terminal, run
`docker-compose down`