package com.saurabh.test;


import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import com.saurabh.hibernate.dto.Address;
import com.saurabh.hibernate.dto.UserDetails;

public class Test {

	public static void main(String[] args) {
		  Session session=new AnnotationConfiguration()  
	         .configure().buildSessionFactory().openSession();  
	      
	    Transaction t=session.beginTransaction(); 
	    
	    UserDetails user1 = new UserDetails();
	    user1.setUserName("saurabh");
	    
	    Address address = new Address();
	    address.setCity("bangalore");
	    
	    user1.setAddress(address);
	    
	    session.save(user1);
	    t.commit();
	    session.close();
	    System.out.println("Saved");
		
	}

}
