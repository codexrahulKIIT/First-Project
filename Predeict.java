import java.util.Scanner; 

public class Predeict {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter Dividend: "); 
        int i = sc.nextInt(); 
        System.out.print("Enter Divisor: "); 
        int j = sc.nextInt();
        
        // Prevent division by zero
        if (j == 0 || i == 0) {
            System.out.println("Error: Division by zero is not allowed.");
        } else {
            int k = i / j * j; 
            int l = j / i * i; 
            int b = j / i * i; 
            
            System.out.println(k + " " + l + " " + b);
        }
        
        sc.close(); // Close Scanner
    }
}
