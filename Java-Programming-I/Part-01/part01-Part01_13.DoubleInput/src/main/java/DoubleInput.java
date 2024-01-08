
import java.util.Scanner;

public class DoubleInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // write your program here
        // Ask for a float number
        System.out.println("Give a number:");
        
        // Convert the input from a string to a float
        double number = Double.valueOf(scanner.nextLine());
        
        // Print out the float number
        System.out.println("You gave the number " + number);
    }
}
