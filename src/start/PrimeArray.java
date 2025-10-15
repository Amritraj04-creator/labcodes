package start;

import java.util.Scanner;

public class PrimeArray {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter srange and erange");
		int srange=scan.nextInt();
		int erange=scan.nextInt();
		int k=0;
		for(int i=srange;i<=erange;i++) {
			int count=0; 
			for(int j=2;j<=i/2;j++) {
				
				if (i%j==0) {
					count++;
					
				}
			}
			if(count==0) {
				k++;
				int a[]=new int[k];
				a[k-1]=i;
				
			}
		}
		for(int i=0;i<k;i++) {
			String[] a = null;
			System.out.println("the prime number are " + a[k]);
		}
		
	}

}
