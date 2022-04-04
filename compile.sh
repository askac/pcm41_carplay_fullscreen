#!/bin/sh

#CP=../MHI2_TW_POG24_K1103_lsd.jar         
SOURCE=1.4
TARGET=1.4

if [ "x$1" = "xclean" ]
then
	for x in $(find de -type f -name '*.class')
	do
		echo "delete $x"
		rm $x
	done
fi

echo "[[[ Compile with SOURCE=$SOURCE TARGET=$TARGET ]]]"
for x in $(find de/ -type f -name '*.java')
do
	if [ ! -f $(echo $x|sed s/.java$/.class/) ]
	then
		javac -source $SOURCE -target $TARGET $x
	else
		echo "... skip $x because $(echo $x|sed s/.java$/.class/) exists"
	fi
done
