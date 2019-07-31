package com.assign.app.dao;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.assign.app.dto.AssigneesEntity;
import com.assign.app.dto.CreateAssignmentEntity;

@Repository
public class AssigneesDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public AssigneesDAO() {
		System.out.println("created:"+this.getClass().getSimpleName());
	}
	
	public CreateAssignmentEntity assigneesDAO(long pin,String[] emails) {
		
		System.out.println("invoked DAO:"+pin);
		Session session=null;
		Transaction transaction=null;
		try {
		session=sessionFactory.openSession();
		String hql="From CreateAssignmentEntity entity where entity.pin='"+pin+"'";
		Query query=session.createQuery(hql);
		CreateAssignmentEntity entity=(CreateAssignmentEntity) query.uniqueResult();
		
		CreateAssignmentEntity createAssignmentEntity=new CreateAssignmentEntity();
		createAssignmentEntity.setPin(pin);
		transaction=session.beginTransaction();
		for(int i=0; i<emails.length;i++) {
			AssigneesEntity assigneesEntity=new AssigneesEntity();
			assigneesEntity.setCreateAssignmentEntity(createAssignmentEntity);
			assigneesEntity.setEmail(emails[i]);
			
			System.out.println("AssignmentEntity Email data:"+assigneesEntity.getEmail());
			System.out.println("Assignment entity Pin Data:"+assigneesEntity.getCreateAssignmentEntity().getPin());
			
			session.save(assigneesEntity);
			System.out.println("Data Saved in AssigneeDAO:"+"Email:"+emails[i]+" "+"And pin :"+pin);
		}
		
		transaction.commit();
		return entity;
		}
		catch(HibernateException e) {
			e.printStackTrace();
			transaction.rollback();
			
		}
		finally {
			session.close();
		}
		
		
		return null;
		
	}

}
