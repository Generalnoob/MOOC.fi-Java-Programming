
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        // Strings first
        System.out.println("Give a string:");
        String main_string = scanner.nextLine();
        
        // Int's second
        System.out.println("Give an integer:");
        int int_number = Integer.valueOf(scanner.nextLine());
        
        // Floats third
        System.out.println("Give a double:");
        double float_number = Double.valueOf(scanner.nextLine());
        
        // Booleans Last
        System.out.println("Give a boolean:");
        boolean boo = Boolean.valueOf(scanner.nextLine());
        
        // Print out each value
        System.out.println("You gave the string " + main_string);
        System.out.println("You gave the integer " + int_number);
        System.out.println("You gave the double " + float_number);
        System.out.println("You gave the boolean " + boo);
    }
}
