package com.psl.bean;


//@Entity
//@Table(name = "LOGIN")
public class Login {
	
	private int loginNo;
	private String username;
	private String password;
	//private String customerId;
	private Customer customer;
	
	public Login() {
	}

	
	public int getLoginNo() {
		return loginNo;
	}


	public void setLoginNo(int loginNo) {
		this.loginNo = loginNo;
	}


	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	

	
	
}
