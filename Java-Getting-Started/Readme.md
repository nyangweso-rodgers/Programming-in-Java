# Java - Getting Started

## Table of Contents

- [Further Reading]()
  1. [freecodecamp - How to Set Up Your Java Development Environment](https://www.freecodecamp.org/news/how-to-set-up-java-development-environment-a-comprehensive-guide/)
  2. [Java Code Geeks - Difference between JVM, JIR, JRE, and JDK in Java](https://www.javacodegeeks.com/2020/08/difference-between-jvm-jir-jre-and-jdk-in-java.html)

# Difference between JVM, JIR, JRE and JDK

- there are few differences between JRE, JDK, and JVM:
  - **JRE** and **JDK** come as installers while **JVM** is bundled with them.
  - JRE only contain environment to execute java program but doesn’t contain other tools for compiling java program.
  - JVM comes along with both JDK and JRE and created when you execute the Java program by giving the “java” command.

## Java Run-time (JRE)

- Java code is bundeled in JAR (Java archive) file requires Java Virtual Machine (JVM) to execute it.
- Now **JVM** is an executable or program like any other program and you can install that into your machine. You have seen browsers often suggesting download **JRE** run a Java Applet downloaded from the Internet.

## Java Virtual Machine (JVM)

- When you download **JRE** and install on your machine you got all the code required to create **JVM**. Java Virtual Machine is get created when you run a java program using java commands like java HelloWorld.

- **JVM** is responsible for converting byte code into machine-specific code and that’s why you have different **JVM** for Windows, Linux, or Solaris but one JAR can run on all this operating system.

- **JVM** is at the heart of Java programming language and provides several features to Java programmers including:

  - Memory Management and
  - Garbage Collection,
  - Security, and other system-level services.

- If we supplied an invalid argument to java command it may refuse to create **JVM** by saying “failed to create Java virtual machine: invalid argument“.

## Java Development Kit (JDK)

- **JDK** provides all the tools and executable require to compile debug and execute Java Program. Just like **JRE**, **JDK** is also platform-specific and you need to use separate installers for installing **JDK** on Linux and Windows.

- When you install **JDK**, the installation folder is often referred to as JAVA_HOME. All binaries are located inside JAVA_HOME/bin which includes javac, java, and other binaries and they must be in your system PATH in order to compile and execute Java programs.

# How To Set Up Java Development Environment

## How to Install the Java Development Kit (JDK)

- **JDK** includes **Java Runtime Environment** (JRE) as well as development tools like the Java compiler and debugger.
- Instllation steps:
  1. download the latest version of JDK from [official Oracle website](https://www.oracle.com/java/technologies/downloads/)
  2. run the installer
  3. after installation, set the `JAVA_HOME` environment variable to the JDK installation directory

## How to Set the `JAVA_HOME` Environment Variable

### Know the JDK Installation Directory

- The first step you need to take before setting the `JAVA_HOME` environment variable, is to know the installation directory of the **JDK**. Take note of the path where the JDK is installed on your machine.

### How to Access Environment Variables

- To access the environment variables on your machine:
  1. On Windows: Right-click on the "This PC" or "My Computer" icon on your desktop or File Explorer and select "Properties." In the System window, click on "Advanced system settings" on the left-hand side. You can now copy the environment variables.

  2. On macOS: Go to "System Preferences" and click on "Security & Privacy." Then, click on the "Privacy" tab and select "Full Disk Access" from the left-hand side. Click on the lock icon at the bottom left and enter your password to make changes. Now, you can copy the environment variables.

### Set the `JAVA_HOME` Environment Variable

- On Windows

  1.  In the System Properties window, click on the "Environment Variables" button.
  2.  In the "System Variables" section, click on the "New" button.
  3.  Set the "Variable name" as `JAVA_HOME`.
  4.  In the "Variable value" field, enter the path to the JDK installation directory. For example, if the JDK is installed in "C:\Program Files\Java\jdk1.8.0_XXX" (where XXX represents the specific update number), enter that path.
  5.  Click "OK" to save the changes.

- On macOS:
  1.  In the System Preferences window, click on "Security & Privacy" and navigate to the "Privacy" tab.
  2.  Scroll down and select "Full Disk Access" from the left-hand side.
  3.  Click on the "+" button and navigate to the Applications > Utilities folder.
  4.  Open the "Terminal" application and click "Open."
  5.  In the Terminal, enter the following command:
      ```sh
        echo export JAVA_HOME=/Library/Java/JavaVirtualMachines/{JDK_VERSION}/Contents/Home >> ~/.bash_profile
      ```
      Replace {`JDK_VERSION`} with the actual version number of the installed **JDK** without the curly braces {}.

## Verify the `JAVA_HOME` Environment Variable

- To ensure that the `JAVA_HOME` environment variable is set correctly, open a new terminal or command prompt window and enter the following command:
- For Windows
  ```sh
    echo %JAVA_HOME%
  ```
- For macOS
  ```sh
    echo $JAVA_HOME
  ```
- The command above should display the path to the JDK installation directory that you previously set.

## Choose an Integrated Development Environment (IDE)

### How to Configure Your IDE

#### Set the JDK

- You'll need to point your **IntelliJ** to the **JDK** installation directory so that it uses the correct Java version for compilation and execution.
