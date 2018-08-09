
public class Runner {
	public static void main(String args[]) {
        
        Account first = new Account("dave", "smith", 1234);
        Account second = new Account("tom", "paul", 1235);
        Account third = new Account("tom", "paul", 1235);
        Account fourth = new Account("tom", "paul", 1235);

        Service service = new Service();
        
        service.addAccount(first);
        service.addAccount(second);
        
        String json = service.getAccountToJSON(1234);
        
        System.out.println(json);
        }

}
