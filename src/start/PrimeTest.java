package start;

import java.util.Scanner;

public class PrimeTest {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter srange and erange");
		int srange=scan.nextInt();
		int erange=scan.nextInt();
		for(int i=srange;i<=erange;i++) {
			int count=0; 
			for(int j=2;j<=i/2;j++) {
				
				if (i%j==0) {
					count++;
					
				}
			}
			if(count==0) {
				System.out.println("This is a prime"+i);
			}
			else {
				System.out.println("This is not a prime"+i);
			}
		}
	}

}
