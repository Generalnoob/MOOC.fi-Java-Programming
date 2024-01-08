
import java.util.Scanner;

public class Squared {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int value1 = Integer.valueOf(scan.nextLine());

        int total = value1 * value1;
        
        System.out.println(total);
    }
}
