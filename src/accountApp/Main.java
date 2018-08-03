package accountApp;

public class Main {

	public static void main(String[] args) {

		Account account1 = new Account("iftikhar", "khan", 15205156);
		Account account2 = new Account("iftikhar", "khan", 25205156);
		Account account3 = new Account("iftikhar", "khan", 35205156);
		Service service = new Service();
		service.addAccount(account1);
		service.addAccount(account2);
		service.addAccount(account3);
		System.out.println(service.toJSON());
		System.out.println(service.amountAccount("iftikhar"));
	}
}