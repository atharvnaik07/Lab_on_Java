package practical;

public class Constructor {
    // Instance variables
    private String name;
    private int age;
    // Default constructor
    public F_Constructor() {
        System.out.println("Default Constructor Called");
        // Default values are assigned
        name = "Default";
        age = 0;
    }
    // Parameterized constructor
    public F_Constructor(String n, int a) {
        System.out.println("Parameterized Constructor Called");
        // Values are assigned based on parameters
        name = n;
        age = a;
    }
    // Method to display information
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
    public static void main(String[] args) {
        // Creating objects using both constructors
        F_Constructor obj1 = new F_Constructor();
        F_Constructor obj2 = new F_Constructor("Ram", 20);
        // Displaying information
        System.out.println("\nObject 1:");
        obj1.displayInfo();
        System.out.println("\nObject 2:");
        obj2.displayInfo();
    }
}

