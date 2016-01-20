package com.psl.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.psl.bean.QueryReplyDetails;
import com.psl.utility.HibernateUtility;

public class QueryReplyDaoImpl implements QueryReplyDao{

	
	public void insertQueryReply(QueryReplyDetails reply) {
		SessionFactory sf = HibernateUtility.getSessionfactory();
		
		Session session =sf.openSession(); 
		
		session.beginTransaction();
		
		session.save(reply);
		
		
		session.getTransaction().commit();

	}

	public QueryReplyDetails getQueryReply(int replyId) {
		SessionFactory sf = HibernateUtility.getSessionfactory();
		Session session = sf.openSession();
		QueryReplyDetails reply = (QueryReplyDetails) session.get(QueryReplyDetails.class, replyId);
		return reply;
	}

	public void updateQueryReply(QueryReplyDetails reply) {
		// TODO Auto-generated method stub
		SessionFactory sf = HibernateUtility.getSessionfactory();
		Session session = sf.openSession();
		session.beginTransaction();
		session.update(reply);
		session.getTransaction().commit();
	}

	public void deleteQueryReply(QueryReplyDetails reply) {
		// TODO Auto-generated method stub
		SessionFactory sf = HibernateUtility.getSessionfactory();
		Session session = sf.openSession();
		session.beginTransaction();
		session.delete(reply);
		session.getTransaction().commit();
	}


}
