FROM openjdk:11-jre-slim
COPY . /usr/src/myapp
WORKDIR /usr/src/myapp
ENTRYPOINT ["java","-jar","/pokemon-0.0.1-SNAPSHOT.jar"]