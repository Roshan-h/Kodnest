import java.util.Scanner;

public class Demo {
 public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter age");
    int age=scan.nextInt();
    scan.close();
    Validate v=new Validate();
    v.calculate(age);
    
    
}
}
