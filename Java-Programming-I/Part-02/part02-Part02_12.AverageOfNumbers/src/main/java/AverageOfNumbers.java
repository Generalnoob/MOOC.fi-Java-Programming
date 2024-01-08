import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // This keeps track of total times a number is submitted
        int value = 0;
        // this keeps track of the total sum added together
        int totalSum = 0;

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
            } else {
                // adding plus one to each submittion
                value = value + 1;
                // adding the user inputted number plus the current stored number
                totalSum = totalSum + number;
            }
        }

        // Calculate the average
        Double average = (double)totalSum / value;
        // Once everything is counted print out the end result
        System.out.println("Average of the numbers: " + average);
        // closing the Scanner to stop leaks
        scanner.close();
    }
}

