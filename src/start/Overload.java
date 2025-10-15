package start;

import java.util.Scanner;

class TestOverload{
	
	public TestOverload() {
		System.out.println("hi from overload");
	}
	
	public void add(int a) {
		
		System.out.println(a*a);
	}
}

public class Overload {
	
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in); 
		TestOverload obj = new TestOverload();
		System.out.println("enter the number");
	    int a=scan.nextInt();
		obj.add(a);
	}

}
