import java.util.Scanner;

public class Bascis {  // Class name matches file name
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Take Integer Input and Perform Addition
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        
        int sum = num1 + num2;
        System.out.println("Sum: " + sum);

        // 2. Take String Input and Convert to Uppercase
        scanner.nextLine(); // Consume newline
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name.toUpperCase() + "!");

        // 3. Take an Array Input and Find Maximum Value
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        
        System.out.println("Maximum value in the array: " + max);
        
        scanner.close();
    }
}
