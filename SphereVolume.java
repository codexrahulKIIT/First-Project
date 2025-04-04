import java.util.Scanner; 
public class SphereVolume {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		
		System.out.print("Enter Radius: "); 
		double r = sc.nextDouble(); 
		
		double volume = (4.0 / 3) * 3.14159 * (r * r * r ); 
		
		System.out.println("Volume: " + volume); 
		sc.close(); 
		
	}
}