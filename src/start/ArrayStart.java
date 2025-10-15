package start;

import java.util.Scanner;

public class ArrayStart {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int a[] = new int[5];
		String name[] = new String[5];
		System.out.println("Enter array");
		for(int i=0;i<2;i++) {
			a[i]=scan.nextInt();
			name[i]=scan.next();
		}
		for(int i=0;i<5;i++) {
			System.out.println(a[i]+" name ="+name[i]);
		}
	}

}
