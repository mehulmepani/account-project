import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

	public class Service {

        Map<Integer, Account> accountsMap = new HashMap<Integer, Account>();
        
        public void addAccount(Account AccountNumber) {
        	accountsMap.put(AccountNumber.getAccountNumber(), AccountNumber);
        }

        public Account getAccount(int accountNumber) { 
        	return this.accountsMap.get(accountNumber);
        }
        
        public String getAccountToJSON(int accountNumber) {
            GsonBuilder builder = new GsonBuilder();
        	builder.setPrettyPrinting();
        	Gson gson = builder.create(); 
        	String jsonStr = gson.toJson(getAccount(accountNumber));
        	    
        	return jsonStr;
        }

		public int cyclingThroughHash(String name) {
			int counter = 0;
			Iterator i = accountsMap.entrySet().iterator();
		        
		    for (Account value: accountsMap.values()) {
		    	if (value.getFirstName().equals(name)) {
		    		counter++;
		    	}  	 
			}
			return counter;
		}
}
