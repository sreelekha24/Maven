package com.techouts.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.techouts.pojo.Customer;

public class Main {

	public static void main(String[] args) 
	{
		Configuration config=new Configuration().configure("hibernate.cfg.xml");
		SessionFactory fact=config.buildSessionFactory();
		Session session=fact.openSession();
		
		
		Customer cust=new Customer();
		cust.setCustId(1);
		cust.setCustName("Lekha");
		cust.setAddress("Bangalore");
		session.save(cust);
		
		Customer cust1=new Customer();
		cust1.setCustId(2);
		cust1.setCustName("Hema");
		cust1.setAddress("Hyderabad");
		session.save(cust1);
		
		
		Customer cust2=new Customer();
		cust2.setCustId(3);
		cust2.setCustName("Swathi");
		cust2.setAddress("Chennai");
		session.save(cust2);
		
		
		Transaction tx=session.beginTransaction();
		tx.commit();
		session.close();
	}

}
