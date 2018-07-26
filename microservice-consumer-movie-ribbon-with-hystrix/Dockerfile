# 版本信息 
FROM primetoninc/jdk:1.8
MAINTAINER stonesfour "sunshilei@caicloud.io"

# change path to your repo dir
COPY ./microservice-consumer-movie-ribbon-with-hystrix/target/microservice-consumer-movie-ribbon-with-hystrix-0.0.1-SNAPSHOT.jar  /microservice-consumer-movie-ribbon-with-hystrix.jar

EXPOSE 8010

CMD ["java", "-jar", "/microservice-consumer-movie-ribbon-with-hystrix.jar"]