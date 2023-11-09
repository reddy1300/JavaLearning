# JavaLearning

**JDK** - JDK stands for Java Development Kit, and it's the software that is used to create and run Java Programs.

-JAVA is language and JDK is which we used to write programs.

-We run JAVA programs with a Java Virtual Machine(JVM) with Java runtime edition(JRE).

-We have to use JAVA Long Term Support(LTS) version. that is intended to last for years and is fully supported 
(and updated) throughout those years.

* Oracle, the owners of Java, have publicly stated they will support(Java 17 LTS) it till at least 2029.

**JDK 17 Installation**

**Windows:**
* Go to URL - java.sun.com [https://www.oracle.com/java/technologies/](https://www.oracle.com/java/technologies/)
* Download latest JDK LTS version.
* Download x64 Installer.

**MAC:**
* Go to URL - java.sun.com [https://www.oracle.com/java/technologies/](https://www.oracle.com/java/technologies/)
* Download latest JDK LTS version.
* If we are using Apple silicon chip (M1 or M2) - We have to download Arm 64 DMG installer.
* If we are using Intell chip - We have to download x64 DMG installer.

**Linux: (Ubuntu)**
* Open Terminal - sudo apt update - To update packages.
* sudo apt install -y openjdk-17-jdk.
* java - version

**Intellij IDE(Integrated Development Environment):**
* We can write java programs in any text edit tool's. like Notepad and Notepad++ etc. but in these tools it is not 
  easy to read code and formatting also not good. so we are going to use any one of the IDE to make our life easy.
* Uses: Formatting, Code completion, error detection, etc

**CMD:** We can directly interact with JAVA from CMD also. When we type java and enter in CMD it will show different 
  options.

- We can run java code from Jshell.
- Jshell become a standard component of the Java Developers Kit in JAVA 9.
- It is what is known as a Read-Eval-Print-Loop interactive program (or REPL for short).
  * It **reads** the command or code segment we type in.
  * It **evaluates** and executes the code, and often allows shortcuts to be used.
  * It **prints** out the result of the evaluation or execution, without making the developer write code to output the 
    results.
  * Lastly, it loops right back for more input (more code segments or commands).

Jshell runs in a terminal (or on the command line for windows) and is useful for quickly trying out new ideas.
 - [https://docs.oracle.com/en/java/javase/17/jshell/introduction-jshell.html#GUID-630F27C8-1195-4989-9F6B-2C51D46F52C8](https://docs.oracle.com/en/java/javase/17/jshell/introduction-jshell.html#GUID-630F27C8-1195-4989-9F6B-2C51D46F52C8)

**CMD (JShell):**
- jshell  - open jshell prompt
- /help intro - Display Jshell introductory information.
- /help  - Display all commands present in JShell.
- /list -all - Display built-in code or Libraries of code, that Jshell includes in its environment.
- To write multiple lines of code we can use {}.