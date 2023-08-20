import java.util.Scanner;

public class Demo {
 public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter a marks");
	int marks=scan.nextInt();
	scan.close();
	System.out.println("Welcome to Kodnest");
	greet(marks);
}
 public static void greet(int marks) {
	 if(marks>=80) {
		 System.out.println("Welcome to TechClub");
	 }
	 
 }
}
