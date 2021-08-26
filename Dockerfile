FROM openjdk:11

ADD  ./target/akidoc.jar akidoc.jar
EXPOSE 8085 
ENTRYPOINT ["java", "-jar", "akidoc.jar"]