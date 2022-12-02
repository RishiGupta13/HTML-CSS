package com.p1;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;


public class StudentDao 
{
	public void saveStudent(Student student) 
	{
		Transaction transaction=null;
		
		try(Session session =HibernateUtil.getsessionFactory().openSession())
		{
			transaction=session.beginTransaction();
			
			session.save(student);
		        	
			transaction.commit();
			
		}
		catch(Exception e) {
			if(transaction!=null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
		
	}
	
	
	public List<Student> getStudents(){
		try(Session session=HibernateUtil.getsessionFactory().openSession()){
			return (List<Student>) session.createQuery("Select * from Student",Student.class);
		}
		
	}
}








				
