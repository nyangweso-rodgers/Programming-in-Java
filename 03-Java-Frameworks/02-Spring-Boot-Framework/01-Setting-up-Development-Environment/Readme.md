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
