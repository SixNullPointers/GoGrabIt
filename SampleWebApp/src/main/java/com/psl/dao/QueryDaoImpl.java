package com.psl.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.psl.bean.Query;
import com.psl.utility.HibernateUtility;

public class QueryDaoImpl implements QueryDao {


	public void insertQuery(Query query){
	SessionFactory sf = HibernateUtility.getSessionfactory();
	
	Session session =sf.openSession(); 
	
	session.beginTransaction();
	
	session.save(query);
	
	
	session.getTransaction().commit();

}

	public Query getQuery(int queryId) {
	SessionFactory sf = HibernateUtility.getSessionfactory();
	Session session = sf.openSession();
	Query query = (Query) session.get(Query.class, queryId);
	return query;
}

	public void updateQuery(Query query) {
	// TODO Auto-generated method stub
	SessionFactory sf = HibernateUtility.getSessionfactory();
	Session session = sf.openSession();
	session.beginTransaction();
	session.update(query);
	session.getTransaction().commit();
}

	public void deleteQuery(Query query) {
	// TODO Auto-generated method stub
	SessionFactory sf = HibernateUtility.getSessionfactory();
	Session session = sf.openSession();
	session.beginTransaction();
	session.delete(query);
	session.getTransaction().commit();
}


}
