# Object Orinted Programming in Java

## Table of Contents
- [Introduction to OOP in Java](#Introduction-to-OOP-in-Java)
- [Methods](#Methods)
- [Arrays](#Arrays)


# Introduction to OOP in Java

# Methods
* Fundamentally, __Methods__ as mechanisms for organizing code. enables creation of reusable code blocks. __Features__ of methods include:
    * methods can receive data
    * methods can return data
```java
    // declare doSomething Method with a void return value
    // with an empty parameter list
    // statis is a modifier
    System.out.println("Before method call");
    doSomething();
    System.out.println("After method call");

    static void doSomething() {
        System.out.println("Inside method");
        System.out.println("Still Inside");
    }
```
# Arrays
* Arrays provide ordered collection of elements
* each element accessed via an index
* Index range from 0 to a number of elements minus 1
* Number of elements can be accessed via array's length value

```java
    float [] theVals = new float[3]; // declaring variable that refernces floating point arrays with 3 elements
    theVals[0] = 10.0f;
    theVals[1] = 20.0f;
    theVals[2] = 15.0f;

    float sum = 0.0f;

    for (int index = 0; index < theVals.length; index++)
        sum += theVals[index];
    System.out.println(sum); // displays 45
```