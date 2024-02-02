public class StaticVariableExample {
    private static int count = 0; // this is a static variable
    public static void main(String[] args) {
        // program logic goes here

        // increment the count variable
        count++;

        // call the static method to print the count
        printCount();
    }
        public static void printCount() {
            System.out.println("Number of Example objects created so far: " + count);
        }
    }
