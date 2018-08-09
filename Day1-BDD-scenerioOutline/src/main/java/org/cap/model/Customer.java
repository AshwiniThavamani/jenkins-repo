package org.cap.model;

public class Customer {

	private String FirstName;
	private String LastName;
	private Address address;
	private Account accounts;
	
	public Account getAccounts() {
		return accounts;
	}
	public void setAccounts(Account accounts) {
		this.accounts = accounts;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public Customer() {
		
	}
	public Customer(String firstName, String lastName, Address address, Account accounts) {
		super();
		FirstName = firstName;
		LastName = lastName;
		this.address = address;
		this.accounts = accounts;
	}
	@Override
	public String toString() {
		return "Customer [FirstName=" + FirstName + ", LastName=" + LastName + ", address=" + address + ", accounts="
				+ accounts + "]";
	}
	
	
	
}
