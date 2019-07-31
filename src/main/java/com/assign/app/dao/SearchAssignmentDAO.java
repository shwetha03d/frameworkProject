package com.assign.app.dao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.assign.app.dto.CreateAssignmentEntity;

@Repository
public class SearchAssignmentDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public SearchAssignmentDAO() {
		System.out.println("created:"+this.getClass().getSimpleName());
	}

	public CreateAssignmentEntity searchAssignDAO(long pin) {
		System.out.println("invoked searchAssignDAO");
		Session session=null;
		
		try {
			session=sessionFactory.openSession();
			String hql="From CreateAssignmentEntity entity where entity.pin='"+pin+"'";
			Query query=session.createQuery(hql);
			CreateAssignmentEntity entity=(CreateAssignmentEntity) query.uniqueResult();
			System.out.println("Entity from dao:"+entity);
			return entity;
			
		}
		catch(Exception e) {
			e.printStackTrace();
			
		}
		finally {
			session.close();
		}
		return null;
		
	}

}
