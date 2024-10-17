# Strings Data Type

## Table of Contents

# String Type

- string class stores a sequence of unicode characters
- literals are stored in double quotes
- **Properties** of `String` Type in java include:
  - Strings are **immutable**
  - string variables do not directly hold the string value but holds a reference to the instance of the string. changes in the value create a new instance of the string

## String Concatenation

- values can be concatanated using `+` and `+=`

  ```java
      // String Type
      // String Type Concatenation
      public class StringDataType {
          public static void main(String[] args) {
              String first_name = "Rodgers";
              String second_name = "Nyangweso";
              String full_name = first_name + " " + second_name;
              System.out.println(full_name);
          }
      }
  ```

## Comparing Strings with Equality (`==`) Operator

- when comparing strings using `==` operator, it checks to see if both string variables reference the same string instance

  ```java
      // String Type
      // String Type Comparison
      public class StringDataType {
          public static void main(String[] args) {
              String first_name = "Rodgers";
              String second_name = "Nyangweso";
              System.out.println(first_name == second_name); // Output: false
          }
      }
  ```

# String Methods

## 1. Length Operation

### 1.1 `length` Method

## 2. Create new string(s) from existing Operation

### 2.1 concat

### 2.2 replace

### 2.3 toLowerCase

### 2.4 toUpperCase

### 2.5 trim

### 2.6 split

## 3. Extract Substrings Operation

### 3.1 charAt

### 3.2 substring

## 4. Test substring Operation

### 4.1 `contains`

### 4.2 `endsWith`

### 4.3 `startsWith`

### 4.4 `endsWith`

### 4.5 `indexOf`

### 4.6 `lastIndexOf`

## 5. Comparison Operation

### 5.1 `equals` Method

- `equals` method performs a character by character comparison

  ```java
      // String Type
      // String Type Comparison using equals method
      public class StringDataType {
          public static void main(String[] args) {
              String first_name = "Rodgers";
              String second_name = "Nyangweso";
              System.out.println(first_name.equals(second_name)); // Output: false
          }
      }
  ```

### 5.2 `equalsIgnorecase`

### 5.3 `isEmpty`

### 5.4 `compareTo`

### 5.5 `compareToIgnoreCase`

## 6. Formatting Operation

### 6.1 `format`

## 7. String for non-string Operation

### 7.1 `valueOf`

- virtually, all data types can be converted into string.
- can use `String.valueOf()`. Conversion happens implicitly.

  ```java
      int iVal = 100;
      String sVal = String.valueOf(iVal); // "100"
  ```
