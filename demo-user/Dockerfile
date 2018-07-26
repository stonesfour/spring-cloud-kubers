# 版本信息
FROM primetoninc/jdk:1.8
MAINTAINER stonesfour "sunshilei@caicloud.io"

# change path to your repo dir
COPY ./demo-user/target/demo-user-0.0.1-SNAPSHOT.jar  /demo-user.jar

EXPOSE 9900

CMD ["java", "-jar", "/demo-user.jar"]