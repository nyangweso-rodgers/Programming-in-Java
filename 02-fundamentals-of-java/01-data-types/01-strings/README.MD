# Strings Data Type

## Table of Contents

# String

- string class stores a sequence of unicode characters
- literals are stored in double quotes
- values can be concatanated using `+` and `+=`

  ```java
      String name = "Rodgers";
      String greeting = "Hello " + name; // concatanation

      System.out.println(greeting); //display: Hello Rodgers

      greeting += " good to see you!"; // updates the value of greeting

      Syste.out.println(greeting); // display: Hello Rodgers good to see you!
  ```

* Strings are **immutable**
* string variables do not directly hold the string value - holds a reference to the instance of the string
* changes in the value create a new instance of the string
* **comparing string with equality (==) operator**: when comparing strings using `==` operator, it checks to see if both string variables reference the same string instance

  ```java
      String s1 = "I love";
      s1 += " Java";

      String s2 = "I";
      s2 += " love Java";

      if (s1 == s2); // false since s1 and s2 are not referncing the same instance
          // do something
  ```

* **comparing strings with the equlas method**: performs a character by character comparison

```java
    String s1 = "I love";
    s1 += " Java";

    String s2 = "I";
    s2 += " love Java";

    if (s1.equals(s2)) // true
        // do something
```

- **string methods**:

  | Operation                          | Methods                                                           |
  | ---------------------------------- | ----------------------------------------------------------------- |
  | Length                             | length                                                            |
  | Create new string(s) from existing | concat, replace, toLowerCase, toUpperCase, trim, split            |
  | Extract substring                  | charAt, substring                                                 |
  | Test substring                     | contains, endsWith, startsWith, indexOf, lastIndexOf              |
  | Comparison                         | equals, equalsIgnorecase, isEmpty, compareTo, compareToIgnoreCase |
  | Formatting                         | format                                                            |
  | String for non-string              | valueOf                                                           |

* **Converting Non-string Types to String**:

  - virtually, all data types can be converted into string
  - can use **String.valueOf**
  - conversion often happens implicitly

    ```java
        int iVal = 100;
        String sVal = String.valueOf(iVal); // "100"

        int i = 2, j = 3;
        int result = i * j;

        String output = i + " * " + j + " = " + result; // display: 2 * 3 = 6
    ```

* **StringBuilder class**: provides mutable string buffer

  - gives us a way to efficiently constructs string values piece by piece
  - add new content to end with apppend
  - add new content within with insert

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
