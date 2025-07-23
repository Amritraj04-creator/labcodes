import java.util.Scanner;

public class UserinputA {

	public static void main(String[] args) {
		
		int a,b,c;
		Scanner ac=new Scanner(System.in);
		System.out.println("enter a and b");
		a=ac.nextInt();
		b=ac.nextInt();
		c=a+b;
		System.out.println(c);
		ac.close();
	}
}
