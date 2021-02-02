FROM openjdk:11-jre-slim

ARG DB_URL
ARG DB_PORT
ARG DB_USER
ARG DB_PASS

ENV ENV_DB_URL ${DB_URL}
ENV ENV_DB_PORT ${DB_PORT}
ENV ENV_DB_USER ${DB_USER}
ENV ENV_DB_PASS ${DB_PASS}

COPY . /usr/src/myapp
WORKDIR /usr/src/myapp
ENTRYPOINT ["java",\
    "-jar", "/usr/src/myapp/build/libs/pokemon-0.0.1-SNAPSHOT.jar",\
    "-Dspring.profiles.active=prod"\
]
