package com.psl.bean;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;


@Entity


public class ReviewReplyDetails {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int replyId;
	private String replyMessage;
	private Date replyDate;	
	@ManyToOne( cascade={CascadeType.ALL})
	private Review review;
	@OneToOne( cascade={CascadeType.ALL})
	private Customer customer;
	

	public ReviewReplyDetails() {
	}


	public int getReplyId() {
		return replyId;
	}


	public void setReplyId(int replyId) {
		this.replyId = replyId;
	}


	public String getReplyMessage() {
		return replyMessage;
	}


	public void setReplyMessage(String replyMessage) {
		this.replyMessage = replyMessage;
	}


	public Date getReplyDate() {
		return replyDate;
	}


	public void setReplyDate(Date replyDate) {
		this.replyDate = replyDate;
	}


	public Review getReview() {
		return review;
	}


	public void setReview(Review review) {
		this.review = review;
	}


	public Customer getCustomer() {
		return customer;
	}


	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
}
