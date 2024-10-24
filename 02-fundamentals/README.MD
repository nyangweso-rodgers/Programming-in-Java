# Java Fundamentals

## Table of Contents

# Java `Main` Method

- Example:

  ```java
    public class MainClass {
      public static void main(String[] args) {
        System.out.println("Hello World!");
    }}
  ```

- `public`: access modifier that makes the class and method accessible from outside the package.
- `class`: keyword used to declare a class. Classes are blueprints used to represnt anything in software and real-world.
- `MainClass`: this is the name of the class.
- `public`: Keyword indicating that the method or variable belongs to the class itself rather than the instance.
- `static`: method belongs to the class itself rather than the instance.
- `main`: main is Java's entry point where the program starts executing
- `void`: return type indicating that the method does not return any value.
- `String[] args`: Command-line arguments to the program when it's executed.
- `System.out.println`: Prints the string `Hello World!` followed by a new line to the console.

# Package Declarations

- At top of the java file we declare package name. We use package keyword to declare a package like..

  ```java
      package org.example;
  ```

# Java Methods

- In Java, a **method** is a set of statements that perform a certain action and are declared within a class.
- Syntax:
  ```java
    acessSpecifier returnType methodName(parameterType1 parameterName1, parameterType2 parameterName2, ...) {
      // Method body - statements to perform a specific task
      // Return statement (if applicable)
  }
  ```
  - where:
    - `accessSpecifier`: defines the visibility or accessibility of classes, methods, and fields within a program.
    - `returnType`: the data type of the value that the method returns. If the method does not return any value, the `void` keyword is used.
    - `methodName`: the name of the method, following Java naming conventions.
    - `parameter`: input value that the method accepts. These are optional, and a method can have zero or more parameters. Each parameter is declared with its data type and a name.
    - **method body**: the set of statements enclosed in curly braces `{}` that define the task the method performs.
    - **return statement**: if the method has a return type other than `void`, it must include a `return` statement followed by the value to be returned.
- Example:

  ```java
    public class SimpleMethodExample {

      // Method that takes two integers and returns their sum
      public static int addNumbers(int a, int b) {
          int sum = a + b;
          return sum;
      }

      public static void main(String[] args) {
          // Calling the method and storing the result
          int result = addNumbers(5, 7);

          // Printing the result
          System.out.println("The sum is: " + result);
      }
  }
  ```

  - Here, the `addNumbers` method takes two integers as parameters (`a` and `b`), calculates their sum, and returns the `result`. The `main` method then calls this method and prints the result.
  - Compile the Java code using the terminal, using the `javac` command:
    ```sh
      javac SimpleMethodExample.java
    ```

- **Remarks**:
  - **Methods** facilitate code reusability by encapsulating functionality in a single block. You can call that block from different parts of your program, avoiding code duplication and promoting maintainability.

# Types of Access Specifiers in Java

- **Access specifiers** control the visibility and accessibility of class members (fields, methods, and nested classes).
- There are typically four main types of access specifiers: `public`, `private`, `protected`, and `default`. They dictate where and how these members can be accessed, promoting encapsulation and modularity.

## 1. Public (`public`)

- This grants access to the member from anywhere in your program, regardless of package or class. It's suitable for widely used components like utility functions or constants.
- Syntax:
  ```java
    public class MyClass {
      public int pulicField;
      public void publicMethod() {
        // Method Implementation
      };
    }
  ```
- Example:

  ```java
    // File: MyClass.java

    // A class with public access specifier
    public class MyClass {
      // Public field
      public int publicField = 10;

      // public method
      public void publicMethod() {
        System.out.println("This is a public method.");
      }

      // Main method to run the program
      public static void main(String[] args) {
        // Creating an object of MyClass
        MyClass myObject = new MyClass();

        // Accessing the public field
        System.out.println("Public Field: " + myObject.publicField);

        // Calling the public method
        myObject.publicMethod();
      }
    };
  ```

  - Here:
    - `MyClass` class is declared with the `public` modifier, making it accessible from any other class.
    - `publicField` is a public field that can be accessed from outside the class.
    - `publicMethod()` is a public method that can be called from outside the class.
    - The `main` method is the entry point of the program, where an object of `MyClass` is created, and the public field and method are accessed.

## 2. Private (`private`)

- This confines access to the member **within the class** where it's declared. It protects sensitive data and enforces encapsulation.
- Syntax:
  ```java
    public class MyClass {
      private int privateField;
      private void privateMethod(){
        // method Implementation
      }
    }
  ```

## 3.Protected ( `protected`)

## 4. Default (`Package-Private`)

# Resources
