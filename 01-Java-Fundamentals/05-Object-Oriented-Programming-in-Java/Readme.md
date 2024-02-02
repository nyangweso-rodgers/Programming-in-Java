# Object Oriented Programming (OOP) in Java

## Table of Contents

# Introduction to OOP in Java

- **Object Orietation** is a style of programming in which the unit of behavior is an **object** which consists of **State** (date, held in fields) and **behavior** (methods, functions)

# Classes in Java

- A **class** can be defined as a template/blueprint that describes the behavior/state that the object of its type supports.
- A **class** has its own attributes, objects, and methods.
  - **Attributes**: What the class looks like
  - **Methods**: What the class does.
  - **Objects**: What the class is

# Features Of a Class

## 1. Methods

- In OOP, methods define the actions that objects can perform.
- **Methods** can take arguments, just like functions, and they can also return values. This allows objects to interact with other objects and perform complex tasks within a program.
- Examples:

  - a bank account object may have methods like `deposit()` and `withdraw()` to manipulate its balance.

- **Methods** can either be `public` or `private`, i.e, cannot be accessed from outside, but must be declared within a `class`. **Methods** can be defined as a group of statements that perform some operations and may or may not return a result.

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

# Resources
