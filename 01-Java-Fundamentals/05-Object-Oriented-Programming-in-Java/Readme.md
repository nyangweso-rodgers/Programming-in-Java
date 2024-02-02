# Object Oriented Programming (OOP) in Java

## Table of Contents

# Introduction to OOP in Java

- **Object Orietation** is a style of programming in which the unit of behavior is an **object** which consists of **State** (date, held in fields) and **behavior** (methods, functions)

# Classes in Java

- A **class** can be defined as a template/blueprint that describes the behavior/state that the object of its type supports.

# Objects in Java

- An object is an instance of a **class**.
- Example:
  - Create a `Dog` object
    ```java
        public class Dog {
            Dog GermanShephard = new Dog();
            Dog Bulldog = new Dog();
        }
    ```
- An object has three major **characteristics**:

  1. **State**: this is the data (or value) of an object.
  2. **Behavior**: represents the functionality of objects, shown via **methods**.
  3. **Identity**: An object identity is implemented via a unique ID. The value is used internally by the Java Virtual Machine (JVM) to identify each object.

- Steps to create an object:
  1. **Declaration**:
  2. **Instantiation**:

# Methods in Java

- **Methods** are used to perform certain actions. They represent the behavior of an object. They can either be `public` or `private`, i.e, cannot be accessed from outside, but must be declared within a `class`. **Methods** can be defined as a group of statements that perform some operations and may or may not return a result.
- Example:
  ```java
    class Car {
        // public method to print speed
        public void printSpeed()
    }
  ``` 

# Resources
