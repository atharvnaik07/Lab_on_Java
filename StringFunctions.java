package practical;

public class StringFunctions {
    public static void main(String[] args) {
        // Initialization of strings
        String str1 = "Hello, ";
        String str2 = "Java!";
        String str3 = "java";
        String str4 = " Trim me! ";
        String str5 = "Programming is fun.";
        // Concatenation
        String resultConcat = str1.concat(str2);
        System.out.println("Concatenation Result: " + resultConcat);
        // Length
        int length = str1.length();
        System.out.println("Length of str1: " + length);
        // Character at index
        char charAtIndex = str2.charAt(3);
        System.out.println("Character at index 3 in str2: " + charAtIndex);
        // Substring
        String substring = str5.substring(0, 11);
        System.out.println("Substring of str5 (0-10): " + substring);
        // Uppercase and lowercase
        String uppercase = str3.toUpperCase();
        System.out.println("Uppercase of str3: " + uppercase);
        String lowercase = str2.toLowerCase();
        System.out.println("Lowercase of str2: " + lowercase);
        // Replace
        String replacedString = str5.replace("fun", "awesome");
        System.out.println("After replacement: " + replacedString);
        // Trim
        String trimmedString = str4.trim();
        System.out.println("After trimming str4: '" + trimmedString + "'");
        // Checking equality
        boolean isEqual = str3.equals(str2);
        System.out.println("Are str3 and str2 equal? " + isEqual);
        // Comparison
        int comparison = str3.compareTo(str2);
        System.out.println("Comparison result (str3 vs. str2): " + comparison);
    }
}
