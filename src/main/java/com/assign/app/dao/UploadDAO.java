package com.assign.app.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.assign.app.dto.UploadEntity;



@Repository
public class UploadDAO {
	@Autowired
	private SessionFactory sessionFactory;

	public UploadDAO() {
		System.out.println("created:" + this.getClass().getSimpleName());
	}

	public void saveAssignUpload(UploadEntity entity) {
		System.out.println("invoked saveAssignUpload from DAO...");
		System.out.println("Data in DAO:" + entity);
		Session ss = null;
		Transaction tx = null;
		try {

			ss = sessionFactory.openSession();
			tx = ss.beginTransaction();
			ss.save(entity);
			tx.commit();

		} catch (HibernateException e) {
			System.out.println(e.getMessage());

		}

	}

}
