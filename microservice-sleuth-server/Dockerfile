# 版本信息
FROM primetoninc/jdk:1.8
MAINTAINER stonesfour "sunshilei@caicloud.io"

# change path to your repo dir
COPY ./microservice-sleuth-server/target/microservice-sleuth-server-0.0.1-SNAPSHOT.jar  /microservice-sleuth-server.jar

EXPOSE 8761

CMD ["java", "-jar", "/microservice-sleuth-server.jar"]