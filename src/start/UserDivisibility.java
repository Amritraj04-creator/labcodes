package start;

import java.util.Scanner;

class Div{
	
	public void Rep(int x) {
		
	}
}

public class UserDivisibility {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two numbers you want to check the divisibility");
		int a =scan.nextInt();
		int b =scan.nextInt();
		System.out.println("enter the range");
		int c =scan.nextInt();
		int d =scan.nextInt();
		int e=0;
		int f=0;
		for(int i=c;i<=d;i++) {
			if(i%a==0) {
				 e=e+1;
			}
			if(i%b==0) {
				f=f+1;
			}
		}
		System.out.println("no / by "+a+"="+e);
		System.out.println("no / by "+b+"="+f);
	}

}
