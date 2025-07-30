import java.util.Scanner;

public class Str {
	
	public static void main(String[] args) {
		
		String name;
		Scanner gp=new Scanner(System.in);
		System.out.println("Enter your name");
		name=gp.nextLine();
		if (name.length()>=4) {
			char fourthLetter = name.charAt(3);
			System.out.println("The fourth letter is:" + fourthLetter);	
		}
		else {
			System.out.println("You dont have a fourth letter");
		}
		gp.close();
		
	}

}
