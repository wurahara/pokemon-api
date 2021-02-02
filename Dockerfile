FROM openjdk:11-jre-slim
ARG DB_URL
COPY . /usr/src/myapp
WORKDIR /usr/src/myapp
ENTRYPOINT [
    "java","-jar","/usr/src/myapp/build/libs/pokemon-0.0.1-SNAPSHOT.jar"
]
