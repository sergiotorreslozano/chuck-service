FROM frolvlad/alpine-oraclejdk8:slim
VOLUME /tmp
WORKDIR /app
ADD /target/chuck-service-0.1.0.jar /app/app.jar
RUN sh -c 'touch /app/app.jar'
EXPOSE 7070
ENV JAVA_OPTS=""
#ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app.jar" ]
CMD [ "sh", "-c", "java $JAVA_OPTS -Xmx256m -Djava.security.egd=file:/dev/./urandom -jar /app/app.jar" ]