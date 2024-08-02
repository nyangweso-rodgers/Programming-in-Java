# Dependency Management in Java

## Table Of Contents

# Introducton to Java Dependencies

- In Java, dependencies are managed using build tools and dependency management systems. The two most commonly used tools are:
  1. **Maven**: A popular build and dependency management tool.
  2. **Gradle**: Another widely used build tool that also handles dependency management.

# Maven

- Maven uses an XML file called `pom.xml` (Project Object Model) to manage project configuration, including dependencies.
- You specify dependencies in the `<dependencies>` section of the pom.xml. For example:
  ```xml
    <dependencies>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-web</artifactId>
        <version>2.5.4</version>
    </dependency>
    <!-- More dependencies -->
  </dependencies>
  ```
- **Maven** fetches dependencies from repositories (such as [Maven Central]() or [JCenter]()). You can configure repositories in the `pom.xml` file.
- Use commands like `mvn install` or `mvn clean` to build and manage your project.

# Gradle

- **Gradle** uses a **Groovy-based script** (`build.gradle`) or a **Kotlin-based script** (`build.gradle.kts`) for configuration.

  ```groovey
        plugins {
        id 'java'
        id 'org.springframework.boot' version '2.5.4'
    }

    dependencies {
        implementation 'org.springframework.boot:spring-boot-starter-web'
        // More dependencies
    }
  ```

- Similar to **Maven**, **Gradle** fetches dependencies from repositories configured in the `build.gradle` file.
- Use commands like `gradle build` or `gradle run` to build and run your project.

# Dependency Scope

- Java dependencies can have different scopes or types, which define their usage within the project:
  1. `implementation` (Gradle) / `compile` (Maven): Regular dependencies needed for compilation and runtime.
  2. `testImplementation` (Gradle) / `test` (Maven): Dependencies needed only for testing.
  3. `runtimeOnly` (Gradle) / runtime (`Maven`): Dependencies required only at runtime.
  4. `provided` (Maven): Dependencies that are expected to be provided by the runtime environment and are not included in the build output.

# Dependency Declaration

- In Node.js, dependencies are listed in `package.json`, whereas, in **Java**, they are listed in `pom.xml` for **Maven** or `build.gradle` for **Gradle**.

# Resources and Further Reading
