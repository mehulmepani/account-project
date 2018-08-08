

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

	public class service {

		public static void main(String args[]) {
	        Map<Object, Integer> accounts = new HashMap<>();
	        
	        account first = new account("dave", "smith", 1234);
	        account second = new account("tom", "paul", 1235);
	        accounts.put(first, first.getAccountNumber());
	        accounts.put(second, second.getAccountNumber());
	        
	        Set set = accounts.entrySet();
	        
	        Iterator i = set.iterator();
	        
	        while (i.hasNext()) {
	        	Map.Entry MapEntry = (Map.Entry)i.next();
	        	System.out.print("Account: " + MapEntry.getValue());
	        	System.out.println(MapEntry.getKey());
	        	
	        }
	        
		}
	

}
