package accountApp;

import java.util.HashMap;
import java.util.Map;

public class Service {

	Map<Integer, String> accounts = new HashMap<Integer, String>();

	public void addAccount(Account account) {
		accounts.put(account.getAccountNumber(), account.getFullName());
	}

	public Map getAccounts() {
		for (Map.Entry<Integer, String> entry : accounts.entrySet()) {
			System.out.println(entry.getKey() + "," + entry.getValue());
		}
		return accounts;
	}
}