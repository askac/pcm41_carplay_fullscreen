#!/bin/sh

if [ "$#" != "1" ]
then
	echo "Usage: $0 <target.jar>"
	exit
fi


jar cfv $1 de/audi/app/terminalmode/pgen2/PGen2TMConfiguration.class
