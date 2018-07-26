# 版本信息
FROM primetoninc/jdk:1.8
MAINTAINER stonesfour "sunshilei@caicloud.io"


# change path to your repo dir
COPY ./demo-hello1/target/demo-hello1-0.0.1-SNAPSHOT.jar  /demo-hello1.jar

EXPOSE 8081

CMD ["java", "-jar", "/demo-hello1.jar"]
