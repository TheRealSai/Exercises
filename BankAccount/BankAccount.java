package Bank;

public class BankAccount {

	private String accNum;
	private double balance;
	private String customerName;
	private String email;
	private String phone;
	
	public BankAccount() {
		this("0000000000", 0.0, "Name", "email", "9999999999");
		
	}
	
	public BankAccount(String accNum, double balance, String customerName, String email, String phone) {
		this.accNum = accNum;
		this.balance = balance;
		this.customerName = customerName;
		this.email = email;
		this.phone = phone;
	}
	public void depositFunds (double amt) {
		this.balance += amt;
	}

	public void withdrawFunds (double amt) {
		if (this.balance < amt) {
			System.out.println("Insufficient funds.");
		} else {
			this.balance -= amt;
		}
		//System.out.println("Customer Name: " + this.customerName);
		//System.out.println("Bank balance: " + this.balance);
	}
	public String getInfo() {
		return "Customer Name: " + this.getCustomerName() + ", Account Number: " + this.getAccNum() + 
				", Balance: " + this.getBalance() + ", Email: " + this.getEmail() + ", Phone: " + this.getPhone();
	}
	public String getAccNum() {
		return accNum;
	}

	public String getCustomerName() {
		return customerName;
	}

	public String getEmail() {
		return email;
	}

	public String getPhone() {
		return phone;
	}
	public double getBalance() {
		return balance;
	}

	public void setAccNum(String accNum) {
		this.accNum = accNum;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}


}
