# Variables in Java

## Table of Contents

# Introduction to Variables in Java

- Example of variable declaration: `data type variable [= value]`
- Some of valid variable declarations include:

  ```java
    int length, width, height; // declare 3 ints, length, width, and height
    int length = 3, width=4; // variable initialization
    byte A = 10; // initializes a byte type variable A
    double A = 10.12; // initializes a double type variable A
    char A = 'a'; // the char variable a iis initialized with value 'a'
  ```

- **Variables** are named data storage.

  ```java
      int myVar; // uninitialized variable i.e., it cannot be used since this has not been assigned
      myVar = 50;
      int anotherVar = 100;
      System.out.println(myVar); // Output: 50
      System.out.println(anotherVar); // Output:  100

      myVar = anotherVar;
      System.out.print(myVar); // Output: 100
  ```

- **Variables** can be decalred `final` (using `final` modifier) - Values set cannot be changed

  ```java
      // using final modifier
      final int maxStudents = 25;
  ```

# Types Of Variables in Java

## 1. Local Variables

- Local variables are declared in methods, constructors, or blocks.

## 2. Class Variables

## 3. Instance Variables (Non-static Variables)
