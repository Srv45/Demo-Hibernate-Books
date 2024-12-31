package com.jbk;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainClass {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Books.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		Books b = new Books();
		b.setBook_id(101);
		b.setTitle("Making India Awesome");
		b.setAuthor("Chetan Bhagat");
		b.setGenre("Non-Fiction");
		b.setPrice(1200);
		ss.persist(b);
		tr.commit();
		ss.close();
		
		System.out.println(b);
	}

}
