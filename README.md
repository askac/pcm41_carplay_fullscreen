# Porsche PCM 4.1 Carplay Full Screen hack. (Also works on Bentley BYG24)

Full screen hack for PCM4.1 (POG24 in train string)<br>
It should also work on Bentley BYG24 MU.<br>

You have to install JDK 1.8 for compiling.<br>
~~Also you need lsd.jxe from /ifs/lsd.jxe and convert it to jar.<br>~~
~~(There are some projects jxe2jar on github doing this. e.g. [https://github.com/spacemeowx2/jxe2jar](https://github.com/spacemeowx2/jxe2jar))~~

Compile it by using compile.sh, make jar with pack.sh (also you can check the jar command inside)<br>
Please not the jar should contains 1 class, other class are stub for compiling.<br>
Or you can use my precompiled jar.<br><br>

Put the jar to /mnt/app/eso/hmi/lsd/jars<br>
And it sould work.<br><br>

Tested on MHI2_TW_POG24_P08xx and higher<br>

![Result Example](https://github.com/askac/pcm41_carplay_fullscreen/raw/main/photo_2022-04-04_12-46-53.jpg)

Also full screen+ (i.e. No original widget buttons and status bar) hack can be done with more complex modification.
PCM5 can also be hacked with similar but more complex way.

I have no plan to public them now.
