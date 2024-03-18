# Spring Boot Framework

## Table of Contents

# Spring Boot Framework

- **Spring Boot** is high level framework built on top of **spring** and requires minimal configuration to build web applications.
- One of the key drawbacks of core **Spring** is the need for lot of manual configuration and that is what resulted in creation of **Spring Boot**.
- It is a widely popular choice among Java developers for developing microservices and web applications.

# How to Create a Spring Boot Project

1. Spring Initializr
2. Spring Tool Suite (Spring Boot Starter Plugin)
3. Simple Maven Project
4. CLI (Command Line Interface)

# Spring Boot Project Structure

## Main Application Class

- The main application class is the entry point to the application. It is located in a root package above other classes. The main application class is responsible for initializing the Spring application context and starting the Spring application.
  ,

## The build.gradle file

- The `build.gradle` must be located at the root of the application

## Spring Boot Application Properties

- Various properties can be specified inside your `application.properties` file, inside your `application.yml` file, or as command-line switches.
- The `application.properties` file is located in the `src/main/resources` directory. The properties are defined as key-value pairs. Where the key is the property name and the value is the property value.

## Static Content

- In a spring boot web application, static files like HTML, CSS, JavaScript, and images files can be served directly from any of the following classpath locations out of the box. No configuration is required.

## Templates

- Spring supports the following template engines by default. Templates are used with we have to build a dynamic website using SpringBoot. These templates can be activated using appropriate SpringBoot starters.
  - FreeMarker – spring-boot-starter-freemarker
  - Groovy – spring-boot-starter-groovy
  - Thymeleaf – spring-boot-starter-thymeleaf
  - Mustache – spring-boot-starter-mustache
- All these template engines will resolve their template files from the path src/main/resources/template.

# Resources

1. [Spring Initializr](https://start.spring.io/)
