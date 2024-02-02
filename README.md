# Programming with Java

## Table of Contents

# Overview Of Java Programming Language

- **Java** was/is a simpler, safer version of **C++**.

- History of Java

  - **Java** was launched in 1991 when **James Gosling** and his team at Sun Microsystems began development on the language. **Java** was offered to the public in 1995 for usage in various applications ranging from the internet to computer programming.

- Why you should use Java for Backend Development:

  - **Scalability and Robustness**: Java has a robust type-checking mechanism that makes it durable. The **Java virtual machine** (JVM) enables dynamic linking and a secure environment, allowing Java to run anywhere. Java's automatic memory management and disposal collection make it highly scalable and these features help speed up web application development.

  - **Open Source Library**: There are many Java libraries for various uses, including logging, JSON parsing, unit testing, XML and HTML parsing, messaging, PDF and Excel reading, cryptography, and many others.

  - **Diversity**: Java has long been the dominant programming language for developing Web applications, Android applications, and software tools such as Eclipse, IntelliJ IDEA, NetBeans IDE, and others.

  - **Security**: Java reduces security concerns and dangers by reducing the use of explicit pointers. A pointer is a value that keeps the memory address of another value and can be exploited to gain unwanted memory access. This issue is solved by removing the concept of pointers.

  - **Platform Independency**: Java is platform-independent, which means it's a "Write Once, Run Anywhere" (WORA) language. The compiled code (the byte code of Java) is platform-independent and can run on any machine, irrespective of the operating system. We can run this code on any machine that supports the Java Virtual Machine (JVM)

  - **Multithreading Support**: Java is a multithreaded language, which means that multiple threads can run at the same time. A **thread** is a process's smallest unit. Multithreading allows us to maximize CPU use. Multiple threads share the same memory space, increasing the application's efficiency and performance.

- Some of the **drawbacks** of the Java include:

  - **Lack of Backup Facility**: Java is primarily concerned with storage and does not prioritize data backup. This is a huge drawback, and it is losing user interest and ratings as a result.

  - **Code Complexity**: Java code is extensive, which means it contains many words and long, complex sentences that are hard to read and comprehend. This reduces the code's readability.

  - **Speed and Performance Level**: Java consumes a large amount of memory and is substantially slower than native languages such as C or C++. This is partly because each bit of code must be interpreted into machine-level code. This slow performance is caused by the **JVM**'s additional level of compilation and abstraction.

  - **Memory Capacity**: When compared to other languages such as C and C++, Java uses a significant amount of memory. Memory efficiency and system performance may suffer during cleanup execution.

- Differences Between a **Java** Backend and a `Node.js` Backend

  - In terms of strengths, **Java** has the advantage of being a **statically-typed language**, which provides better performance and stability. **Node.js**, on the other hand, has the advantage of being a **dynamically-typed language**, which makes it easier to learn and more flexible.

  - **Java** also provides better security features, such as the **Java Virtual Machine** (JVM), which has memory protection and isolation. Java also has a large number of libraries and tools available, which makes it easier to develop and maintain large-scale applications.

  - `Node.js` is also well-suited for real-time applications, such as chat applications, thanks to its event-driven architecture. `Node.js` also has a large and active community, which provides a wealth of libraries and tools for various tasks.

# Features of Java

1. **Strong Static Typing** - when you declare a variable, you have to indicate its type.

   ```java
       int dataValue;
       dataValue = 10;

       int myVariable = 15;
   ```

2. **C-style syntax**. Apparently some people believe this is a good thing.
3. **Object oriented**
4. **Garbage collection**
5. **Fast in the right hands.**
6. **Portable**
7. **Easy to understand most of the time.**

# Concepts Of Java Programming Language

## 1. Java Development Kit (JDK)

- **JDK** is a set of software tools and libraries that allows developers to create **Java** applications.
- When you install **JDK**, the installation folder is often referred to as `JAVA_HOME`. All binaries are located inside `JAVA_HOME/bin` which includes `javac`, `java`, and other binaries and they must be in your system `PATH` in order to compile and execute Java programs.
- It is a fundamental requirement for developing Java applications because it provides the necessary components, including the:

  - Java Compiler
  - Java Runtime Environment (JRE)
  - Java Virtual Machine (JVM)
  - Java APIs

## 2. Java Compiler

- **JDK** includes a **Java compiler**, which translates human-readable Java code into machine-readable bytecode that can be executed on any device with a **JVM**.

## 3. Java Runtime Environment (JRE)

- The **JRE** is a part of the **JDK** that allows Java applications to run on various platforms.
- It includes the **JVM** and core Java class libraries that are required for running Java programs.

## 4. Java Virtual Machine (JVM)

- The **JVM** is a key component of the **JDK** that enables Java code to be executed on different platforms without the need for recompilation.
- It interprets the bytecode generated by the **Java compiler** and translates it into machine code for the specific platform on which it is running.
- **JVM** is responsible for converting bytecode into machine-specific code and that’s why you have different **JVM** for Windows, Linux, or Solaris but one **JAR** can run on all this operating system.
- **JVM** is at the heart of Java programming language and provides several features to Java programmers including:

  - Memory Management and
  - Garbage Collection,
  - Security, and other system-level services.

- If we supplied an invalid argument to java command it may refuse to create **JVM** by saying “failed to create Java virtual machine: invalid argument“.

### Remarks

- there are few differences between **JRE**, **JDK**, and **JVM**:
  - **JRE** and **JDK** come as installers while **JVM** is bundled with them.
  - **JRE** only contain environment to execute java program but doesn’t contain other tools for compiling java program.
  - **JVM** comes along with both **JDK** and **JRE** and created when you execute the Java program by giving the “java” command.
- **JDK** provides all the tools and executable require to compile debug and execute Java Program. Just like **JRE**, **JDK** is also platform-specific and you need to use separate installers for installing **JDK** on Linux and Windows.

# Java Automation Tools

- some of the Popular Java Automation Tools include:

  1. **Maven**

     - **Maven** is a build automation tool used primarily for Java projects. It provides developers with a way to manage project dependencies, build and test Java code, and package Java applications.
     - **Maven** assist with the following:

       - **Dependency management** - makes it easy to manage project dependencies by downloading and integrating them into the project. Developers can specify dependencies in a simple `XML` format, and Maven will automatically download the required libraries and add them to the project's classpath.
       - **Build automation**: Maven automates the build process by providing a standardized build lifecycle that includes compiling, testing, packaging, and deploying Java applications. Developers can define build goals in the project's configuration file, and Maven will automatically execute these goals in the specified order.
       - **Consistency and repeatability**: Maven ensures that builds are consistent and repeatable across different environments by using a standardized build process and managing dependencies. This makes it easier to share and distribute Java applications across different machines and environments.
       - **Integration with IDEs**: Maven integrates seamlessly with popular Java IDEs such as **Eclipse**, **IntelliJ IDEA**, and **NetBeans**. This allows developers to use Maven to manage project dependencies and build Java applications directly from their IDE.

     - Advantages include:
       - It promotes the idea of Convention over Configuration which makes it easy to understand the project.
       - automatic dependency management, you don't need to download each and every **JAR** file manually which your project needs,

  2. **Gradle**

     - **Gradle** offers similar functionality to **Maven**, but with a more flexible and customizable build system. Instead of `XML`, it uses **Groovy** to define its build file which is much more readable and concise
     - It uses **Groovy** as its build language, which allows developers to write build scripts that are easy to read and maintain.

  3. **Ant**

     - **Apache Ant** is a Java-based build tool that focuses on automation of software build processes. Ant uses XML-based configuration files to define build tasks, which can include compiling source code, running unit tests, and creating application archives.

  4. **Jenkins**

     - **Jenkins** is a popular open-source automation server that can be used to automate various tasks in a Java development project, such as:
       - building and testing code,
       - deploying applications, and
       - managing project workflows.
     - **Jenkins** offers a wide range of plugins that make it easy to integrate with other tools in the software development ecosystem.

  5. **Docker**
     - **Docker** is a containerization platform that allows developers to package applications and their dependencies into containers that can be easily deployed and run on any platform.
     - **Docker** can be used to automate the build and deployment process of Java applications, making it easier to manage the application's dependencies and infrastructure.

# Setting Up Java Development Environment

## 1. Setting Java Development Environment in Windows

1. Install [JDK](https://www.oracle.com/java/technologies/downloads/)

   - After the installation is complete, delete the downloaded file to recover disk space.

2. Set Up Environment Variables

   - Right-click on "This PC" or "My Computer" and select "Properties."
   - Click "Advanced system settings" and then "Environment Variables."
   - Under "System variables," click "New."
   - Create two variables:
     - Variable name: JAVA_HOME
     - Variable value: The path to your JDK installation directory (e.g., `C:\Program Files\Java\jdk-21\`)
   - Edit the PATH variable:
     - Find the PATH variable under "System variables" and click "Edit."
     - Add a semicolon (;) to the end of the existing path, followed by `%JAVA_HOME%\bin`.
   - Click "OK" on all windows to save the changes.

3. Choose and Install an IDE

   - Popular IDEs for Java
     - [IntelliJ Idea Community Edition](https://www.jetbrains.com/idea/download/?section=windows)
   - Run the installer and follow the instructions.

4. Test the setup

   - Open a command prompt or terminal window.
   - Type `java -version` and press Enter.
   - If the installation is successful, you'll see the Java version information. E.g.,

     ```sh
      java -version
      #java version "21.0.2" 2024-01-16 LTS
      #Java(TM) SE Runtime Environment (build 21.0.2+13-LTS-58)
      #Java HotSpot(TM) 64-Bit Server VM (build 21.0.2+13-LTS-58, mixed mode, sharing)
     ```

   - Create a simple Java program using your chosen IDE to further test the setup.a

## 2. Java Development Environment in VS Code

- Step 1:

  - Download and install [Java Development Kit]() (JDK).
  - You can download the **JDK** from the official [Oracle website]().

- Step 2:

  - After you finish **JDK** installation, please reload Visual Studio Code to make it effective.

- Step 3:

  - Install the [Java Extension Pack]() in VSCode.
  - This pack includes everything you need to develop Java applications in Visual Studio Code.

- Step 4:

  - Create a new Java project.
  - Open VS Code and create a new folder where you want to save your Java project. Then, open the Command Palette by pressing `Ctrl+Shift+P` shortcut key and type "`Java: Create Java Project`". Press Enter and select a location for the project. Choose a name for your project and select a **JDK** version to use.

- Step 5:

  - Create a Java file with "Hello World" code.
  - Once the project is created, open the `src` folder and create a new Java file with the name `HelloWorld.java`.
  - Copy and paste the following code into the file:

    ```java
        public class HelloWorld {
        public static void main(String[] args) {
            System.out.println("Hello, World!");
        }
    }
    ```

- Step 6:
  - Run the program.
  - Open the Command Palette and type "`Java: Run Java Program`" and press Enter.
  - This will run your program and the output "Hello, World!" should be displayed in the console.

# Writing, Compiling, and Running a Java Program

## Basic Syntax Rules

1. Program File Name
   - Name of the program file should exactly match the class name.
   - Note that in case you do not have a public class present in the file then file name can be different than class name. It is also not mandatory to have a public class in the file.
2. `main()` method which is a mandatory part of every Java program.
3. Write and open `MyFirstProgram.java` file:
   ```java
     // sample program
     public class MyFirstProgram {
         public static void main(String[] args) {
             System.out.println("My First Java Program");
         }
     }
   ```
   - The `main` method is the entry point of the Java program.
   - Compile the Java program by:
     ```sh
      # compile java program
      javac MyFirstProgram.java
     ```
   - This command will generate a bytecode file named "`MyFirstProgram.class`."
   - Execute the compiled Java program using the `java` command:
     ```sh
      # run the file
      java MyFirstProgram.java
     ```
4. Printing on Console

   - To print on console we use,

     ```java
         // Print in Console
         System.out.println();
     ```

   - `out` has some other methods. Some of them are:

     ```java
         System.out.print();
         System.out.printf();
     ```

## Components of a Java program

### 1. `public` Keyword

- is an access **modifier**, which specifies that the class is accessible from any other class. In Java, a class can be `public`, `package-private`(default, if no modifier is specified), `protected`, or `private`. The `public` modifier allows the class to be accessed from outside its package.

### 2. `class` Keyword

- `class` keyword is used to declare a class in Java.
- Class names in Java should start with a capital letter and follow **CamelCase** conventions.

### 3. `public static void main(String[] args)`

- This line declares the main method, which is the entry point of a Java application.
- `public`: The `main` method must be declared as `public` so that it can be accessed by the Java runtime system.
- `static` keyword indicates that the method belongs to the class itself rather than to an instance of the class. It allows the method to be called without creating an instance of the class.
- `void` keyword indicates that the `main` method does not return any value.
- `main`: This is the name of the method. The **JVM** looks for this specific method signature as the starting point of execution.
- `(String[] args)`: This is the parameter list for the main method. The `args` parameter allows you to pass command-line arguments to your Java program.

## Java Identifiers

- Names used for classes, variables, and methods are called **identifiers**.
- **Remarks**:
  - All identifiers should begin with a letter (A to Z or a to z), currency character ($) or an underscore (`_`).
  - After the first character, identifiers can have any combination of characters.
  - A key word cannot be used as an identifier.
  - Most importantly, identifiers are case sensitive.
  - Examples of legal identifiers: age, $salary, `_value`, `__1_value`.
  - Examples of illegal identifiers: 123abc, -salary.

# Java Garbage Collection

- **Garbage Collection** is the process by which Java performs automatic memory management. When Java programs run on **JVM**, objects are created on the **heap**. When some objects no longer needed. **Garbage Collection** will find the, delete them to free up memory.

# Resources

1. [JDK 21 Documentation](https://docs.oracle.com/en/java/javase/21/index.html)
2. [freeCodeCamp - How to Install Java in Ubuntu – JDK Linux Tutorial](https://www.freecodecamp.org/news/how-to-install-java-in-ubuntu/)
3. [Java Code Geeks - Difference between JVM, JIR, JRE, and JDK in Java](https://www.javacodegeeks.com/2020/08/difference-between-jvm-jir-jre-and-jdk-in-java.html)
4. [freeCodeCamp - How to Set Up Your Java Development Environment](https://www.freecodecamp.org/news/how-to-set-up-java-development-environment-a-comprehensive-guide/)
5. [How to Install OpenJDK (Free Java) – Multi OS Guide](https://www.freecodecamp.org/news/install-openjdk-free-java-multi-os-guide/)
