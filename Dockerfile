FROM openjdk:8
EXPOSE 8080
ADD target/demokubectl-1-0.0.1-SNAPSHOT.jar demokubectl-1-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/demokubectl-1-0.0.1-SNAPSHOT.jar"]