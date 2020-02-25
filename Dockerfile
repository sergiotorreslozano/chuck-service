FROM openjdk:8-alpine
VOLUME /tmp
WORKDIR /app
ADD /target/chuck-service-0.1.0.jar /app/app.jar
RUN sh -c 'touch /app/app.jar'
EXPOSE 7070
ENV JAVA_OPTS=""
CMD [ "sh", "-c", "java $JAVA_OPTS -Xmx256m -Djava.security.egd=file:/dev/./urandom -jar /app/app.jar" ]