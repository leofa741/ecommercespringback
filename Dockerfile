FROM openjdk:17.0.2

WORKDIR /app

COPY ./target/ecomerce-spring-java-0.0.1-SNAPSHOT.jar .

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "ecomerce-spring-java-0.0.1-SNAPSHOT.jar"]

