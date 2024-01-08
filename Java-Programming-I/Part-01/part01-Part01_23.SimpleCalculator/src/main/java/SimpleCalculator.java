
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number:");
        int first_number = Integer.valueOf(scanner.nextLine());
        
        System.out.println("Give the second number:");
        int second_number = Integer.valueOf(scanner.nextLine());
        
        double average = first_number / (double) second_number;
        
        System.out.println(first_number + " + " + second_number + " = " + (first_number+second_number));
        System.out.println(first_number + " - " + second_number + " = " + (first_number-second_number));
        System.out.println(first_number + " * " + second_number + " = " + (first_number*second_number));
        System.out.println(first_number + " / " + second_number + " = " + average);
    }
}
