package accountApp;

import java.util.HashMap;
import java.util.Map;
import org.json.simple.*;

public class Service {

	private Map<Integer, String> accounts = new HashMap<Integer, String>();

	public void addAccount(Account account) {
		accounts.put(account.getAccountNumber(), account.getFullName());
	}

	public Map getAccounts() {
		for (Map.Entry<Integer, String> entry : accounts.entrySet()) {
			System.out.println(entry.getKey() + ", " + entry.getValue());
		}
		System.out.println(accounts.size());
		return accounts;
	}
	
	public JSONObject toJSON() {
		JSONObject obj = new JSONObject(accounts);
//		String g = obj.toJSONString(accounts);
//		System.out.println(g);
		return obj;
	}
}