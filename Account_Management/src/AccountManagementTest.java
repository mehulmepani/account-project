import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AccountManagementTest {

	@Test
	public void test1() {
		Account accountOne = new Account("dave", "smith", 1234);
		Account accountTwo = new Account("dave", "tom", 6789);
		
		Service service = new Service();
		
		service.addAccount(accountOne);
		service.addAccount(accountTwo);

		assertEquals(2, service.cyclingThroughHash("dave"));
	}
}
