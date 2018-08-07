

	import java.util.HashMap;
	import java.util.Iterator;
	import java.util.Map;

	public class service {

		public static void main(String args[]) {
	        Map<Object, Integer> accounts = new HashMap<Object, Integer>();
	        
	        account first = new account("First", "second", 3468);
	        account second = new account("third", "fourth", 235);
	        accounts.put(first, 3);
	        accounts.put(second, 4);
	        
	        System.out.println(accounts.size());
	        
	        for(Object name: accounts.keySet()) {
	            System.out.println(name +" "+accounts.get(name.toString()));

	        }
	        
	     

		}
	
	

}
