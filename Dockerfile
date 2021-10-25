FROM openjdk:8
WORKDIR /app/src/
COPY Main.java ./
RUN javac Main.java