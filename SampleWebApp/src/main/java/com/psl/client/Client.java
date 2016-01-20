package com.psl.client;

import java.util.Date;

import com.psl.bean.Category;
import com.psl.bean.Customer;
import com.psl.bean.CustomerStatus;
import com.psl.bean.Login;
import com.psl.bean.Product;
import com.psl.bean.Query;
import com.psl.bean.QueryReplyDetails;
import com.psl.bean.RequestDetails;
import com.psl.bean.RequestStatus;
import com.psl.bean.Review;
import com.psl.bean.ReviewReplyDetails;
import com.psl.dao.CategoryDaoImpl;
import com.psl.dao.CustomerDaoImpl;
import com.psl.dao.LoginDaoImpl;
import com.psl.dao.ProductDaoImpl;
import com.psl.dao.QueryDaoImpl;
import com.psl.dao.QueryReplyDaoImpl;
import com.psl.dao.RequestDaoImpl;
import com.psl.dao.ReviewDaoImpl;
import com.psl.dao.ReviewReplyDaoImpl;

public class Client {

public static void main(String[] args) {
	Category cat = new Category();
	//cat.setCategoryId(1);
	cat.setCategoryName("Laptop");

	CategoryDaoImpl dao = new CategoryDaoImpl();
	dao.insertCategory(cat);
	System.out.println("Record inserted");
	
	Customer cust = new Customer();
	//cust.setCustomerId(1);
	cust.setFirstName("Om");
	cust.setLastName("Shankar");
	cust.setContactNo("9654345678");
	cust.setEmail("om.shankar@gmail.com");
	cust.setStatus(CustomerStatus.ACTIVE);
	
	CustomerDaoImpl daocust = new CustomerDaoImpl();
	daocust.insertCustomer(cust);
	System.out.println("customer inserted");
	
	
	Login login = new Login();
	login.setUsername("omshankar");
	login.setPassword("omshankar");
	login.setCustomer(cust);
	LoginDaoImpl daologin = new LoginDaoImpl();
	daologin.insertLogin(login);
	System.out.println("Login inserted");
	
	
	Product product = new Product();
	product.setProductName("Dell Inspiron 3521");
	product.setProductPrice(51700.00);
	product.setCategory(cat);
	
	ProductDaoImpl daoprod = new ProductDaoImpl();
	daoprod.insertProduct(product);
	System.out.println("Product Inserted");
	
	Query query = new Query();
	query.setQueryMessage("How is this laptop");
	query.setQueryDate(new Date());
	query.setProduct(product);
	query.setCustomer(cust);
	
	QueryDaoImpl daoquery = new QueryDaoImpl();
	daoquery.insertQuery(query);
	
	QueryReplyDetails qreply = new QueryReplyDetails();
	qreply.setReplyMessage("The laptop is amazing");
	qreply.setQuery(query);
	qreply.setReplyDate(new Date());
	qreply.setCustomer(cust);
	
	QueryReplyDaoImpl daoqrepy = new QueryReplyDaoImpl();
	daoqrepy.insertQueryReply(qreply);
	
	RequestDetails request = new RequestDetails();
	request.setCustomer(cust);
	request.setProduct(product);
	request.setStatus(RequestStatus.INPROGRESS);
	
	RequestDaoImpl daoreq = new RequestDaoImpl();
	daoreq.insertRequest(request);
	
	
	Review review = new Review();
	review.setCustomer(cust);
	review.setProduct(product);
	review.setReviewDate(new Date());
	review.setReviewMessage("Comfortable and easy to use laptom....really good");
	
	
	ReviewDaoImpl reviewDaoImpl = new ReviewDaoImpl();
	reviewDaoImpl.insertReview(review);
	
	ReviewReplyDetails reviewReply = new ReviewReplyDetails();
	reviewReply.setCustomer(cust);
	reviewReply.setReplyDate(new Date());
	reviewReply.setReplyMessage("Yes I agree");
	reviewReply.setReview(review);
	
	ReviewReplyDaoImpl reviewReplyDaoImpl = new ReviewReplyDaoImpl();
	reviewReplyDaoImpl.insertReviewReply(reviewReply);
}
}
