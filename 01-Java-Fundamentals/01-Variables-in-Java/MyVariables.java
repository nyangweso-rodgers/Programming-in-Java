// Varaibles in Java

// public class 
class MainClass {
    public static void main(String[] args) {
        MyVariables.main(args); //
        Rectangle.main(args); //
    }
}

// length variable
 class MyVariables {
    public static void main(String[] args) {
     final int length; 
     length = 50;
      System.out.println(length); // Output: 50
    }
}

// get area of the rectangle
class Rectangle {
    public static void main(String[] args) {
        int width = 100;
        int length = 20;
        System.out.println(width * length); // Output:
    }
}