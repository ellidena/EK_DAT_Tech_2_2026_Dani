# Use the official Maven image as the build stage
FROM maven:3.9.12-eclipse-temurin-25 AS build

# Set the working directory 
WORKDIR /app 

# Copy the pom.xml
COPY pom.xml .

# Copy the source code 
COPY src ./src 

# Build the application 
RUN mvn clean package -DskipTests

# Use a smaller base image for the runtime stage
FROM eclipse-temurin:25-jre-alpine

WORKDIR /app

# Copy the built JAR file from the build stage 
COPY --from=build /app/target/*.jar ./app.jar

# Set the entry point to run the application
ENTRYPOINT ["java", "-jar", "app.jar"]
