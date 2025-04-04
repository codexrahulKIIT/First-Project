import java.util.Scanner;  
public class modulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
        System.out.print("Enter Dividend: ");  
        int a = sc.nextInt();  
        System.out.print("Enter Divisor: ");  
        int b = sc.nextInt();  
        int q = a / b;  
        int r = a % b;  
        System.out.println("The remainder when " + a + " is divided by " + b + " is " + r);  
        sc.close();  // Closing the scanner
    }
}
