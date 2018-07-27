# 版本信息
FROM primetoninc/jdk:1.8
MAINTAINER stonesfour "sunshilei@caicloud.io"

# change path to your repo dir
COPY ./microservice-hystrix-turbine/target/microservice-hystrix-turbine-0.0.1-SNAPSHOT.jar  /microservice-hystrix-turbine.jar

EXPOSE 8761

CMD ["java", "-jar", "/microservice-hystrix-turbine.jar"]
