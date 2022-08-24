# For Java 11, try this
FROM adoptopenjdk/openjdk11:alpine-jre
# Refer to Maven build -> finalName
ARG JAR_FILE=target/springboot-product.jar
# cd /opt/app
WORKDIR /opt/app
# cp target/springboot-product.jar /opt/app/app.jar
COPY ${JAR_FILE} app.jar
# change docker Port
EXPOSE 9990
# java -jar /opt/app/app.jar
ENTRYPOINT ["java","-jar","app.jar"]


