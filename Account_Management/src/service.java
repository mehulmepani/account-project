

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

	public class service {

        Map<Integer, account> accountsMap = new HashMap<Integer, account>();
        
        
        // method to add an account
        public void addAccount(account AccountNumber) {
        	accountsMap.put(AccountNumber.getAccountNumber(), AccountNumber);
        }
        
        // method to get an account
        public account getAccount(int accountNumber) { 
        	return this.accountsMap.get(accountNumber);
        }
        
        public String getAccountToJSON(int accountNumber) {
            GsonBuilder builder = new GsonBuilder();
        	builder.setPrettyPrinting();
        	Gson gson = builder.create(); 
        	String jsonStr = gson.toJson(getAccount(accountNumber));
        	    
        	return jsonStr;
        }
}
