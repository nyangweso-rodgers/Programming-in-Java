# Variables and Data Types Java

## Table of Contents

# Introduction to Variables in Java

# Varaibles Declaration

- To declare any variable, you must specify the data type along with a name that is unique. The general syntax is:
  ```java
    dataType variableIdentifier;
  ```
- Initialization, or assignment of a value to a variable, can also be done at the time of declaration:
  ```java
    dataType variableName = value;
  ```
- Example 1:
  ```java
    int age = 25;
    String name = "Nyangweso";
  ```

# Types Of Varaibles in Java

- Java supports several types of variables based on their usage and scope:

## 1. Instance Varaibles

- Defined within a class, but outside any method. They are instance-specific and belong to the object.
- **Scope**: Belongs to the instance of the class.
- **Declaration**: Outside any method, constructor, or block.
- **Lifetime**: Exists as long as the object it is associated with exists.
- **Access Modifiers**: Can have access modifiers like `public`, `private`, or `protected`.
- **Initialization**: Automatically initialized to default values if not explicitly initialized.
- Example:

  ```java
    // Instance Variables
    public class InstanceVariableExample {
        int instanceVarExample; // instance variable

        public static void main(String[] args) {
            // create an instance of the class to create the instance variable
            InstanceVariableExample instance = new InstanceVariableExample();

            // access the instance variable through the instance
            instance.instanceVarExample = 10;
            System.out.println(instance.instanceVarExample); // Output: 10
        }
    }
  ```

- Here,
  - we access the instance variable using the instance of the class , `instance.instanceVarExample`

## 2. Class Varaibles (Static Varaibles)

- Declared with the `static` keyword and are shared among all instances of a class
- For `static` variables:
  - **Scope**: Belongs to the class rather than instances of the class.
  - **Declaration**: Outside any method, constructor, or block, with the static keyword.
  - **Lifetime**: Exists as long as the class is loaded in memory.
  - **Access Modifiers**: Can have access modifiers like `public`, `private`, or `protected`.
  - **Initialization**: Automatically initialized to default values if not explicitly initialized.
- Whenever a variable is declared as `static`, this means there is only one copy of it for the entire class, rather than each instance having its own copy. A `static` method means it can be called without creating an instance of the class.
- `Static` variables and methods in Java provide several **advantages**:

  - including memory efficiency,
  - global access,
  - object independence,
  - performance, and
  - code organization.

- Example:
  ```java
    // static variable in java
    public class StaticVariableExample {
        static int staticVariableExample; // this is a static variable
        public static void main(String[] args) {
            staticVariableExample = 10; // Assigning a value to the static variable
            System.err.println(staticVariableExample); // Output: 10
            }
        }
  ```

## 3. Local Varaibles

- Defined within a method and can only be used within that method.
- **Scope**: Limited to the block of code where they are declared.
- **Declaration**: Inside methods, constructors, or blocks.
- **Lifetime**: Created when the block is entered and destroyed when the block is exited.
- **Access Modifiers**: Cannot have access modifiers like `public`, `private`, or `protected`.
- **Initialization**: Must be explicitly initialized before use.
- Example:
  ```java
    // Local Variables in jaav
    public class LocalVariableExample {
        public static void main(String[] args) {
            int localVariableExample = 2; // this is a local variable
            System.out.println(localVariableExample); // Output: 2
        }
    }
  ```

## 4. Parameters

- Variables that accept input values in methods.

## Remarks

- Some of valid variable declarations include:

  ```java
    // Varaibles in Java
    class MyVariables {
        public static void main(String[] args) {
            int length, width, height; // declare 3 ints, length, width, and height
            int length = 3, width=4; // variable initialization
            byte A = 10; // initializes a byte type variable A
            double A = 10.12; // initializes a double type variable A
            char A = 'a'; // the char variable a iis initialized with value 'a'
            System.out.println(age);
        }
    }
  ```

- **Variables** are named data storage and can be reassigned:

  ```java
      // Varaibles in Java
      class MyVariables {
          public static void main(String[] args) {
            int myVar; // uninitialized variable i.e., it cannot be used since this has not been assigned
            myVar = 50;
            int anotherVar = 100;
            myVar = anotherVar;
            System.out.print(myVar); // Output: 100
          }
      }
  ```

- **Variables** can be declared `final` (using `final` modifier) - Values set cannot be changed

  ```java
      // Varaibles in Java
      // using final modifier
      class MyVariables {
          public static void main(String[] args) {
          final int myVar; // uninitialized variable i.e., it cannot be used since this has not been assigned
            myVar = 50;
            System.out.println(myVar); // Output: 50

          }
      }
  ```

- Differences Between Local, Instance and Static Variables

  1. **Scope**:
     - Local variables are confined to the block in which they are declared.
     - Instance variables are associated with instances of the class.
     - Static variables are shared among all instances of the class.
  2. **Lifetime**:
     - Local variables have a short lifespan, existing only within the block they are declared.
     - Instance variables exist as long as the object they are part of exists.
     - Static variables persist as long as the class is loaded in memory.
  3. **Access Modifiers**:
     - Local variables cannot have access modifiers.
     - Instance and static variables can have access modifiers.
  4. **Initialization**:
     - Local variables must be explicitly initialized before use.
     - Instance and static variables are automatically initialized to default values if not explicitly initialized.

- Get output from different classes:

  ```java
    // Varaibles in Java

    // public class
    class MainClass {
        public static void main(String[] args) {
            MyVariables.main(args); //
            Rectangle.main(args); //
        }
    }

    // length variable
    class MyVariables {
        public static void main(String[] args) {
        final int length;
        length = 50;
          System.out.println(length); // Output: 50
        }
    }

    // get area of the rectangle
    class Rectangle {
        public static void main(String[] args) {
            int width = 100;
            int length = 20;
            System.out.println(width * length); // Output:
        }
    }
  ```

# Resources
