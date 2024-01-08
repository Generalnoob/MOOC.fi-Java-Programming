
import java.util.Scanner;

public class Greeting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        // Request their name
        System.out.println("What's your name?");
        
        //Saving the input
        String name = scanner.nextLine();
        
        //Printing the input out three times
        System.out.println("Hi " + name);
    }
}
