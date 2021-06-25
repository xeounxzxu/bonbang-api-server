FROM rtfpessoa/ubuntu-jdk8

RUN mkdir webapp

COPY build/libs/middleware-0.0.1-SNAPSHOT.jar ./webapp/middleware-0.0.1-SNAPSHOT.jar

ENV JAVA_OPS=""

ENTRYPOINT ["java" , "-Djasypt.encryptor.password=middle12345!!","-jar" , "./webapp/middleware-0.0.1-SNAPSHOT.jar"]
