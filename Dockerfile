FROM openjdk:17
COPY target/SPE-1.0-SNAPSHOT.jar  /app/SPE-1.0-SNAPSHOT.jar
# CMD sed -i 's/\r$//' /app/calculator.sh