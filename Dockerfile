FROM frolvlad/alpine-oraclejdk8
VOLUME /tmp
ADD target/myapp.jar app.jar
ENV SPRING_PROFILES_ACTIVE production
ENTRYPOINT exec java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app.jar
