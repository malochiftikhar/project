package accountApp;

public class Main {

	public static void main(String[] args) {

		Account account1 = new Account("iftikhar", "khan", 15205156);
		Account account2 = new Account("Nelvin", "Joseph", 76253819);
		Account account3 = new Account("Louis", "Goldfinch", 16275156);
		Account account4 = new Account("Bibek", "Gurung", 76353810);
		Account account5 = new Account("Assad", "Hussain", 15605556);
		Account account6 = new Account("Nelvin", "Joseph", 75553519);
//		System.out.println(account1.getFullName());
		Service service = new Service();
		service.addAccount(account1);	
		service.addAccount(account2);
		service.addAccount(account3);
		service.addAccount(account4);	
		service.addAccount(account5);
		service.addAccount(account6);
		//System.out.println(service.getAccounts());
//		System.out.println(service.getAccounts());
		System.out.println(service.toJSON());
	}
}