import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.reset;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.mockito.ArgumentCaptor;

public class TestBanking {
		private static BankAccountDAO accountDao= mock(BankAccountDAO.class);
		
	  @Before
	    public void setUp () {
	        reset(accountDao);
	        BankAccount.setBankAccountDao(accountDao);
	    }
	  
	  @Test
	    public void testOpenAccountReturnAccountWithSameAccountNumberAndZeroBalance() {
	        BankAccountDTO accountDTO= BankAccount.openAccount("1234567890");
	        
	        assertEquals(accountDTO.getBalance(), 0.0, 0.01);
	        assertEquals(accountDTO.getAccountNumber(), "1234567890");
	    }
	  
	  @Test
	    public void OpenAccountMustSaveNewAccountToDB() {
	    	ArgumentCaptor<BankAccountDTO> accountDTOCaptor = ArgumentCaptor.forClass(BankAccountDTO.class);
	    	
	    	BankAccount.openAccount("1234567890");
	    	
	    	verify(accountDao,times(1)).save(accountDTOCaptor.capture());
	    	assertEquals(accountDTOCaptor.getValue().getBalance(), 0.0, 0.01);
	    	assertEquals(accountDTOCaptor.getValue().getAccountNumber(),"1234567890");
	    	

	    }
}
