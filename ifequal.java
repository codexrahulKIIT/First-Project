
import java.util.Scanner;

public class ifequal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a == b) {
            System.out.println("Yes");
        } else if (a > b) {  // Directly using else if
            System.out.println("a is greater than b");
        } else {  // Handling a < b case
            System.out.println("b is greater than a");
        }

        sc.close(); // Closing Scanner
    }
}
