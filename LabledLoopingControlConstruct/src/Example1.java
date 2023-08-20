
public class Example1 {
  public static void main(String[] args) {
	int a=1;
	outerLoop:do {
		int i=1;
		innerLoop:do {
			System.out.print(i+" ");
			i++;
			if(i==6) {
				break innerLoop;
			}
		}while(i<=10);
		System.out.println();
		a++;
	}while(a<=5);
}
}
