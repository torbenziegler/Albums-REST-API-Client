FROM gradle:7-jdk11 AS build
COPY --chown=gradle:gradle . /home/gradle/src
WORKDIR /home/gradle/src
RUN gradle shadowJar --no-daemon

FROM openjdk:11
EXPOSE 8100:8100
RUN mkdir /app
COPY --from=build /home/gradle/src/build/libs/*.jar /app/ktor-albums-0.0.1-all.jar
ENTRYPOINT ["java","-jar","/app/ktor-albums-0.0.1-all.jar"]