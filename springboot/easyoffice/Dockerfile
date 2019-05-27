#Before create dockerfile, run mvn package to generate Jar

#docker build -t waterkcorp/easyoffice-spring .

#docker run --name easyoffice-spring -p 8080:8080 waterkcorp/easyoffice-spring

# Start with a base image containing Java runtime
FROM openjdk:8-jdk-alpine

# Add Maintainer Info
LABEL maintainer="rafaelwaterkemper@gmail.com"

# Add a volume pointing to /tmp
VOLUME /tmp

# Make port 8080 available to the world outside this container
EXPOSE 8080

# The application's jar file
ARG JAR_FILE=target/easyoffice-0.0.1-SNAPSHOT.jar

# Add the application's jar to the container
ADD ${JAR_FILE} easyoffice.jar

# Run the jar file
ENTRYPOINT ["java","-jar","./easyoffice.jar"]