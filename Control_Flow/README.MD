# Control Flow in Java

## Table of Contents

# Arithmetic Operators

# Prefix and Postfix Operators
```java
    int someValue = 5;
    System.out.println(++someValue); // Output: 6

    // Note: the variable someValue is now changes - the operator applies the operation and stores it back into the variable
    System.out.println(++someValue); // Outpu: 6

    int someOtherValue = 5;
    System.out.println(someOtherValue++); // Output: 5
    System.out.println(someOtherValue); // Output: 6
```

# Compound Assignment Operators
* combine an operation and assignment
* apply right side value to left side 
* stores result in variable on left side
* available for 5 basic math operations
```java
    int myValue = 50;
    myValue += 5;
    System.out.printLn(myValue); // Output: 55
    ```
    ```java
    int myOtherValue = 100;
    int val1 = 5;
    int val2 = 10;

    myOtherValue /= value1 * value2; // Output: 2; 100 / (5 * 10)
```

# Type Conversion
* Implicit Type Conversion - automatically performed by a compiler
```java
    int intValueOne = 50;
    long longValueOne = intValueOne;
```
* Explicit Type Conversion - conversions performed explicitly in code with cast operator
```java
    long longValueTwo  = 50;
    int intValueTwo = (int) longValueTwo;
```

# Conditional Assigment
* Returns a value based on the result of a condition
```java
    int value1 = 7;
    int value2 = 5;
    // get the largest value between the two
    int maxValue = value1 > value2 ? value1 : value2;
    System.out.println(maxValue); // Output: 7
```

# if else Statement
* an __If__ statement conditionally executes a statement
* __else__ clause executes a statement when condition is false
```java
    int value1 = 10;
    int value2 = 4;

    if (value1 > value2)
        System.out.println("value 1 is bigger");
    else
        System.out.println("value 1 is not bigger");
```
* chaining an if-else statement - are evaluated in order top-to-bottom
```java
    int value1 = 10;
    int value2 = 40;

    if (value1 > value2)
        System.out.println("value 1 is bigger");
    else if (value1 < value2)
        System.out.println("value 2 is bigger");
    else
        System.out.println("value 1 is eaual to value 2");
```

# Logical Operators
* produce a single true or false result from two true or false values
* may combine two relational tests
* may combine two Boolean variables

    -|Operator|What Resolves to True|
    ----|-----------|--------------
    And|&|true & true
    Or | l | false l true, true l false, true l true
    Exclusive or (XOR) | ^ | false ^ true, true ^ false
    Negation | ! | false

```java
    int a = 20, b = 14, c = 5;

    if (a > b & b > c)
        System.ou.println("a is greater than c");
```

# Conditional Logical Operator
* similar to standard logical operators
* Right side executes only when needed
* && executes right only when left is true
* || executes right only when left is false

    - | Operator | What Resolves to True
    ----|----------|--------------
    And | && | true && true
    Or | ll | false ll true

```java
    public class Main {

        public static void main(String[] args) {
            int students = 150;
            int rooms = 0;

            if (rooms != 0 && students / rooms > 30)
                System.out.println("Crowded");
            System.out.println();
            System.out.println("*** end of program ***"); // Output: *** end of program ***

        }
    }
```

# Block Statements
* group statements together
* creates a compound statement
* enclose statements in openning and closing brackets

```java
    int v1 = 10, v2 = 4;
    final int diff;

    if (v1 > v2) {
        diff = v1 - v2;
        System.out.println("v1 is bigger than v2, diff = " + diff);
    }
    else {
        diff = v2 - v1;
        System.out.println("v2 is bigger than v1, diff = ", + diff);
    }
```

# while Loop
* condition is checked at the start of the loop
```java
    // calculating a factorial value
    int someValue = 4;
    int factorial = 1;

    while (someValue > 1) {
        factorial *= someValue;
        someValue --;
    }
    System.out.println(factorial); //displays 24
```

# do-while Loop
* condition is checked at loop end
```java
    // print a sequence of values
    int iValue = 5;

    do {
        System.out.println(iVal); // print the initial value of iVal
        System.out.println(" *2 = ");
        iVal *= 2;
        System.out.println(iVal);
    } while (iVal < 25>);
```

# for Loop
* condition is checked at the start of the loop
* provides a simplified notation for loop control values
```java
    for (int i = 1; i < 100; i *= 2)
        System.out.println(i);
```

# for each Loop
* executes a statement once for each array member.
* handles getting collection length
* handles accessing each value

```java
    float[] theVals = {10.0f, 20.0f, 15.0f};
    float sum = 0.0f;

    for (float currentVal : theVals)
        sum += currentVal;
```