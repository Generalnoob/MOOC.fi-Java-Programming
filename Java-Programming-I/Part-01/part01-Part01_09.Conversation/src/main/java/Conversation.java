
import java.util.Scanner;

public class Conversation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        //How you doing(in a joey accent)
        System.out.println("Greetings! How are you doing?");
        // Store the response
        String first = scanner.nextLine();
        
        //Getting posh
        System.out.println("Oh, how interesting. Tell me more!");
        // Store the response
        String second = scanner.nextLine();
        
        //Thanks for sharing
        System.out.println("Thanks for sharing!");
    }
}
