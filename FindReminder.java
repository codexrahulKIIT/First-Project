// Take two intgeres input a and b: a>b, and find the remainder when a is divded by b;

import java.util.Scanner; 

public class FindReminder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        
        System.out.print("Enter dividend: ");
        int a = sc.nextInt(); 
        
        System.out.print("Enter divisor: ");
        int b = sc.nextInt();
        
        int r = a % b; // Calculate remainder

        System.out.println("The remainder when " + a + " is divided by " + b + " is " + r);

        sc.close(); // Close Scanner
    }
}
