# Spring Framework

## Table of Contents

# Spring vs. Spring Boot

- At a very basic level, **Spring** is a low-level framework where you need to do a lot of manual work, but **Spring Boot** brings in many predefined ways to automate programming tasks.
- Having said that, also understand that **Spring** can do a lot more, but **Spring Boot** is targeted specifically towards **web development** and **microservices**

# Introduction to Spring

- **Spring** provides overall infrastructural backing to develop java enterprise applications. Two powerful features of spring include dependency injection (DI) and inversion of Control.
- Some of the key tasks you can achieve with spring are as below –
  - Build Serverless cloud applications
  - Create batches to automate repetitive tasks
  - Build non-blocking asynchronous applications
  - Server-side development with battletested security
  - Event driven architecture implementation
  - Scalable microservices development
  - e.t.c.
- At the heart of the **Spring Framework** lies the **Spring Core Module**, which is essential for all other modules in Spring.

# Spring Core Module

- The **Spring Core Module** provides the fundamental features needed to build any Spring application. It includes two lightweight **containers**, also known as **Spring containers** or **Inversion of Control** (IoC) containers:
  1. **BeanFactory Container** (Basic container)
  2. **ApplicationContext Container** (Advanced container, an extension of BeanFactory)

# Understanding Containers in Spring

- **Containers** are software programs that manage the lifecycle of resources, from creation to destruction. In the context of Spring, **containers** manage the lifecycle of **Spring beans**. Examples of other containers include:
  1. **Servlet Container**: Manages the lifecycle of servlet components.
  2. **JSP Container**: Manages the lifecycle of JSP components.
  3. **EJB Container**: Manages the lifecycle of Enterprise JavaBeans.
- **Spring Container**: Manages the lifecycle of **Spring beans**, which includes:
  1. **BeanFactory**: A basic container.
  2. **ApplicationContext**: An advanced container with more features

# Spring Bean

- A **Spring bean** is any Java class whose object is created and managed by a Spring container. Once a Java class is designated as a Spring bean, the container takes over the following operations:
  1. Loading the class
  2. Creating an object of the class.
  3. Managing the object.
  4. Destroying the object when no longer needed
- In a Spring application, **beans** represent the core logic, such as business logic or persistence logic

# JavaBeans vs. Spring Beans

- **JavaBean**: A Java class that follows certain conventions, used as a helper class to encapsulate multiple values into a single object.
- **Spring Bean**: A Java class managed by the **Spring container**, often containing the main logic of the application.
- While a **JavaBean** can be used as a **Spring bean**, it’s not always recommended. However, any reusable class or file can be considered a component, such as servlet components or JSP components.

# The Role of Spring Containers

- **Spring containers** perform two crucial operations on **Spring beans**:
  1. Lifecycle Management: Handling the creation, management, and destruction of beans.
  2. Dependency Management: Arranging dependent beans for the main bean.
- For example, in a real project, the main classes (**Spring beans**) contain business logic, while **JavaBeans** pass multiple values between these main classes.

# Why are Spring Containers Called IoC Containers?

- In Spring applications, all operations are handled by the **Spring container**, which takes control away from the programmer — a concept known as **Inversion of Control** (IoC). The container is responsible for everything, from managing the lifecycle to injecting dependencies, hence the name **IoC container**.

# Dependency Management in Spring

- Dependency Management in Spring can be achieved i n two ways:
  1. **Dependency Lookup**: The target class searches and retrieves dependent classes manually. This method can be time-consuming as the target class must write logic to find dependent objects.
  2. **Dependency Injection** (DI): The container automatically injects the dependent class object into the target class. This is more efficient and improves productivity since the container dynamically performs this task. Types of Dependency Injection in Spring inlcude:
     1. Setter Injection
     2. Constructor Injection
     3. Field Injection
     4. Arbitrary Method Injection
     5. Aware Injection (Interface Injection)
     6. Lookup Method Injection
     7. Method Injection/Method Replacer

# Resources

1. [spring.io](https://spring.io/)
2. [start.spring.io](https://start.spring.io/)
3. [https://medium.com/javarevisited/understanding-spring-core-the-foundation-of-spring-framework-c07571a6646a](https://medium.com/javarevisited/understanding-spring-core-the-foundation-of-spring-framework-c07571a6646a)
