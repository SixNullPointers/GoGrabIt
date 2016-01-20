package com.psl.dao;

import com.psl.bean.RequestDetails;

public interface RequestDao {

	void insertRequest(RequestDetails req);
	RequestDetails getRequest(int requestId);
	//void updateCustomer(Customer cust);
	void deleteRequest(RequestDetails req);
	
}
