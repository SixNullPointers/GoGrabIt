package com.psl.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.psl.bean.Login;
import com.psl.bean.Product;
import com.psl.utility.HibernateUtility;

public class ProductDaoImpl implements ProductDao{

	public void insertProduct(Product prod) {
		SessionFactory sf = HibernateUtility.getSessionfactory();
		
		Session session =sf.openSession(); 
		
		session.beginTransaction();
		
		session.save(prod);
		
		
		session.getTransaction().commit();
		
	}

	public Product getProduct(int prodId) {
		SessionFactory sf = HibernateUtility.getSessionfactory();
		Session session = sf.openSession();
		Product prod = (Product) session.get(Product.class, prodId);
		return prod;
	}

	public void updateProduct(Product prod) {
		SessionFactory sf = HibernateUtility.getSessionfactory();
		Session session = sf.openSession();
		session.beginTransaction();
		session.update(prod);
		session.getTransaction().commit();
		
	}

	public void deleteProduct(Product prod) {
		SessionFactory sf = HibernateUtility.getSessionfactory();
		Session session = sf.openSession();
		session.beginTransaction();
		session.delete(prod);
		session.getTransaction().commit();		
	}
	




}
