
public class BankAccount {
	private static BankAccountDAO accountDAO;
	public static BankAccountDTO openAccount(String accountNumber) {
		// TODO Auto-generated method stub
		BankAccountDTO accountDTO= new BankAccountDTO(accountNumber);
		return accountDTO;
	}

	public static void setBankAccountDao(BankAccountDAO accountDAO) {
		// TODO Auto-generated method stub
		BankAccount.accountDAO= accountDAO;
	}

}
