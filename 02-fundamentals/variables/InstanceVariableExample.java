// Instance Variables
public class InstanceVariableExample {
    int instanceVarExample; // instance variable

    public static void main(String[] args) {
        // create an instance of the class to create the instance variable
        InstanceVariableExample instance = new InstanceVariableExample();

        // access the instance variable through the instance
        instance.instanceVarExample = 10;
        System.out.println(instance.instanceVarExample); // Output: 10
    }
}
