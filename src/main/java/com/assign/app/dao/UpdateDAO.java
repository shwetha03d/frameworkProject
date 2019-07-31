package com.assign.app.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.assign.app.dto.AuditEntity;
import com.assign.app.dto.UserDTO;

@Repository
public class UpdateDAO {
	@Autowired
	private SessionFactory sessionFactory;
	public UpdateDAO() {
		System.out.println("created:"+this.getClass().getSimpleName());
	}
	
	public UserDTO updateDAO(UserDTO udto) {
		Session session=null;
		Transaction transaction=null;
		
		try {
			session=sessionFactory.openSession();
			transaction=session.beginTransaction();
			
			System.out.println("data before updating..."+udto);
			session.saveOrUpdate(udto);
			//session.save(audit);
			System.out.println("data after updating..."+udto);
			transaction.commit();
			
		}
		catch(HibernateException e) {
			transaction.rollback();
			e.printStackTrace();
			
		}
		finally {
			session.close();
		}
		return udto;
		
		
		
	}

	public void changeDAO(AuditEntity audit) {
		Session ss=sessionFactory.openSession();
		Transaction tx=ss.beginTransaction();
		ss.save(audit);
		tx.commit();
		
	}

	
}
