# # JAVA Academy: Java basico

## Introduction

In this course we analyzed a problem about the adoption system of pets. It was graphed as a uml diagram. This allowed us to developed it on java using the four pillars of OOP: abstraction, inheritance, encapsulation, and polymorphism, in five challenges.

## Getting Started

1. Clone this repository
2. Go download two versions of [IDK](https://adoptopenjdk.net/?variant=openjdk11&jvmVariant=hotspot). Version 8 and 11
3. Go download [IntelliJ IDEA](https://www.jetbrains.com/es-es/idea/download/#section=windows) 
4. Open the terminal of your choice
5. Follow the instruction for each challenge

## Dependencies

1. Terminal of your choice
2. [IDK](https://adoptopenjdk.net/?variant=openjdk11&jvmVariant=hotspot) version 8 and 11
3. [IntelliJ IDEA](https://www.jetbrains.com/es-es/idea/download/#section=windows)

## Instructions

**Exercise 1**

This exercise ask you how to change the Java version from your terminal and share the commands you executed. If the java version is 11, we will change to 8, or if it is 8, we will change to 11.

1. In your terminal with the comman `java -version` we see the version of java. In this case the version of java is *11.0.11*
2. With the command`set JAVA_HOME=` and add the rirectory in which is the version of your choice. For this case`set JAVA_HOME=C:\Program Files\AdoptOpenJDK\jdk-11.0.11.9-hotspot`
3. Then run the next comand `set PATH=%JAVA_HOME%\bin;%PATH%`
4. Finally lets check our new version with `java -version`


**Exercise 1 Output**

![Alt text](http://i.imgur.com/sZvEHb2.png?raw=true "JavaHome")

**Exercise 2**

This exercise was about print a message in jshell from your terminal.

1. In your terminal run the command `jshell`
2. Print your message with the next command `System.out.println("Hello World");`. We used *Hello World* as message

**Exercise 2 Output**

![Alt text](http://i.imgur.com/8cQ1oYh.png?raw=true "jshell")

