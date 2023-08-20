import java.util.Scanner;

public class TemperatureApp {
 public static void main(String[] args) {
	System.out.println("Welcome to the Temperature Conversion Tool!");
	System.out.print("Select an option:\r\n"
			+ "\r\n"
			+ "1. Convert Celsius to Fahrenheit\r\n"
			+ "\r\n"
			+ "2. Convert Fahrenheit to Celsius\r\n"
			+ "\r\n"
			+ "Enter your choice: ");
	Scanner scan=new Scanner(System.in);
	
	int choice=scan.nextInt();
	switch(choice) {
	case 1:
		System.out.println("Enter the temperature in Celsius:");
		double celsius=scan.nextDouble();
		System.out.println(celsius+" is equivalent to "+TemperatureConverter.celsiusToFahrenheit(celsius)); 
		
		break;
	case 2:
		System.out.println("Enter the temperature in fahrenheit:");
		double fahrenheit=scan.nextDouble();
		System.out.println(fahrenheit+" is equivalent to "+TemperatureConverter.fahrenheitToCelsius(fahrenheit)); 
		break;
	}
	scan.close();
	
}
}
