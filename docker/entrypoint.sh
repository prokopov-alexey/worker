#!/bin/sh

export spring_profiles_active=cloud
exec java $JAVA_OPTS -jar /usr/app/app.jar
