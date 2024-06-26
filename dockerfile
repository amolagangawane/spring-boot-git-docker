FROM openjdk:17-oracle
EXPOSE 8082
ADD target/practice-jpa-0.0.1-snapshot.jar practice-jpa-0.0.1-snapshot.jar
ENTRYPOINT ["java","-jar","/practice-jpa-0.0.1-snapshot.jar"]