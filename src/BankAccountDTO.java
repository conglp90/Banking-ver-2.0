
public class BankAccountDTO {

	private Double balance;
	private String accountNumber;
	
	public BankAccountDTO(String accountNumber) {
		// TODO Auto-generated constructor stub
		this.accountNumber=accountNumber;
		this.balance=0.0;
	}

	public Double getBalance() {
		// TODO Auto-generated method stub
		return balance;
	}

	public String getAccountNumber() {
		// TODO Auto-generated method stub
		return accountNumber;
	}
	
	public void setBalance(Double balance) {
		// TODO Auto-generated method stub
		this.balance=balance;
	}

	public void setAccountNumber() {
		// TODO Auto-generated method stub
		this.accountNumber=accountNumber;
	}

}
