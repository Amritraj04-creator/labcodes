import java.util.Scanner;

public class Addmainclass {
	
	public static void main(String[] args) {
		
		int a,b;
		Scanner inp=new Scanner(System.in);
		System.out.println("Enter value of a");
		a=inp.nextInt();
		System.out.println("Enter value of b");
	    	b=inp.nextInt();
		Addclass obj=new Addclass();
		obj.add(a,b);
		inp.close();
	}

}
