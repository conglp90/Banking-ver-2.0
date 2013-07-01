import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.*;

import org.junit.Test;
public class TestBanking {

	  @Test
	    public void testOpenAccountReturnAccountWithSameAccountNumberAndZeroBalance() {
	        BankAccountDTO accountDTO= BankAccount.openAccount("1234567890");
	        assertEquals(accountDTO.getBalance(), 0.0, 0.01);
	        assertEquals(accountDTO.getAccountNumber, 0.0, 0.01);
	    }
}
