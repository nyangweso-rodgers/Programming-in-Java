# Lombok

## Table of Contents

# What is Lombok?

- **Lombok** is a **Java library** that helps reduce boilerplate code by automatically generating commonly used code like `getters`, `setters`, `constructors`, `toString()`, and `equals()` methods. It works during compile time by modifying the bytecode of Java classes using annotations, saving developers from writing repetitive code.

## Why Use Lombok?

1. Cleaner Code: Keeps your classes compact and focused on business logic.
2. Reduced Boilerplate: No need to manually write getters, setters, or constructors.
3. Faster Development: Simplifies class creation by reducing repetitive tasks.
4. Consistency: Provides a standard way of generating common methods.

## Advantages of Lombok

1. Reduced Boilerplate: Saves time by eliminating repetitive code.
2. Improved Readability: Classes are smaller and easier to understand.
3. Focus on Logic: Allows developers to concentrate on the business logic instead of writing utility methods.
4. Standardization: Ensures consistency across the project with auto-generated methods.

## Disadvantages of Lombok

1. IDE Dependency: Requires IDEs to enable **annotation** processing for Lombok to work (can confuse new developers).
2. Compile-Time Magic: Since the code is generated during compilation, it’s harder to debug.
3. Tight Coupling: Introduces a dependency on Lombok in the project. If Lombok is removed, the code will break.
4. Reflection Issues: Some frameworks (e.g., JPA) may behave unpredictably with Lombok annotations.

## Setting Up Lombok

1. Add Lombok to Maven or Gradle

   - For Gradle:
     ```groovy
       dependencies {
           compileOnly 'org.projectlombok:lombok:1.18.30'
           annotationProcessor 'org.projectlombok:lombok:1.18.30'
       }
     ```

2. Enable Annotation Processing in your IDE:
   - IntelliJ: Go to Preferences > Build, Execution, Deployment > Compiler > Annotation Processors and enable Annotation Processing.

# Lombok Annotations

## 1. `@Getter` and `@Setter`

- Purpose: Automatically generate getter and setter methods for fields.
- Example:

  ```java
    import lombok.Getter;
    import lombok.Setter;

    @Getter
    @Setter
    public class User {
        private String id;
        private String username;
    }
  ```

  - Equivalent output:

    ```java
        public class User {
            private String id;
            private String username;

            private String getId() {return id; }
            public void setId(String id) {this.id = id; }

            private String getUsername() {return username; }
            public void setUsername(String id) {this.username = username; }
        }
    ```

## 2. `@Data`

- Purpose: A combination of multiple Lombok annotations:

  1. `@Getter`
  2. `@Setter`
  3. `@ToString`
  4. `@EqualsAndHashCode`
  5. `@RequiredArgsConstructor`

- Example:

  ```java
    import lombok.Data;

    @Data
    public class User {
        private String id;
        private String username;
    }
  ```

  - Equivalent output:
    - Getters and setters for all fields.
    - `toString()`, `equals()`, and `hashCode()` implementations.

## 3. `@NoArgsConstructor`, `@AllArgsConstructor`, and `@RequiredArgsConstructor`

- `@NoArgsConstructor`: Generates a no-argument constructor.
- `@AllArgsConstructor`: Generates a constructor with all fields as parameters.
- `@RequiredArgsConstructor`: Generates a constructor for final fields or fields marked `@NonNull`
- Example:

  ```java
    import lombok.AllArgsConstructor;
    import lombok.NoArgsConstructor;
    import lombok.RequiredArgsConstructor;
    import lombok.NonNull;

    @NoArgsConstructor
    @AllArgsConstructor
    @RequiredArgsConstructor
    public class User {
        @NonNull private String id;
        private String name;
        private String email;
    }
  ```

  - Equivalent output:
    - No-args constructor: `public User() {}`
    - All-args constructor: `public User(String id, String name, String email) {}`
    - Required-args constructor: `public User(String id) { this.id = id; }`

## 4. `@ToString()`

- Purpose: Generates a `toString()` method that returns a string representation of the object.
- Example:

  ```java
    import lombok.ToString;

    @ToString
    public class User {
        private String id;
        private String name;
    }
  ```

  - Equivalent output:

  ```java
    @Override
    public String toString() {
        return "User(id=" + this.id + ", name=" + this.name + ")";
    }
  ```

## 5. `@EqualsAndHashCode`

- Purpose: Generates `equals()` and `hashCode()` methods based on fields.
- Example:

  ```java
    import lombok.EqualsAndHashCode;

    @EqualsAndHashCode
    public class User {
        private String id;
        private String name;
    }
  ```

  - Equivalent output:

  ```java
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id) &&
            Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
  ```

## 6. `@Builder`

- Purpose: Implements the builder pattern, allowing objects to be built step-by-step.
- Example:

  ```java
    import lombok.Builder;

    @Builder
    public class User {
        private String id;
        private String name;
        private String email;
    }
  ```

  - Usage:

  ```java
    User user = User.builder()
                .id("1")
                .name("Alice")
                .email("alice@example.com")
                .build();
  ```

## 7. `@SneakyThrows`

- Purpose: Allows you to throw checked exceptions without needing to declare them with `throws`.

- Example:

  ```java
    import lombok.SneakyThrows;

    public class FileReader {
        @SneakyThrows
        public void readFile(String path) {
            Files.readAllLines(Paths.get(path));
        }
    }
  ```

  - Equivalent to:

  ```java
    public void readFile(String path) throws IOException {
        Files.readAllLines(Paths.get(path));
    }
  ```

## 8. `@Value` (Immutable Objects)

- Purpose: Creates immutable objects (all fields are `final` by default).

- Example:

  ```java
    import lombok.Value;

    @Value
    public class User {
        String id;
        String name;
        String email;
    }
  ```

  - Equivalent to:
    - All fields are `final`.
    - No setters are generated.

# Resources and Further Reading
