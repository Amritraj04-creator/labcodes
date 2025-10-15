package Moving;

public class AccountData {

	int id;
	String name;
	double accountNumber;
	float accountBalance;

	public AccountData(int id, String name, double accountNumber, float accountBalance) {
		super();
		this.id = id;
		this.name = name;
		this.accountNumber = accountNumber;
		this.accountBalance = accountBalance;
	}
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public double getAccountNumber() {
		return accountNumber;
	}
	public float getAccountBalance() {
		return accountBalance;
	}
	
	
}
