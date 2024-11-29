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
- There are typically four main types of access specifiers:
  1.  `public`
  2.  `private`
  3.  `protected`, and
  4.  `default`. They dictate where and how these members can be accessed, promoting encapsulation and modularity.
- How to choose the right access specifier:
  1. **Public**: Use for widely used components, interfaces, and base classes.
  2. **Private**: Use for internal implementation details and sensitive data protection.
  3. **Default**: Use for helper methods or components specific to a package.
  4. **Protected**: Use for shared functionality among subclasses, while restricting access from outside the inheritance hierarchy.

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
- Example:

  ```java
    // File: MyClass.java

    // A class with private access specifier
    public class MyClass {

      // private field
      private int privateField = 20;

      // private method
      private void privateMethod() {
        System.out.println("This is a private method.");
      }

      // Public method to access private members
      public void accessPrivateMembers() {
        // Accessing the private field
        System.out.println("Private Field: " + privateField);

        // Calling the private method
        privateMethod();
      }

      // Main method to run the program
      public static void main(String[] args) {
        // Creating an object of MyClass
        MyClass myObject = new MyClass();

        // Accessing private members through a public method
        myObject.accessPrivateMembers();
      }
    }
  ```

  - Here:
    - `MyClass` class has a `privateField` and a `privateMethod`, both marked with the `private` modifier.
    - The `accessPrivateMembers()` method is a public method that can be called from outside the class. It provides access to the private field and calls the private method.

## 3.Protected ( `protected`)

- The `protected` access specifier is used to make members (fields and methods) accessible within the same package or by subclasses, regardless of the package. They are not accessible from unrelated classes. It facilitates inheritance while controlling access to specific members in subclasses.
- Syntax:
  ```java
    public class MyClass {
      protected int protectedField;
      protected void protectedMethod() {
        // method Implementation
      };
    }
  ```
- Example:

  ```java
    // File: Animal.java

    // A class with protected access specifier
    public class Animal {

      // Protected field
    protected String species = "Unknown"; // Initialize with a default value

    // Protected method
    protected void makeSound() {
        System.out.println("Some generic animal sound");
    }
    }
  ```

  ```java
    // File: Dog.java

    // A subclass of Animal
    public class Dog extends Animal {

      // Public method to access protected members
      public void displayInfo() {
        // Accessing the protected field from the superclass
        System.out.println("Species: " + species);

        // Calling the protected method from the superclass
        makeSound();
      }
    }
  ```

  ```java
    // File: Main.java

    // Main class to run the program
    public class Main {
      public static void main(String[] args) {
        // Creating an object of Dog
        Dog myDog = new Dog();

        // Accessing protected members through a public method
        myDog.displayInfo();
      }
    }
  ```

  - Here:
    - `Animal` class has a `protected` field (`species`) and a `protected` method (`makeSound`).
    - `Dog` class is a subclass of `Animal`, and it can access the protected members from the superclass.
    - `displayInfo()` method in the `Dog` class accesses the protected field and calls the `protected` method.

- **Remarks**:
  - With the `protected` access specifier, members are accessible within the same package and by subclasses, promoting a certain level of visibility and inheritance while still maintaining encapsulation.

## 4. Default (`Package-Private`)

- If no access specifier is used, the default access level is `package-private`. Members with default access are accessible within the same package, but not outside it. It's often used for utility classes or helper methods within a specific module.
- Syntax:
  ```java
    class MyClass {
      int defaultField;
      void defaultMethod() {
        // method Implementation
      }
    }
  ```
- Example:

  ```java
    // File: Animal.java

    // A class with default (package-private) access specifier
    class Animal {
      String species "Unknown";

      void makeSound() {
        System.out.println("Some generic animal sound");
      }
    }
  ```

  ```java
    // File: Main.java

    // Main class to run the program
    public class Main {
      public static void main(String[] args) {
        // Creating an object of Dog
        Dog myDog = new Dog();

        // Accessing default (package-private) members through a public method
        myDog.displayInfo();
      }
    }
  ```

  ```java
    // File: Dog.java

    // Another class in the same package
    public class Dog {
      Animal myAnimal = new Animal();

      void displayInfo() {
        // Accessing the default (package-private) field and method
        System.out.println("Species: " + myAnimal.species);
        myAnimal.makeSound();
      }
    }
  ```

  - Here:
    - `Animal` class does not have any access modifier specified, making it default (`package-private`). It has a package-private field `species` and a package-private method `makeSound`.
    - `Dog` class is in the same package as `Animal`, so it can access the default (`package-private`) members of the `Animal` class.
    - `Main` class runs the program by creating an object of `Dog` and calling its `displayInfo` method

# Types of Methods in Java

- In Java, methods can be categorized in two main ways:
  1. Predefined vs. User-defined
  2. Based on functionality

## 1. Predefined vs. User-defined

- **Predefined methods** are methods already defined in the Java Class Library and can be used directly without any declaration. Examples include:

  1. `System.out.println()` for printing to the console
  2. `Math.max()` for finding the maximum of two numbers.

- **User-defined methods** are methods that you write yourself to perform specific tasks within your program. They are defined within classes and are typically used to encapsulate functionality and improve code reusability.
- Example:

  ```java
    // File:
    public class RectangleAreaCalculator {

      // User-defined method to calculate the area of a rectangle
      public static double calculateRectangleArea(double length, double width) {
        double area = length * width;
        return area
      }

      public static void main(String[] args) {
        // Example of using the method
        double length = 10;
        double width = 50;

        // calling the method
        double result = calculateRectangleArea(length, width)

        // Displaying the result
        System.out.println("The area of the rectangle with length " + length + " and width " + width + " is: " + result);
      }
    }
  ```

  - ## Here:

## 2. Based on functionality

- Within **user-defined methods**, there are several other classifications based on their characteristics:

### 2.1. Instance Methods

- Associated with an instance of a class. They can access instance variables and are called on an object of the class.
- Key features include:
  1. Access to Instance Variables
     - Instance methods have access to instance variables (also known as fields or properties) of the class.
     - They can manipulate the state of the object they belong to.
  2. Use of `this` keyword:
     - Inside an instance method, the `this` keyword refers to the current instance of the class. It's often used to differentiate between instance variables and parameters with the same name
  3. Non-static Context:
     - Instance methods are called in the context of an object. They can't be called without creating an instance of the class.
  4. Declaration and Invocation
     - Instance methods are declared without the `static` keyword.
     - They are invoked on an instance of the class using the dot (`.`) notation
- Example:

  ```java
    public class Dog {
      // instance variables
      String name;
      int age;

      // Constructor to initialize the instance variables
      public Dog(String name, int age) {
        this.name = name;
        this.age = age;
      }

      // Instance method to bark
      public void bark() {
        System.out.println(name + " says Woof!");
      }

      // Instance method to age the dog
      public void ageOneYear() {
        age++;
        System.out.println(name + " is now " + age + " years old.");
      }

      public static void main(String[] args) {
        // Creating instances of the Dog class
        Dog myDog = new Dog("Buddy", 3);
        Dog anotherDog = new Dog("Max", 2);

        // Calling instance methods on objects
        myDog.bark();
        myDog.ageOneYear();

        anotherDog.bark();
        anotherDog.ageOneYear();
      }
    }
  ```

  - Here:
    - `bark` and `ageOneYear` are instance methods of the `Dog` class.
    - They are invoked on instances of the `Dog` class (`myDog` and `anotherDog`)
    - These methods can access and manipulate the instance variables (`name` and `age`) of the respective objects.

- **Remarks**:
  - Instance methods are powerful because they allow you to encapsulate behavior related to an object's state and provide a way to interact with and modify that state.

### 2.2. Static Methods

- A `static` method belongs to the class rather than an instance of the class. This means you can call a `static` method without creating an instance (object) of the class. It's declared using the `static` keyword.
- Static methods are commonly used for utility functions that don't depend on the state of an object. For example, methods for mathematical calculations, string manipulations, and so on.
- Example:

  ```java
    public class MathOperation {
      // static method
      public static int add(int x, int y) {
        return x + y;
      }

      // static method
      public static int multiply(int x, int y) {
        return x * y;
      }
    }
  ```

- Characteristics of **Static Utility Methods** include:

  1. **Static Context**: Since they are declared as `static` you call such methods using the class name and hence no instantiation is required.
  2. **No Dependency on Instance State**: Static methods are not able to access any instance variables or instance methods directly. They can only use static variables and call other static methods.
  3. **Utility Functions**: These methods often serve some utility, such as **performing some calculations**, **formatting data**, or **handling string manipulations**; thus, they are perfectly suitable for helper or utility classes.
  4. **Immutable Side Effects**: Static methods do not affect the common state. They can process some input and return a result without really changing any outside variables.

- Examples of Static Utility Methods

  1. **Math Utility Methods**

     ```java
       public class MathUtility {
         // Static method to add two integers
         public static int add(int a, int b) {
             return a + b;
         }

         // Static method to calculate the square root of a number
         public static double sqrt(double number) {
             return Math.sqrt(number);
         }
     }

     // Application usage
     int sum = MathUtility.add(5, 10); // Returns 15
     double squareRoot = MathUtility.sqrt(16); // Returns 4.0
     ```

  2. **String Utility Methods**

     ```java
       public class StringUtility {
         public static String concatenate(String s1, String s2) {
             return s1 + s2;
         }

         public static int getLength(String str) {
             return str.length();
         }
     }

     // Usage
     String combined = StringUtility.concatenate("Hello, ", "World!"); // Returns "Hello, World!"
     int length = StringUtility.getLength("Example"); // Returns 7
     ```

  3. **Java Wrapper Classes**

     - Such static utility methods are available in the wrapper classes of Java.
     - Examples include:

       ```java
        int number = Integer.parseInt("123"); // Converts String to int
        String strNumber = Integer.toString(123); // Converts int to String

        double value = Double.parseDouble("12.34"); // Converts String to double
        String strValue = Double.toString(12.34); // Converts double to String
       ```

### 2.3. Abstract Methods

- These methods are declared but not implemented in a class. They are meant to be overridden by subclasses, providing a blueprint for specific functionality that must be implemented in each subclass.
- Abstract methods are useful when you want to define a template in a base class or interface, leaving the specific implementation to the subclasses. Abstract methods define a contract that the subclasses must follow.
- Example:
  ```java
    public abstract class Shape {
      // Abstract methods
      abstract double calculateArea();
    }
  ```

# Resources

1. [freecodecamp - https://www.freecodecamp.org/news/java-methods/](https://www.freecodecamp.org/news/java-methods/)
