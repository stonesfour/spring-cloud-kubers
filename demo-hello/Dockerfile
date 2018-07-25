# 版本信息
FROM primetoninc/jdk:1.8
MAINTAINER stonesfour "sunshilei@caicloud.io"


# change path to your repo dir
COPY ./target/demo-hello-0.0.1-SNAPSHOT.jar  /demo-hello.jar

EXPOSE 8088

CMD ["java", "-jar", "/demo-hello.jar"]
