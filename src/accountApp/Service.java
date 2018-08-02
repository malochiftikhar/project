package accountApp;

import java.util.HashMap;
import java.util.Map;
import org.json.simple.*;

public class Service {

	private Map<Integer, Account> accounts = new HashMap<Integer, Account>();

	public void addAccount(Account account) {
		accounts.put(account.getAccountNumber(), account);
	}

	public Map<Integer, Account> getAccounts() {
		for (Map.Entry<Integer, Account> entry : accounts.entrySet()) {
			System.out.println(entry.getKey() + ", " + entry.getValue());
		}
		//System.out.println(accounts.size());
		return accounts;
	}
	
	public JSONObject toJSON() {
		JSONObject obj = new JSONObject(accounts);
		return obj;
	}

	public int amountAccount(String name) {
		int count = 0;
		for(Account value : accounts.values()) {
			if(value.getFirstName().equalsIgnoreCase(name))
				count++;
		}
		return count;
	}
}