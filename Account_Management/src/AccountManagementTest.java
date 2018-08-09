import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AccountManagementTest {

	
	//cycle through accounts... look for account by given first name.
	@Test
	public void test1() {
		account accfive = new account("dave", "smith", 1234);
		account accsix = new account("dave", "tom", 6789);
		service service = new service();
		
		service.addAccount(accfive);
		service.addAccount(accsix);
		
		// use while loop 
		
		assertEquals(2, service.cyclingThroughHash("dave"));
		//stuff
		// create a method that will have a string parameter
		
		//while loop to loop through hash if it has anymore entry
		
		//for loop to loop through the hash checking the value
		
		//if statement to check the values passed on by the parameter exists
		
		//if it exist, add a counter to count them
		
		
	}

}
