# Spring boot application that returns Chuck jokes

Dummy service to get some Chuck jokes


To run the job, please follow the next steps:

0- Prerequisites
```
1- To run the application locally you need to have Java 8 & Maven 3 installed

2- To build the Docker image locally you'll need Docker installed  
``` 

1- Clone repository

2- Compile and package the application

```
mvn clean package
```
You should see something like at the end of the compilation
```
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
```

3- Run the application locally
```
 java -jar ./target/chuck-service-0.1.0.jar
```

You should see something like:
```
2020-07-02 11:33:46.402  INFO 10240 --- [           main] c.chuck.service.ChuckServiceApplication  : Started ChuckServiceApplication in 7.243 seconds (JVM running for 7.599)
```

4- Confirm that the application is running
```
curl http://localhost:7070/chuck
``` 
Something like this should be displayed:
```
{"id":18,"fact":"When Chuck Norris enters a room, he doesn’t turn the lights on, he turns the dark off"}
```
Note: The joke may be different :)  