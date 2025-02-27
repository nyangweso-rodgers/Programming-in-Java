# Create Spring Boot Application Using Initilizr

# What is Spring Initializr

- [Spring Initializr](https://start.spring.io/) is a web-based tool that simplifies creating and setting up **Spring Boot** projects. It is straightforward for the developers to select the necessary configuration for their projects.
- The **Spring Initializr** tool takes care of the following configuration for any Spring-based project.
  1. Build tool (**Maven** or **Gradle**) to build the application.
  2. Spring Boot version(Dependencies are added based on the version).
  3. Dependencies required for the project.
  4. Language and its version.
  5. Project Metadata like name, packaging (Jar or War), package name, etc.

# The Spring Initializr UI Options

- The **Spring Initializr UI** has the following options:
  1. **Project**: Using this one can create a **Maven** or **Gradle** project i.e. **Maven** (default project) or **Gradle** can be used as a build tool.
  2. **Language**: **Spring Initializr** provides **Java** (default option), **Kotlin**, and **Groovy** as a programming language for the project.
  3. **Spring Boot Version**: Using this one can select the Spring Boot version for their project. Spring Boot latest Version is 3.2.0(M3). The SNAPSHOT versions are under development and are not stable.
  4. **Project Dependencies**: Dependencies are artifacts that we can add to the project. You can select the following Dependencies:
     1. Web Dependency
  5. **Project Metadata**: It contains the information about the project. Information in the metadata does include below key points:
     1. **Group ID**: It is the ID of the project group
     2. **Artifact**: It is the name of the Application
     3. **Name**: Application name
     4. **Description**: It contains information about the project
     5. **Package name**: It is the combination of **Group** and **Artifact Id**
     6. **Packaging**: Using this **Jar** or **War** packaging can be selected

# Prerequisites

- Before we start, make sure you have the following prerequisites in place:
  1. **Java Development Kit** (JDK): Spring Boot is Java-based, so you need to have a JDK (preferably Java 8 or higher) installed on your system.
  2. **Integrated Development Environment** (IDE): You can use any Java IDE you prefer, but for this tutorial, I’ll use IntelliJ IDEA.
- For VS Code, install the following extensions:
  1. [Gradle Language Support](https://marketplace.visualstudio.com/items?itemName=naco-siren.gradle-language)

# Setup

## Step 1: Open Spring Initializr

- Open your web browser and navigate to **https://start.spring.io/**, which is the Spring Initializr web application.
- Options:
  - Project: Choose “Maven Project” or “Gradle Project,” depending on your preference. I’ll use Gradle.
  - Language: Select “Java.”
  - **Spring Boot**: Choose the desired Spring Boot version.
  - Project metadata: Fill in the details as follows:
    - **Group**: use your organization’s domain name in reverse order, e.g., “`com.learning.`”
    - **Artifact**: give your project an artifact name, e.g., “demo.”
    - Name: enter a name for your project, e.g., “SpringBootDemo.”
    - Description: this field is optional.
    - Package name: define your base package, e.g., “com.learning.demo.”
    - Packaging: choose “Jar” for a standalone JAR file.
- Click the “Generate” button, and **Spring Initializr** will create a ZIP file containing your project.

## Step 2: Import the project into your IDE

- Download the ZIP file generated by Spring Initializr.
- Open your IDE (IntelliJ IDEA in this case).
- Select **File -> New -> Project** from Existing Sources and choose the downloaded ZIP file. Make sure to select "**Import project from external model**" and choose "**Gradle**."
- Follow the prompts to import the project into your IDE.

## Step 3: Build and run your Spring Boot application

- Once the project is imported, you’ll see it in your project explorer.
- Navigate to the `src/main/java` directory and open the `DemoApplication.java` file.
  - You’ll find a `main` method in this file. Right-click on it and select Run Demo Application.
  - Your **Spring Boot application** will start, and you can see the progress in the console. Once it’s up and running, you’ll see a message indicating that your application has started.
  - Open a web browser and navigate to http://localhost:9090. You should see a "Whitelabel Error Page" because we haven't defined any specific endpoints yet.
- **Remark**:
  - You can change the default port of your **Spring Boot application** by modifying the `application.properties` or `application.yml` file in your `src/main/resources` directory.
    - Using `application.properties`: Add the following line to change the port number (e.g., to port 9090):
      ```properties
        server.port=9090
      ```
    - Using `application.yml`: Add the following line to change the port number (e.g., to port 9090):
      ```yml
      server:
        port: 9090
      ```

## Step 4: Create a simple REST endpoint

- Create a new Java class, e.g., `TestController.java`, in the same package as your `main` application class.
- Add the following code to create a basic REST endpoint:

  ```java
    package com.learning.spring_boot_api_with_postgresql;

    import org.springframework.web.bind.annotation.GetMapping;
    import org.springframework.web.bind.annotation.RequestMapping;
    import org.springframework.web.bind.annotation.RestController;

    @RestController
    @RequestMapping("/hello")
    public class TestController {
        @GetMapping
        public String sayHello() {
            return "Rodgers";
        }
    }
  ```

- Save the file, and your application will automatically reload with the new endpoint available at http://localhost:9090/hello
- Open your web browser and navigate to http://localhost:9090/hello. You should see the message "Rodgers"

## Remarks

- For a Java project using **Gradle** and **Spring Boot**, here is a typical `.gitignore` file that you can use as a starting point:

  ```.gitignore
    # Compiled class files
    *.class

    # Log files
    *.log

    # BlueJ files
    *.ctxt

    # Mobile Tools for Java (J2ME)
    .mtj.tmp/

    # Package Files #
    *.jar
    *.war
    *.nar
    *.ear
    *.zip
    *.tar.gz
    *.rar

    # Virtual machine crash logs, see http://www.java.com/en/download/help/error_hotspot.xml
    hs_err_pid*

    # Eclipse/IntelliJ IDEA project files
    *.idea/
    *.classpath
    *.project
    *.settings/
    *.vscode/

    # Mac OS metadata
    .DS_Store

    # Windows thumbnail cache
    Thumbs.db
    ehthumbs.db

    # Gradle
    .gradle/
    build/
    out/
    !gradle/wrapper/gradle-wrapper.jar

    # Dependency directories
    **/lib/
    **/target/
    **/build/
    **/.mvn/
    !**/src/main/**/resources/

    # Gradle cache files
    .gradle/
    build/

    # IDEs
    .idea/
    *.iml
    *.ipr
    *.iws
    *.class
    *.project
    *.classpath
    .cache
    *.factorypath

    # OS generated files
    .DS_Store
    *.swp
    *~
    .*.swp

    # Logs and databases
    *.log
    *.sql
    *.sqlite

    # Spring Boot specific files
    .spring-boot-devtools.properties
    *.war
    *.jar

    # Temporary files
    *.tmp
    *.temp

    # Other ignored files
    *.bak
    *.old
    *.orig
    *.rej
    *.swo

    # Application specific
    **/db/*.h2.db
    **/db/*.trace.db
    **/db/*.mv.db
    **/db/*.mv.db.lock
  ```
