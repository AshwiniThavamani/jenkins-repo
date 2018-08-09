package org.cap.service;



import org.cap.model.Account;
import org.cap.model.Customer;


public class AccountService implements IAccountService {

	Account account=null;
	@Override
	public Account createAccount(Customer customer, double amount) {
		// TODO Auto-generated method stub
		if(customer!=null)
		{
			account=new Account();
			account.setCustomer(customer);
	    	if(amount>0)
	    	{
	    		
	    		if(amount==1000) {
	    			account.setAccountType("savings");
	    		account.setOpenBalance(1000);
	    		}
	    		else if(amount==10000) {
	    			account.setAccountType("Current");
	    		account.setOpenBalance(10000);
	    		}
	    		else if(amount==100) {
	    			account.setAccountType("RD");
	    		account.setOpenBalance(100);
	    		}	    		
	    		else if(amount==500) {
	    			account.setAccountType("FD");
	    		account.setOpenBalance(500);
	    		}
	    	}
		
	}
		return account;

}
	}
