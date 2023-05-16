# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor.
FROM amazoncorretto:11-alpine-jdk
MAINTAINER Marcos
COPY target/MarcosArguello-0.0.1-SNAPSHOT.jar MarcosArguello-app.jar
ENTRYPOINT ["java","-jar","/MarcosArguello-app.jar"]

CMD ["/bin/sh"]
