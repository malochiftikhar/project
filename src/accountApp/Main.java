package accountApp;

public class Main {

	public static void main(String[] args) {

		Account account1 = new Account("iftikhar", "khan", 15205156);
		Account account2 = new Account("Nelvin", "Joseph", 76253819);
		//System.out.println(account1.getFullName());
		Service service = new Service();
		service.addAccount(account1);	
		service.addAccount(account2);
		System.out.println(service.getAccounts());
	}
}