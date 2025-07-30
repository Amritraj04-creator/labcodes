import java.util.Scanner;

public class Condition {
	
	public void Number() {
		Condition ads=new Condition();
		
		int a,b,c;
		Scanner gt=new Scanner(System.in);
		System.out.println("enter a and b");
		a=gt.nextInt();
		b=gt.nextInt();
		c=a+b;
		if(c>30)
			System.out.println(c);
		else {
			System.out.println("Enter the number greater than 30");
			ads.Number();
		}
			
	}

}
