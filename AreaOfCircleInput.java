import java.util.Scanner; 

public class AreaOfCircleInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        
        System.out.print("Enter the radius of the circle: "); // Prompt for input
        int radius = sc.nextInt();  // Read user input

        double pi = 3.1415; 
        double area = pi * radius * radius; // Area formula: πr²

        System.out.println("The area of the circle is: " + area);

        sc.close(); // Close Scanner
    }
}
