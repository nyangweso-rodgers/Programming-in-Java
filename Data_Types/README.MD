# Data Types in Java

## Table of Contents
- [Introduction to Data Types in Java](#Introduction-to-Data-Types-in-Java)
    - [Integer Type](#Integer-Type)
    - [Floating Type](#Floating-Type)
    - [Character Type](#Character-Type)
    - [Boolean Type](#Boolean-Type)

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