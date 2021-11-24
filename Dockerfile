FROM java:8
EXPOSE 8080
ARG JAR_FILE
ADD target/${JAR_FILE} /self-spring.jar
ENTRYPOINT ["java", "-jar","/self-spring.jar"]