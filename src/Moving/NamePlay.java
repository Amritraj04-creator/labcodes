package Moving;

public class NamePlay {
	
	public static void main(String[] args) {
		
		String[] name = {"Amri7t"};
		String[] surname = {"Ra1j"};
		int sum = 0;

		for(int i=0; i<name[0].length();i++)
		{
		char ch = name[0].charAt(i);
		if(Character.isDigit(ch))
		{
		sum+= Character.getNumericValue(ch);
		} 

		}
		for(int i=0; i<surname[0].length();i++)
		{
		char ch = surname[0].charAt(i);
		if(Character.isDigit(ch))
		{
		sum+= Character.getNumericValue(ch);
		} 

		}
		System.out.println(name[0]);
		System.out.println(surname[0]);
		System.out.println("Sum= "+sum);
	}
}