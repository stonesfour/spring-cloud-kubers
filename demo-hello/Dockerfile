# 版本信息
FROM primetoninc/jdk:1.8
MAINTAINER stonesfour "sunshilei@caicloud.io"


# change path to your repo dir
COPY ./demo-hello/target/demo-hello-0.0.1-SNAPSHOT.jar  /demo-hello.jar

EXPOSE 8080

CMD ["java", "-jar", "/demo-hello.jar"]
