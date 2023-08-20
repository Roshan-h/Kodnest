import java.util.Scanner;

public class TemperaureConveretrApp {
 public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the value of temperature: ");
	double fahrenheit=scan.nextDouble();
	scan.close();
	TempueratureConverter temperatureConverter=new TempueratureConverter();
	double res=temperatureConverter.convertFahrenheitToCelsius(fahrenheit);
	System.out.println(res);
	
	
}  
}
