# 版本信息
FROM primetoninc/jdk:1.8
MAINTAINER stonesfour "sunshilei@caicloud.io"


# change path to your repo dir
COPY ./microservice/target/microservice-discovery-eureka-0.0.1-SNAPSHOT.jar  /eureka.jar

EXPOSE 8761

CMD ["java", "-jar", "/eureka.jar"]
