package Moving;

import java.util.ArrayList;
import java.util.List;


public class Test {

	public static void main(String[] args) {
		
		AccountData amit = new AccountData(1, "amit", 123, 43434);
		AccountData xyz = new AccountData(2, "xyz", 122, 212132);
		AccountData abd = new AccountData(3, "abd", 121, 121212);
		AccountData abc = new AccountData(4, "abc", 125, 1010100);
		
		List<AccountData> list = new ArrayList<>();
		list.add(amit);
		list.add(xyz);
		list.add(abd);
		list.add(abc);
		
		float max=0;
		String name="";
		int count=0;
		
		for(AccountData x:list) {
			System.out.println(x.getName()+""+x.getAccountBalance());
			if(x.getAccountBalance()>max) {
				max=x.getAccountBalance();
				name=x.getName();
				count++;
			}
		}
		System.out.println("Maximum balance="+max+"holding by "+name);
		System.out.println("If block executed "+count+"times");
		
	}
}
