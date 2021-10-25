FROM openjdk:8
WORKDIR /app/
COPY src/Main.java ./
RUN javac Main.java