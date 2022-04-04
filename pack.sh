#!/bin/sh

if [ "$#" != "1" ]
then
	echo "Usage: $0 <target.jar>"
	exit
fi


jar cfv $1 $(find de -type f -name '*.class')
