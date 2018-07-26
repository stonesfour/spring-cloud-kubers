# 版本信息
FROM primetoninc/jdk:1.8
MAINTAINER stonesfour "sunshilei@caicloud.io"

# change path to your repo dir
COPY ./microservice-discovery-eureka/microservice-discovery-eureka-0.0.1-SNAPSHOT.jar  /microservice-discovery-eureka.jar

EXPOSE 8761

CMD ["java", "-jar", "/microservice-discovery-eureka.jar"]