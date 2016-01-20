package com.psl.dao;

import com.psl.bean.Customer;

public interface CustomerDao {

	void insertCustomer(Customer cust);
	Customer getCustomer(int custId);
	void updateCustomer(Customer cust);
	void deleteCustomer(Customer cust);

	
}
