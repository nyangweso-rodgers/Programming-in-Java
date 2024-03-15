# `Date` Class in Java

## Table Of Contents

# The `java.time.*` Classes for Dates and Time

- `java.util.Date.*` was the original date and time API introduced in Java. It had the following **features**:
  - Mutable: Instances of `Date` are mutable, meaning their values can be changed after creation.
  - Not thread-safe: `Date` is not thread-safe, which can lead to issues in concurrent programming.
  - Limited functionality: It lacks some of the advanced features for handling date and time, especially regarding time zones.
- With the release of Java 8, a new and improved date and time API was introduced in the `java.time` package which addresses the shortcomings of the old `java.util.Date` API. It is designed to be more comprehensive, immutable, and user-friendly. Additional **features** include:

  - Time zone support: `java.time` includes a comprehensive set of classes for dealing with time zones, making it more suitable for global applications.
  - Additional classes: It introduces new classes like `LocalDate`, `LocalTime`, `LocalDateTime`, `ZonedDateTime`, and more, each serving specific purposes.

- Examples:

  - Using `java.util.Date`

    ```java
        // using java.util.Date
        import java.util.Date;

        public class UsingJavaUtilDate {
            public static void main(String[] args) {
                Date utilDate = new Date();
                System.out.println("java.util.Date: " + utilDate); // Output: java.util.Date: Sat Feb 03 14:37:56 EAT 2024
            }
        }
    ```

  - Using `java.time.*`

    ```java
        // using java.time
        import java.time.LocalDateTime;
        import java.time.LocalDate;
        import java.time.LocalTime;

        public class UsingJavaTime {
            public static void main(String[] args) {
                LocalDateTime localDateTime = LocalDateTime.now();
                LocalDate localDate = LocalDate.now();
                LocalTime localTime = LocalTime.now();
                System.out.println("java.time.localDateTime: " + localDateTime); // Output: java.time.localDateTime: 2024-02-03T14:39:50.684603900
                System.out.println("java.time.LocalDate: " + localDate); // Output: java.time.localDate: 2024-02-03
                System.out.println("java.time.LocalTime: " + localTime); // Output: java.time.LocalTime: 14:43:44.543585200
            }
        }

    ```
