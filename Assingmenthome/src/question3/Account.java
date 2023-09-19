package question3;

public class Account {
	private int accountNumber;
	private String accountHolderName;
	private int balace;
	private String location;
	public Account(int accountNumber, String accountHolderName, int balace, String location) {
		super();
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.balace = balace;
		this.location = location;
	}
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public int getBalace() {
		return balace;
	}
	public void setBalace(int balace) {
		this.balace = balace;
	}
	public String getLocation() {
		return location;
	}
	public void setLoocation(String location) {
		this.location = location;
	}
	
	
	
	

}
