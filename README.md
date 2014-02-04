#Which Layout
Simple project to give a look at https://github.com/dieend/ADIN-Android-Split-Testing-Library

This project implements custom IADINSelector which give random value for splittest. You can run the application in your for several time to see it did changed.

Copy-Paste:
```
build.xml
libs/ADIN-Annotation.jar
libs/aspectjrt.jar 
otherlibs/*
```
to your project, and your project ready to use the ADIN.

To build with ADIN, you need ant installed.

To build and install to device, run `ant clean debug install`.

Eclipse Android Project and Ant Build doesn't work well together, so it's better to use command line to build and deploy.
