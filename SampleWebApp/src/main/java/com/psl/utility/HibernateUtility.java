package com.psl.utility;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtility {

	static SessionFactory sf = null;
	
	@SuppressWarnings("deprecation")
	public static SessionFactory getSessionfactory(){
	
		if(sf==null){
		
			Configuration cfg = new Configuration();
			cfg.configure();
			sf = cfg.buildSessionFactory();
		}
	return sf;
}
}

