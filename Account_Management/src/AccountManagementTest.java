import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AccountManagementTest {

	
	//cycle through accounts... look for account by given first name.
	@Test
	public void test1() {
		account accfive = new account("dave", "smith", 1234);
		
		service service = new service();
		
		service.addAccount(accfive);
	}

}
