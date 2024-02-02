# Variables in Java

## Table of Contents

# Introduction to Variables in Java

- Example of variable declaration: `data type variable [= value]`
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

- **Variables** are named data storage.

  ```java
      // Varaibles in Java
      class MyVariables {
          public static void main(String[] args) {
              int myVar; // uninitialized variable i.e., it cannot be used since this has not been assigned
            myVar = 50;
            int anotherVar = 100;
            System.out.println(myVar); // Output: 50
            System.out.println(anotherVar); // Output:  100

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

- Remarks:

  - Types of variables:

    - local
    - instance
    - static: single copy of variable is create & shared among all objects at class level

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

# Types Of Variables in Java

## 1. Local Variables

- Local variables are declared in methods, constructors, or blocks.

## 2. Class Variables

## 3. Instance Variables (Non-static Variables)
