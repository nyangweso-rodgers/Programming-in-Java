# Java Development Environment In VSCode

## Steps
1. Download and install Java Development Kit (JDK) on your machine: You can download the __JDK__ from the official Oracle website. Make sure you download the version that is compatible with your operating system.
   
2. After you finish JDK installation, please reload Visual Studio Code to make it effective.
   
3. Install the Java Extension Pack in VSCode: _This pack includes everything you need to develop Java applications in Visual Studio Code._
   
4. Create a new Java project: _Open Visual Studio Code and create a new folder where you want to save your Java project. Then, open the Command Palette by pressing Ctrl+Shift+P shortcut key and type "Java: Create Java Project". Press Enter and select a location for the project. Choose a name for your project and select a JDK version to use._
   
5. Create a Java file with "Hello World" code: _Once the project is created, open the src folder and create a new Java file with the name HelloWorld.java. Copy and paste the following code into your file:_

    ```java
        public class HelloWorld {
        public static void main(String[] args) {
            System.out.println("Hello, World!");
        }
    }
    ```

6. Run the program: _Open the Command Palette by pressing Ctrl+Shift+P shortcut key, type "Java: Run Java Program" and press Enter. This will run your program and the output "Hello, World!" should be displayed in the console._