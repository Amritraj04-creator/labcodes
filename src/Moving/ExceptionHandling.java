package Moving;

import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter");
		int a=10;
		try {
		int b=sc.nextInt();
		int c=a/b;
		System.out.println(c);
		}
		catch(Exception ae) {
			System.out.println("both exceptions are here="+ae);
			ExceptionHandling.main(args);
		}
		
	}
	
}
