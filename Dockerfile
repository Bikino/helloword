FROM openjdk:8
ADD target/helloword-0.0.1-SNAPSHOT.jar helloword-0.0.1-SNAPSHOT.jar
EXPOSE 8001
CMD ["java","-jar","/helloword-0.0.1-SNAPSHOT.jar"]