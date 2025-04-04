import java.util.Scanner;

public class ifelse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        
        // Input validation
        while (!sc.hasNextInt()) {
            System.out.println("Invalid input! Please enter a valid age (a positive integer).");
            sc.next(); // Clear the invalid input
            System.out.print("Enter your age: ");
        }
        
        int age = sc.nextInt();
        
        if (age >= 18) {
            System.out.println("Adult");
        } else if (age > 0) {
            System.out.println("Child");
        } else {
            System.out.println("Invalid age! Age must be a positive number.");
        }
    }
}