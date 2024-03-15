# Data Types in Java

## Table of Contents

# Introduction to Data Types in Java

- **Primitive Data Types** are built into the **Java** language and are the foundations of all other data types. The Four categories include:

  1. integer
  2. Floating point
  3. Character type
  4. Boolean

## 1. Integer

```java
    byte numberOfEnglidhLetters = 26; // size = 8 Bits, Type = byte, Min Value = -128, Max. Value = 127
    short feetInAMile = 5280; // Type = short; Size = 16 Bits; Min. Value = -32768, Max. Value = 32768
    int milesToSun = 92960000;
    long milesInALightYear = 5879000000000L; // Size = 64 Bits; Literal Form = OL
```

- Remark
  - the most commonly used integer data type; Type = int; Size = 32 Bits; Min. Value = -2147483648; Max. Value = 2147483647

## 2. Float

- stores values containing a fractional portion

  ```java
      float kilometersInAMarathon = 42.195f; // Type = float; Bits = 32; Literal Form = O.OF
      float absoluteZeroInCelcius = 273.15f;

      double atomWidthInMeters = 0.0000000001d; // Type = double; Bits = 64; Literal Form = 0.0 or 0.0d
  ```

## 3. Character Type

- Stores a single `Unicode` character
- Literals values placed between single quotes
- for Unicode code points, use \u followed by a 4-digit hex value
  ```java
      char regularU = 'U';
      char accentedU = '\u00DA';
  ```

## 4. Boolean Type

- stores `true`/`false` values
- Literals values are true and false

  ```java
      boolean iLoveJava = true;
  ```

## 5. Date & Time Types

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
