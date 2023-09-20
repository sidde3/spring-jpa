# Simple SpringBoot JPA Application
## Build Process
This application is encrypted using Jasypt. Execute the following to build. 
````shell
mvn clean package -Djasypt.encryptor.password=secret
````

## Execution Process
````shell
java -Djasypt.encryptor.password=secret -jar target/spring-jms.jar
````