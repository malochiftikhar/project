package accountApp;

public class Main {

	public static void main(String[] args) {

		Account account1 = new Account("iftikhar", "khan", 15205156);
		Service service = new Service();
		service.addAccount(account1);	
		System.out.println(service.toJSON());
	}
}