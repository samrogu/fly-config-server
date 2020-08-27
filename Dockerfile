FROM openjdk:14.0.2-jdk
ADD target/*.jar /fly-config-server.jar
VOLUME /tmp
ENTRYPOINT ["java","-jar","/fly-config-server.jar"]