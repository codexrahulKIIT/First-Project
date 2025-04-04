import java.util.Scanner;

public class New {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // 1. Take Integer Input and Perform Addition
            System.out.print("Enter first number: ");
            while (!scanner.hasNextInt()) {  // Ensures valid integer input
                System.out.println("Invalid input! Please enter a number.");
                scanner.next(); // Consume invalid input
            }
            int num1 = scanner.nextInt();

            System.out.print("Enter second number: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input! Please enter a number.");
                scanner.next();
            }
            int num2 = scanner.nextInt();

            int sum = num1 + num2;
            System.out.println("Sum: " + sum);

            // 2. Fix String Input Handling
            scanner.nextLine(); // Consume leftover newline
            System.out.print("Enter your name: ");
            String name = scanner.nextLine();
            System.out.println("Hello, " + name.toUpperCase() + "!");

            // 3. Take an Array Input and Find Maximum Value
            System.out.print("Enter the number of elements in the array: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input! Please enter a number.");
                scanner.next();
            }
            int n = scanner.nextInt();

            int[] arr = new int[n];
            System.out.println("Enter " + n + " numbers:");

            for (int i = 0; i < n; i++) {
                while (!scanner.hasNextInt()) {
                    System.out.println("Invalid input! Please enter a number.");
                    scanner.next();
                }
                arr[i] = scanner.nextInt();
            }

            int max = arr[0];
            for (int i = 1; i < n; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                }
            }

            System.out.println("Maximum value in the array: " + max);
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            scanner.close(); // Close scanner to prevent resource leak
        }
    }
}
