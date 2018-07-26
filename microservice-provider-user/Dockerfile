# 版本信息
FROM primetoninc/jdk:1.8
MAINTAINER stonesfour "sunshilei@caicloud.io"

#默认安装jdk

#拷贝 编译包 指定路径
COPY ./microservice-provider-user/microservice-provider-user-0.0.1-SNAPSHOT.jar /microservice-provider-user.jar
#指定端口
EXPOSE 8080

#运行启动
CMD ["java", "-jar", "/microservice-provider-user.jar"]

