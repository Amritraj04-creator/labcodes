package start;

import java.util.Scanner;

public class Even {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int a =scan.nextInt();
		if(a%2==0) {
			System.out.println("the number is even");
		}
		else {
			System.out.println("the number is odd");
		}
	}

}
