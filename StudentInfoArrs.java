package practical;


import java.util.Scanner;
public class StudentInfoArrs {
    public static void main(String[] args) {
        // Create Scanner object to take user input
        Scanner scanner = new Scanner(System.in);
        // Prompt the user to enter the number of students
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();
        // Create arrays to store student information
        String[] names = new String[numStudents];
        int[] ages = new int[numStudents];
        double[] grades = new double[numStudents];
        // Input student information
        for (int i = 0; i < numStudents; i++) {
            System.out.println("\nEnter details for Student " + (i + 1) + ":");
            System.out.print("Name: ");
            scanner.nextLine(); // Consume newline character
            try {
                names[i] = scanner.nextLine(); // Input full name
                System.out.print("Age: ");
                ages[i] = scanner.nextInt();
                System.out.print("Grade: ");
                grades[i] = scanner.nextDouble();
            } catch (Exception e) {
                System.err.println("Error: Invalid input format. Please enter valid data.");
                scanner.nextLine(); // Consume remaining input
                i--; // Decrement i to re-enter data for the same student
            }
        }
        // Display student information
        System.out.println("\nStudent Information:");
        for (int i = 0; i < numStudents; i++) {
            System.out.println("\nStudent " + (i + 1) + ":");
            System.out.println("Name: " + names[i]);
            System.out.println("Age: " + ages[i]);
            System.out.println("Grade: " + grades[i]);
        }
    }
}
