package org.cap.model;

public class Account {

	private int accountNo;
	private double openBalance;
	private Customer customer;
	private String accountType;
	
	
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public int getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	public double getOpenBalance() {
		return openBalance;
	}
	public void setOpenBalance(double openBalance) {
		this.openBalance = openBalance;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	public Account() {
		
	}
	public Account(int accountNo, double openBalance, Customer customer, String accountType) {
		super();
		this.accountNo = accountNo;
		this.openBalance = openBalance;
		this.customer = customer;
		this.accountType = accountType;
	}
	@Override
	public String toString() {
		return "Account [accountNo=" + accountNo + ", openBalance=" + openBalance + ", customer=" + customer
				+ ", accountType=" + accountType + "]";
	}
	
	
	
}
