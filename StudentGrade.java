import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Marks (out of 100) for 3 subjects: ");
        int m1 = sc.nextInt(), m2 = sc.nextInt(), m3 = sc.nextInt();

        int total = m1 + m2 + m3;
        double percentage = total / 3.0;
        char grade = (percentage >= 90) ? 'A' : (percentage >= 80) ? 'B' : 
                     (percentage >= 70) ? 'C' : (percentage >= 60) ? 'D' : 'F';

        System.out.println("\nStudent: " + name);
        System.out.println("Total Marks: " + total);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);

        sc.close();
    }
}
