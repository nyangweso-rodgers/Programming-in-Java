# Data Types in Java

## Table of Contents
- [Introduction to Data Types in Java](#Introduction-to-Data-Types-in-Java)
    - [Integer Type](#Integer-Type)
    - [Floating Type](#Floating-Type)
    - [Character Type](#Character-Type)
    - [Boolean Type](#Boolean-Type)
- [String](#String)
- [Data & Time](#Date-&-Time-Types)

# Introduction to Data Types in Java
__Primitive Data Types__ are built into the Java language and are the foundations of all other data types. The Four categories include:
1. integer
2. Floating point
3. Character type
4. Boolean

# Integer Type
```java
    byte numberOfEnglidhLetters = 26; // size = 8 Bits, Type = byte, Min Value = -128, Max. Value = 127
    short feetInAMile = 5280; // Type = short; Size = 16 Bits; Min. Value = -32768, Max. Value = 32768
    int milesToSun = 92960000; 
    /* the most commonly used integer data type; 
    Type = int; Size = 32 Bits; Min. Value = -2147483648; Max. Value = 2147483647
    */
    long milesInALightYear = 5879000000000L; // Size = 64 Bits; Literal Form = OL
```
# Floating Type
* stores values containing a fractional portion
```java
    float kilometersInAMarathon = 42.195f; // Type = float; Bits = 32; Literal Form = O.OF
    float absoluteZeroInCelcius = 273.15f;

    double atomWidthInMeters = 0.0000000001d; // Type = double; Bits = 64; Literal Form = 0.0 or 0.0d
```

# Character Type
* Stores a single Unicode character
* Literals values placed between single quotes
* for Unicode code points, use \u followed by a 4-digit hex value
```java
    char regularU = 'U';
    char accentedU = '\u00DA';
```
# Boolean Type
* stores true/false values
* Literals values are true and false
```java
    boolean iLoveJava = true;
```

# String
* string class stores a sequence of unicode characters
* literals are stored in double quotes
* values can be concatanated using + and +=

```java
    String name = "Rodgers";
    String greeting = "Hello " + name; // concatanation

    System.out.println(greeting); //display: Hello Rodgers

    greeting += " good to see you!"; // updates the value of greeting

    Syste.out.println(greeting); // display: Hello Rodgers good to see you!
```
* Strings are __immutable__
* string variables do not directly hold the string value - holds a reference to the instance of the string
* changes in the value create a new instance of the string
* __comparing string with equality (==) operator__: when comparing strings using == operator, it checks to see if both string variables reference the same string instance
```java
    String s1 = "I love";
    s1 += " Java";

    String s2 = "I";
    s2 += " love Java";

    if (s1 == s2); // false since s1 and s2 are not referncing the same instance
        // do something
```
* __comparing strings with the equlas method__: performs a character by character comparison
```java
    String s1 = "I love";
    s1 += " Java";

    String s2 = "I";
    s2 += " love Java";

    if (s1.equals(s2)) // true
        // do something
```
* __string methods__:

    Operation|Methods|
    ---------|------------------
    Length|length
    Create new string(s) from existing | concat, replace, toLowerCase, toUpperCase, trim, split
    Extract substring | charAt, substring
    Test substring | contains, endsWith, startsWith, indexOf, lastIndexOf
    Comparison | equals, equalsIgnorecase, isEmpty, compareTo, compareToIgnoreCase
    Formatting | format
    String for non-string | valueOf

* __Converting Non-string Types to String__:
    * virtually, all data types can be converted into string
    * can use __String.valueOf__
    * conversion often happens implicitly

```java
    int iVal = 100;
    String sVal = String.valueOf(iVal); // "100"

    int i = 2, j = 3;
    int result = i * j;

    String output = i + " * " + j + " = " + result; // display: 2 * 3 = 6
```
* __StringBuilder class__: provides mutable string buffer
    * gives us a way to efficiently constructs string values piece by piece
    * add new content to end with apppend
    * add new content within with insert

```java
    String location = "Kenya";
    int flightNumber = 188;

    StringBuilder sb = new StringBuilder(40);

    sb.append("I flew to ");
    sb.append(location);
    sb.append(" on Flight #");
    sb.append(flightNumber);

    String message = sb.toString(); // "I flew to Kenya on Flight #188"
```

# Date & Time Types
```java
    // Instant class in java
    static void checkRelationship(Instant otherInstant) {
        Instant nowInstant = Instant.now();

        if (otherInstant.compareTo(nowInstant) > 0)
            System.out.println("Instant is in the future");
        else if (otherInstant.compareTo(nowInstant) < 0)
            System.out.println("Instant is in the past");
        else
            System.out.println("Instant is now");
    }
```