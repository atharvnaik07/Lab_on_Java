package practical;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class TextStreamObject {
    public static void main(String[] args) {
        // Create a Scanner to take input from the user
        Scanner scanner = new Scanner(System.in);
        // Prompt the user for input
        System.out.print("Enter text to write to the file: ");
        String userInput = scanner.nextLine();
        // Specify the file path
        String filePath = "output.txt";
        // Use BufferedWriter to write the user input to the text file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            // Write the user input to the file
            writer.write(userInput);
            System.out.println("Text has been written to the file successfully.");
        } catch (IOException e) {
            System.err.println("An error occurred while writing to the file: " + e.getMessage());
        } finally {
            // Close the scanner
            scanner.close();
        }
    }
}