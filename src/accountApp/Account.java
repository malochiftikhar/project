package accountApp;
public class Account {
	
	//Fields
	String firstName;
	String lastName;
	int accountNumber;

	//Constructor
	public Account(String firstName, String lastName, int accountNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.accountNumber = accountNumber;
	}
	
	public Account() {
	}
	
	//getters and setters for all above fields
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public String getFullName() {
		String fullname = String.format("%s %s", firstName, lastName);
        return fullname;
	}
}
