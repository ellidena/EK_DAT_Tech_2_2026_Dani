# Use the official Maven image as the base image
FROM maven:3.9.12-eclipse-temurin-25 

# Set the working directory 
WORKDIR /app 

# Copy the pom.xml
COPY pom.xml .

# Copy the source code 
COPY src ./src 

# Build the application 
RUN mvn clean package -DskipTests 

# Set the entry point to run the application
ENTRYPOINT ["java", "-jar", "target/my-maven-app-1.0-SNAPSHOT.jar"]
