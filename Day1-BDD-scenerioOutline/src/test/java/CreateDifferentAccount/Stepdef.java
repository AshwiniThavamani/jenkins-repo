package CreateDifferentAccount;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.cap.model.Account;
import org.cap.model.Address;
import org.cap.model.Customer;
import org.cap.service.AccountService;
import org.cap.service.IAccountService;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdef {

	Customer customer;
	double openingBalance;
	Account account ;
	IAccountService accountService;
	@Before
	public void setUp() 
	{
		customer=new Customer();
		accountService=new AccountService();
		
		
	}
	
	
	@Given("^Customer Details with account type and opening balance$")
	public void customer_Details_with_account_type_and_opening_balance() throws Throwable {
	
		  customer.setFirstName("ash");
		  customer.setLastName("t");
		  Address address=new Address();
		  address.setCity("vellore");
		  address.setDoorNo("78");
		  customer.setAddress(address);
		  openingBalance=1000;
	}

	@When("^For valid customer with minimum opening balance (\\d+)$")
	public void for_valid_customer_with_minimum_opening_balance(int amount) throws Throwable {
	this.openingBalance=amount;
	}

	@Then("^create new Savings Account$")
	public void create_new_Savings_Account() throws Throwable {
	 
	  account=accountService.createAccount(customer, 1000);
	  assertNotNull(account);
	  assertEquals("savings", account.getAccountType());
	}

	@Then("^create new Current Account$")
	public void create_new_Current_Account() throws Throwable {
		  account=accountService.createAccount(customer, 10000);
		  assertNotNull(account);
		  assertEquals("Current", account.getAccountType());
	}

	@Then("^create new RD Account$")
	public void create_new_RD_Account() throws Throwable {
		  account=accountService.createAccount(customer, 100);
		  assertNotNull(account);
		  assertEquals("RD", account.getAccountType());
	}

	@Then("^create new FD Account$")
	public void create_new_FD_Account() throws Throwable {
		  account=accountService.createAccount(customer, 500);
		  assertNotNull(account);
		  assertEquals("FD", account.getAccountType());
	}
	
}
