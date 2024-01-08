
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // This keeps track of the numbers
        int value = 0;

        //Setting up a while loop to keep everything in motion
        while (true) {
            // Asking for a new number
            System.out.println("Give a number: ");
            // Reading the inputted number
            int number = Integer.valueOf(scanner.nextLine());

            // Checking if the value is 0
            if (number == 0) {
                // If the value is 0 break the loop
                break;
            // Checking if value is negative, if so it counts +1
            } else if (number < 0){
                // if the value is not 0 then keep counting
                value = value + 1;
            }
        }

        // Once everything is counted print out the end result
        System.out.println("Number of negative numbers: " + value);
        // closing the Scanner to stop leaks
        scanner.close();
    }
}
