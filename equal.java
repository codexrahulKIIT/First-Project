import java.util.Scanner; 

public class equal {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the first number: ");
		 int a = sc.nextInt(); 
		 System.out.println("Enter the second number: "); 
		 int b = sc.nextInt();
		  if(a == b ) {
			  System.out.println("Together equal"); 
		  } else if (a > b) {
			  System.out.println("A is greter than b");
		  } 
		  else if(a < b){
			  System.out.println("A is smaller than b");
		  }
			  else{
			  System.out.println("Lesser");
		  }
		
	}
}