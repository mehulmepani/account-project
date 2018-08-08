
public class Runner {
	public static void main(String args[]) {
        
		// create accounts with account class
        account first = new account("dave", "smith", 1234);
        account second = new account("tom", "paul", 1235);
        account third = new account("tom", "paul", 1235);
        account fourth = new account("tom", "paul", 1235);

        // setup service instance
        service service = new service();
        
        // use the addAccount method (inside paramanter use account
        service.addAccount(first);
        service.addAccount(second);
        
        String json = service.getAccountToJSON(1234);
        
        System.out.println(json);
        }

}
