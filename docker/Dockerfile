FROM adoptopenjdk/openjdk11:alpine-jre
COPY ./*.jar /usr/app/app.jar
COPY ./entrypoint.sh entrypoint.sh
RUN chmod +x entrypoint.sh

EXPOSE 8080

ENTRYPOINT ["/entrypoint.sh"]
