package mypack;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		Configuration con = new Configuration();
		con.configure("hibernate.cfg.xml");
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		
//		Inserting a record		
//		User u = new User();
//		u.setUid(11);
//		u.setUname("xyz");
//		u.setUemail("xyz@gmail.com");
//		session.save(u);
//		tx.commit();
		
		
		 // Update record
//		  User use = (User)session.get(User.class, 3);
//		  use.setUname("anu");
//		  System.out.println("Updated Successfully");
//		  session.getTransaction().commit();
		
		 // Delete a record 
//		  User use = (User)session.get(User.class, 4);
//		  session.delete(use);
//		  System.out.println("Deleted Successfully");
//		  session.getTransaction().commit();
		
		
		// Fetching records
		Query query = session.createQuery("from User");
		  List users = query.list();
		  for(int i=0;i<users.size();i++)
		  {
			  User u = (User)users.get(i);
		System.out.println("User Id: "+u.getUid()+", Student Name: "+u.getUname()+", Email: "+u.getUemail());
		  }
		  session.getTransaction().commit();
		
	}

}
