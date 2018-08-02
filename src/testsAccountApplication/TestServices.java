package testsAccountApplication;

import static org.junit.Assert.*;

import org.junit.Test;

import accountApp.Account;
import accountApp.Service;

public class TestServices {
	private Account account = new Account("iftikhar", "khan", 7364527);
	private Service service = new Service();	
	
	@Test
	public void testSetFName() {
		account.setFirstName("iftikhar");
		assertEquals("First name not set", account.getFirstName(), "iftikhar");
	}
	
	@Test
	public void testSetLName() {
		account.setLastName("khan");
		assertEquals("Last name not set", account.getLastName(), "khan");
	}
	
	@Test
	public void getFullName() {
		assertEquals("Can not get valid output", account.getFullName(),"iftikhar khan");
	}
	
	@Test
	public void setAccountNumber() {
		account.setAccountNumber(7364527);
		assertEquals("account number can not be set", account.getAccountNumber(),7364527);
	}
	
	@Test
	public void getFirstName() {
		account.getFirstName();
		assertEquals("can not get output for first name", account.getFirstName(),"iftikhar");
	}
	
	@Test
	public void getLastName() {
		account.getLastName();
		assertEquals("can not get output for last name", account.getLastName(), "khan");
	}
	
	@Test
	public void addAccount() {
		Service service = new Service();
		service.addAccount(account);
		assertEquals("account not added", service.getAccounts().toString(),"{7364527=iftikhar khan}");
	}
	
	@Test
	public void testToJSON() {
		service.addAccount(account);
		service.toJSON();
		assertEquals("can not convert to JSON",service.toJSON().toString(),"{\"7364527\":\"iftikhar khan\"}");
	}
}
