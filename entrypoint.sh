#!/bin/sh

cd /usr/local/tomcat/webapps/ROOT/WEB-INF || exit;
javac -classpath .:/usr/local/tomcat/lib/servlet-api.jar -d classes src/*

# Hand off to the CMD
exec "$@"