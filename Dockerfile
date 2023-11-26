FROM openjdk:17
EXPOSE 8071

ADD target/MSCommande-0.0.1-SNAPSHOT.jar MSCommande.jar
ENTRYPOINT ["java","-jar","MSCommande.jar"]