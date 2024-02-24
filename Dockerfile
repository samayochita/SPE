FROM openjdk:11
WORKDIR /app
COPY target/SPE-1.0-SNAPSHOT.jar  /app/SPE-1.0-SNAPSHOT.jar
# CMD sed -i 's/\r$//' /app/calculator.sh
