# Java Fundamentals

# Basic Syntax Rules

1. Program File Name
   - Name of the program file should exactly match the class name.
   - Note that in case you do not have a public class present in the file then file name can be different than class name. It is also not mandatory to have a public class in the file.
2. `main()` method which is a mandatory part of every Java program.

# First Java Program, Hello World!

- Write and open `HelloWorld.java` file:
  ```java
    public class HelloWorldProgram {
    public  static void main(String []args) {
        System.out.println("Hello world java!");
    }
  }
  ```
- Code defines a class named `HelloWorldProgram` with a `main` method. The `main` method is the entry point of the Java program, and it prints "`Hello, world java!`" to the console using `System.out.println()`.
- To compile the Java program using the `javac` command
  ```sh
    javac HelloWorldProgram.java
  ```
  - This command will generate a bytecode file named "`HelloWorldProgram.class`."
- Execute the compiled Java program using the `java` command:
  ```sh
    java HelloWorldProgram.java
  ```
- Components of the program include:
  - `public` Keyword: is an access **modifier**, which specifies that the class is accessible from any other class. In Java, a class can be `public`, `package-private`(default, if no modifier is specified), `protected`, or `private`. The `public` modifier allows the class to be accessed from outside its package.
  - `class` Keyword: is used to declare a class in Java. In this case, the class is named `HelloWorldProgram`.
  - `HelloWorldProgram`: This is the name of the class. Class names in Java should start with a capital letter and follow CamelCase conventions.
  - `public static void main(String[] args)`: This line declares the main method, which is the entry point of a Java application.
    - `public`: The `main` method must be declared as `public` so that it can be accessed by the Java runtime system.
    - `static` keyword: indicates that the method belongs to the class itself rather than to an instance of the class. It allows the method to be called without creating an instance of the class.
    - `void` keyword indicates that the `main` method does not return any value.
    - `main`: This is the name of the method. The Java Virtual Machine (JVM) looks for this specific method signature as the starting point of execution.
    - `(String[] args)`: This is the parameter list for the main method. The `args` parameter allows you to pass command-line arguments to your Java program.

# Java Identifiers

- Names used for classes, variables, and methods are called **identifiers**.
- **Remarks**:
  - All identifiers should begin with a letter (A to Z or a to z), currency character ($) or an underscore (`_`).
  - After the first character, identifiers can have any combination of characters.
  - A key word cannot be used as an identifier.
  - Most importantly, identifiers are case sensitive.
  - Examples of legal identifiers: age, $salary, `_value`, `__1_value`.
  - Examples of illegal identifiers: 123abc, -salary.

# Package Declarations

- At top of the java file we declare package name. We use package keyword to declare a package like..

  ```java
      package org.example;
  ```

# Printing on Console

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
