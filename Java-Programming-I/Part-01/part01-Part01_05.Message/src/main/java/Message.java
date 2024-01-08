import java.util.Scanner;
 
public class Message {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        System.out.println("Write a message:");
        // Write your program here
        //Store the input
        String message = scanner.nextLine();
        //Printing it out
        System.out.println(message);
    }
}