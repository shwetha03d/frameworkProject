package com.assign.app.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.assign.app.dto.CreateAssignmentEntity;

@Repository
public class createAssignmentDAO {
	
	@Autowired
	private SessionFactory sf;
	
	public createAssignmentDAO() {
		System.out.println("created:\t"+this.getClass().getSimpleName());
	}
	
	public String createAssignmentDAOImpl(CreateAssignmentEntity entity) {
		
		System.out.println("Going to save:"+entity);
		Session ss=null;
		Transaction tx=null;
		try {     
		 ss=sf.openSession();
		 tx=ss.beginTransaction();
		
		ss.save(entity);
		tx.commit();
		}
		catch (Exception e) {
			tx.rollback();
			System.out.println("Exception in DAO:"+e.getMessage());
		}finally
		{
			ss.close();
		}
		
		
		
		
		return null;
		
	}

}
