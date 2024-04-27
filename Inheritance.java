package practical;

// Base class (parent class)
class Animal {
    // Properties
    private String name;
    private int age;
    // Constructor
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    // Method to get information
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
// Derived class (subclass) inheriting from Animal
class Dog extends Animal {
    // Additional properties specific to Dog
    private String breed;
    // Constructor for Dog
    public Dog(String name, int age, String breed) {
        // Call the constructor of the base class (Animal)
        super(name, age);
        this.breed = breed;
    }
    // Method to display additional information for Dog
    public void displayDogInfo() {
        // Call the method of the base class (Animal)
        displayInfo();
        System.out.println("Breed: " + breed);
    }
}
public class Inheritance {
    public static void main(String[] args) {
        // Create an instance of the base class (Animal)
        Animal animal1 = new Animal("Leo", 5);
        // Display information using the base class method
        System.out.println("Animal Information:");
        animal1.displayInfo();
        System.out.println();
        // Create an instance of the derived class (Dog)
        Dog dog1 = new Dog("Buddy", 3, "Labrador");
        // Display information using both base and derived class methods
        System.out.println("Dog Information:");
        dog1.displayDogInfo();
    }
}

