package practical;


public class WrapperClass {
    public static void main(String[] args) {
        // Using static factory methods and autoboxing
        Integer intObj = Integer.valueOf(42); // Using valueOf method
        Double doubleObj = Double.valueOf(3.14); // Using valueOf method
        Character charObj = Character.valueOf('A'); // Using valueOf method
        Boolean boolObj = Boolean.valueOf(true); // Using valueOf method
        // Autoboxing (automatic conversion from primitive type to wrapper object)
        Integer autoboxedInt = 100;
        // Unboxing (automatic conversion from wrapper object to primitive type)
        int unboxedInt = autoboxedInt;
        // Displaying values
        System.out.println("Integer Object: " + intObj);
        System.out.println("Double Object: " + doubleObj);
        System.out.println("Character Object: " + charObj);
        System.out.println("Boolean Object: " + boolObj);
        System.out.println("Autoboxed Integer: " + autoboxedInt);
        System.out.println("Unboxed Integer: " + unboxedInt);
        // Using wrapper classes with methods
        String numStr = "123";
        int parsedInt = Integer.parseInt(numStr);
        System.out.println("Parsed Integer: " + parsedInt);
        // Converting int to String using toString method
        String intStr = Integer.toString(456);
        System.out.println("Converted Integer to String: " + intStr);
    }
}