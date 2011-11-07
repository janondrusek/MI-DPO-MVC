#!/bin/bash
WHICH="`which which`"
JAVA="`${WHICH} java`"

JAR="target/mvc.jar"

if [[ -z ${JAVA} ]]
then
	echo -n "!!! JVM not found !!!" 
else
	echo -n "Running using: ${JAVA} path"  
	eval "${JAVA} -version" 
	eval "${JAVA} -jar ${JAR}"
fi
