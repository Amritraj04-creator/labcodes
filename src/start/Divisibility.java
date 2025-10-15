package start;

import java.util.Scanner;

public class Divisibility {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter your range");
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=0;
		for(int i=a;i<=b;i++) {
			if(i%3==0) {
				c++;
			}
		}
		System.out.println("no / by 3 ="+c);
		c=0;
		for(int i=a;i<=b;i++) {
			if(i%4==0) {
				c++;
			}
		}
		System.out.println("no / by 4 ="+c);
		c=0;
		for(int i=a;i<=b;i++) {
			if(i%5==0) {
				c++;
			}
		}
		System.out.println("no / by 5 ="+c);
		c=0;
		
		
	}

}
