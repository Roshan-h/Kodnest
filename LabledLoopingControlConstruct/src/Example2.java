
public class Example2 {
   public static void main(String[] args) {
	  System.out.println("Admision opens for Kodnest technologies. 10 seats are opened for admision.");
	  System.out.println("Note: Only five seats available for online students");
	int a=5;
	outerLoop:do {
		
	 int i=1;
	 innerLoops:do {
		 
		 System.out.println(i +" seat filled");
		 i++;
		 if(i==6) {
			 break outerLoop;
		 }
	 }while(i<=5);
		a++;
	}while(a<=10);
}
}
