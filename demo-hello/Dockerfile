# 版本信息
FROM primetoninc/jdk:1.8
MAINTAINER stonesfour "sunshilei@caicloud.io"

RUN mkdir /var/target
#RUN cd  /var/tmp/webapp  && cp /var/tmp/webapp/war/sm_new.war /var/tmp/tomcat/apache-tomcat-8.5.8/webapps/
RUN cp target/demo-hello-0.0.1-SNAPSHOT.jar /var/target/

EXPOSE 8080

CMD ["java", "-jar", "target/demo-hello-0.0.1-SNAPSHOT.jar"]
