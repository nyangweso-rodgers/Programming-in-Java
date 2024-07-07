# Setting up Development Environment for Spring Boot Application

## Table of Contents

# Setting up Development Environment for Spring Boot in VS Code

## Step #1: Prerequisites for VS Code

1. [Java Development Kit (JDK)](https://www.microsoft.com/openjdk)
2. [Extension Pack for Java](https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-java-pack)
3. [Spring Boot Dashboard](https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-spring-boot-dashboard)
4. [Spring Initializr Java Support](https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-spring-initializr)
   - Allows you to search for dependencies and generate new Spring Boot projects.
5. [Gradle for Java](https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-gradle)
   - Manage Gradle Projects, run Gradle tasks and provide better Gradle file authoring experience in VS Code

## Step #2: Create a new project in VS Code

- To install, launch VS Code and from the Extensions view (`Ctrl+Shift+X`), search for `vscode-spring-initializr`.
- Once you have the extension installed, open the Command Palette (`Ctrl+Shift+P`) and type `Spring Initializr` to start generating a `Maven` or `Gradle` project and then follow the wizard.

## Step #3: Specifying Spring Boot Version

- Here is the breakdown of the Spring Boot versions:
  - `3.2.3` (**Recommended for Beginners**): This is a stable release, well-tested, and widely used. It's a good choice for beginners as it offers a balance of features and stability.
  - `3.3.0 (SNAPSHOT)` and `3.2.4 (SNAPSHOT)`: These are snapshot versions of upcoming releases. They might contain new features and bug fixes not yet included in a stable release. However, they may also be less stable and contain bugs. Use them with caution, especially in development environments.
  - `3.3.0 (M2)`: This is likely a milestone release (M2) leading up to the final 3.3.0 stable release. It might be more stable than a snapshot but still not a recommended starting point for beginners unless you specifically need features from the upcoming release.
  - `3.1.10 (SNAPSHOT)` and `3.1.9`: These are snapshot versions of an older Spring Boot version (3.1). They are not recommended for new projects as you'll miss out on features and improvements introduced in later versions.

## Step #4: Specifying Project Language

- Here's a breakdown of the programming language options (`Java`, `Kotlin`, and `Groovy`):
  - Java:
    - The Standard Choice: Java is the mainstream language for Spring development. It's mature, widely used, and has a vast ecosystem of libraries and frameworks.
  - Kotlin:
  - Groovy:
    - Dynamic Language: Groovy is a dynamic language that can be used for scripting and development. It integrates well with Java but is less commonly used for Spring Boot projects compared to Java and Kotlin.

## Step #5: Input Project's Group Id and Artifact Id

- The "Group Id" defines a unique identifier for your project within the vast ecosystem of Java libraries and applications. It serves two main purposes:
  - **Package Naming**:
    - The **Group Id** acts as the base of your project's package name. This ensures no conflicts with other libraries or applications when deploying your project to a shared environment (e.g., Maven repository).
    - By convention, the Group Id follows a reverse domain name structure (e.g., `com.example`). If you have a website domain (example.com), using "com.example" as the Group Id maintains consistency and ownership identification.
  - **Project Uniqueness**:
    - The combination of Group Id and Artifact Id (which you'll likely be prompted for next) uniquely identifies your project within the Maven Central Repository or other package repositories. This allows others to easily find and depend on your project or its components.
- **Choosing a Group Id**:
  - For **Personal Projects**: If it's a personal project, you can use your own name or a chosen identifier in reverse domain format (e.g., com.yourname).
  - For **Organizational Projects**: If it's for an organization, use the organization's domain name in reverse format (e.g., com.mycompany).
- **Example**:
  - My name is **Rodgers Nyagweso**, and I am creating a Spring Boot Application for Data Operations with Java, I could choose:
    - Group Id: `com.nyangweso`
    - Artifact Id: `data-ops-with-java`

## Step #6: Specifying Packaging Type

- **Packaging Type** refers to how your Spring Boot application will be packaged and deployed. Options are:
  - **Jar** (**JAR**):
    - **Standard Packaging**: This is the most common packaging type for Spring Boot applications. It creates a single executable `JAR` file containing all the necessary code, libraries, and resources.
    - **Deployment**: JAR files can be deployed on any Java runtime environment (JRE) with minimal configuration. You can simply run the JAR using the java -jar command.
    - **Standalone Applications**: `JAR` packaging is ideal for standalone Spring Boot applications that don't require a web server like Tomcat or Jetty. The application itself starts up an embedded web server within the `JAR`.
  - **War** (**WAR**):
    - **Web Application Archive**: This packaging type creates a `WAR` file, which is a format used for deploying web applications on servlet containers like Tomcat or Jetty.
    - **Deployment**: WAR files need to be deployed on a servlet container to run. The container manages the lifecycle of the application and provides web server functionality.
    - **Web-based Applications**: WAR packaging is suitable for Spring Boot applications that primarily serve web content and require features provided by a dedicated web server.
- **Choosing a Packaging Type**:
  - **Standalone Application**: Choose `JAR` if you're building a standalone application that doesn't require a web server.
  - **Web Application**: Choose `WAR` if you're building a web application that needs features like session management, security filters, or integration with other web servers.

## Step #7: Choose Dependencies

- Spring Boot applications rely on external libraries (dependencies) to provide various features. These could be for database access, web development, security, messaging, etc.
- Spring Boot simplifies dependency management by offering "starters." These are pre-configured sets of dependencies for common functionalities.
- **Choosing Starters**:
  - Here are some tips for choosing dependencies:
    - Identify Needs: Analyze what functionalities you need for your application. Do you need database access? Security features? Web development frameworks?
    - Search Starters: Look for starters that match your needs. Spring Boot provides a wide range of starters, easily searchable by name or functionality. For example, "spring-boot-starter-data-jpa" provides JPA data access functionalities.
    - Essential Starters: Consider including essential starters like "spring-boot-starter-web" for web development and "spring-boot-starter-actuator" for monitoring and management capabilities.
- Choose **Spring Web**, **Spring Boot DevTools**, and **Thymeleaf**:
  - **Spring-web** contains common web-specific utilities for both `Servlet` and `Portlet` environments, while spring-web MVC enables the MVC support for Servlet environments.
  - The **Spring-boot-devtools** automatically reload your project when you change some code in your classpath file.
  - **Thymeleaf** is a Java-based library or template engine to create web-based applications.

## Step #8: Build and Run the Application

- You can compile and run a **Gradle** with Java Application using **Gradle** as well as through your IDE directly. **Gradle** provides convenient commands to compile, build, and run Java applications, but it's not the only way to do it.
- **Using Gradle Commands**:
  - Use `./gradlew build` to compile and build the project.
  - Use `./gradlew bootRun` to run a Spring Boot application.
  - These are the preferred method for automation and continuous integration environments.

# Setting up Development Environment for Spring Boot using [Spring Initializr](https://start.spring.io/)

- [Spring Initializr](https://start.spring.io/) is a web-based tool used to generate and download the Spring Boot Project template

## Step #1:

- You can create a simple Spring Boot project by visiting [Spring Initializr](https://start.spring.io/)
- Choose your build tool: Maven or Gradle.
- Choose Java Language to create Java web-based applications.
- Choose Spring Boot version (2.3.1 version in this case)
- Configure Group for your component which is the root package name to use.
- Configure Artifact for your component which is the name of the project. When configuring Artifact, you will be noticed the project name is automatically filled.
- Fill description for your project.
- Fill the root package of the project. If not specified, the value of the Group attribute is used.
- Choose Jar or War.
  - If you want to execute Java application containing Java class files, and associated metadata, you can choose Jar.
  - If you want to develop Web application containing Servlet, JSP, HTML, JavaScript, and other necessary files, you can choose War.
- Choose Java Version you want to use.

## Step #2: Pull Dependencies

- **Spring Initializr** offers a fast way to pull in all the dependencies you need for an application and does a lot of the setup for you.
- Choose **Spring Web**, **Spring Boot DevTools**, and **Thymeleaf** by clicking `Add Dependencies`.
  - The **spring-web** dependency contains common web-specific utilities for both `Servlet` and `Portlet` environments, while spring-web MVC enables the MVC support for Servlet environments.
  - The **Spring-boot-devtools** automatically reload your project when you change some code in your classpath file.
  - **Thymeleaf** is a Java-based library or template engine to create web-based applications.

## Step #3: Generate Project Zip File

- You can get the following project zip file by clicking the `GENERATE` button.

# Resources

1. [sprint.io](https://spring.io/)
2. [start.spring.io](https://start.spring.io/)
