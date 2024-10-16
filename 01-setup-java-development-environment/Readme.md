# Setting Up Java Development Environment

## Table of Contents

# Setting Java Development Environment in Windows

## Prerequisites for VS Code

1. [Java Development Kit (JDK)](https://www.microsoft.com/openjdk)
2. [Extension Pack for Java](https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-java-pack)
3. [Spring Boot Dashboard](https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-spring-boot-dashboard)

## Step #1: Install [JDK](https://www.oracle.com/java/technologies/downloads/)

- After the installation is complete, delete the downloaded file to recover disk space.

## Step #2: Set Up Environment Variables

- Right-click on "This PC" or "My Computer" and select "Properties."
- Click "Advanced system settings" and then "Environment Variables."
- Under "System variables," click "New."
- Create two variables:
  - Variable name: JAVA_HOME
  - Variable value: The path to your JDK installation directory (e.g., `C:\Program Files\Java\jdk-21\`)
- Edit the PATH variable:
  - Find the PATH variable under "System variables" and click "Edit."
  - Add a semicolon (;) to the end of the existing path, followed by `%JAVA_HOME%\bin`.
- Click "OK" on all windows to save the changes.

## Step #3:Choose and Install an IDE

- Popular IDEs for Java
  - [IntelliJ Idea Community Edition](https://www.jetbrains.com/idea/download/?section=windows)
- Run the installer and follow the instructions.

## Step #4: Test the setup

- Open a command prompt or terminal window.
- Type `java -version` and press Enter.
- If the installation is successful, you'll see the Java version information. E.g.,

  ```sh
   java -version
   #java version "21.0.2" 2024-01-16 LTS
   #Java(TM) SE Runtime Environment (build 21.0.2+13-LTS-58)
   #Java HotSpot(TM) 64-Bit Server VM (build 21.0.2+13-LTS-58, mixed mode, sharing)
  ```

- Create a simple Java program using your chosen IDE to further test the setup.a

# Java Development Environment in VS Code

## Step #1: Download and Install [Java Development Kit]() (JDK).

- You can download the **JDK** from the official [Oracle website]().
- After you finish **JDK** installation, please reload Visual Studio Code to make it effective.

## Step 2: Install the [Extension Pack for Java](https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-java-pack) in VS Code.

- This pack includes everything you need to develop **Java** applications in **Visual Studio Code**.
- [Extension Pack for Java](https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-java-pack) is a popular extensions for **Java** development that provides Java IntelliSense, debugging, testing, Maven/Gradle support, project management and more
- **Remark**:
  - If you are a Spring developer working on a **Spring Boot** application, you can also download the [Spring Boot Extension Pack](https://marketplace.visualstudio.com/items?itemName=vmware.vscode-boot-dev-pack) for specialized **Spring** experience

## Step #3: Create a new Java project

- Open VS Code and create a new folder where you want to save your Java project. Then, open the Command Palette by pressing `Ctrl+Shift+P` shortcut key and type "`Java: Create Java Project`". Press Enter and select a location for the project. Choose a name for your project and select a **JDK** version to use.

  - Create a Java file with "Hello World" code.
  - Once the project is created, open the `src` folder and create a new Java file with the name `HelloWorld.java`.
  - Copy and paste the following code into the file:

    ```java
        public class HelloWorld {
        public static void main(String[] args) {
            System.out.println("Hello, World!");
        }
    }
    ```

## Step #6: Run the program.

- Open the Command Palette and type "`Java: Run Java Program`" and press Enter.
- This will run your program and the output "Hello, World!" should be displayed in the console.

# Resources

1. [freeCodeCamp - How to Install Java in Ubuntu – JDK Linux Tutorial](https://www.freecodecamp.org/news/how-to-install-java-in-ubuntu/)
2. [freeCodeCamp - How to Set Up Your Java Development Environment](https://www.freecodecamp.org/news/how-to-set-up-java-development-environment-a-comprehensive-guide/)
3. [How to Install OpenJDK (Free Java) – Multi OS Guide](https://www.freecodecamp.org/news/install-openjdk-free-java-multi-os-guide/)
