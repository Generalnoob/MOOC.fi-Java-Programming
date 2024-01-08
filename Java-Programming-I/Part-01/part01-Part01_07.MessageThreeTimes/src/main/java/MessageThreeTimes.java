
import java.util.Scanner;

public class MessageThreeTimes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write a message:");
        // Write your program here
        //Saving the input
        String message = scanner.nextLine();
        
        //Printing the input out three times
        System.out.println(message);
        System.out.println(message);
        System.out.println(message);
    }
}
