FROM tomcat:8-jre8

COPY ./demo/target/*.jar /usr/local/tomcat/webapps
