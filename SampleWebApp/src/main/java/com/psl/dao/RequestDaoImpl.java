package com.psl.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.psl.bean.RequestDetails;
import com.psl.utility.HibernateUtility;

public class RequestDaoImpl implements RequestDao {

	public void insertRequest(RequestDetails req) {
SessionFactory sf = HibernateUtility.getSessionfactory();
		
		Session session =sf.openSession(); 
		
		session.beginTransaction();
		
		session.save(req);
		
		
		session.getTransaction().commit();

	}

	public RequestDetails getRequest(int requestId) {
		SessionFactory sf = HibernateUtility.getSessionfactory();
		Session session = sf.openSession();
		RequestDetails request = (RequestDetails) session.get(RequestDetails.class, requestId);
		return request;
	}

	public void deleteRequest(RequestDetails req) {
		SessionFactory sf = HibernateUtility.getSessionfactory();
		Session session = sf.openSession();
		session.beginTransaction();
		session.delete(req);
		session.getTransaction().commit();
	}

}
