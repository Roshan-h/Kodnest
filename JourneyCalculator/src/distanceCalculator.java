import java.util.Scanner;

public class distanceCalculator {
	public static void main(String[] args) {
		distanceCalculator dc=new distanceCalculator();
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the speed and time of the jourey");
		double speed=scan.nextDouble();
		double time=scan.nextDouble();
		scan.close();
	    System.out.println(dc.calculateDistance(speed,time));
	}
	public double calculateDistance(double speed, double time) {
		
		return speed*time;
	}

}
