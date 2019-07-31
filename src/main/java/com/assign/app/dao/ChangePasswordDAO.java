package com.assign.app.dao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.assign.app.dto.UserDTO;

@Repository
public class ChangePasswordDAO {
	
	@Autowired
	private SessionFactory factory;
	
	
	public ChangePasswordDAO() {
		System.out.println("created:\t"+this.getClass().getSimpleName());
	}
	
	public String changePasswordDAO(String newPass, String email) {
		
		String hql="update UserDTO set password=:np where email=:em";
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		int status=1;
		
		Query query=session.createQuery(hql);
		query.setParameter("np", newPass);
		//query.setParameter("newUser", check);
		query.setParameter("em", email);
		
		UserDTO userDTO=new UserDTO();
		
		
		System.out.println("updated UserDTO:"+userDTO);
		
		int i = (int) query.executeUpdate();
		
		System.out.println("Updated pass row:" + i);
		
		transaction.commit();
		
		
		
		
		
		return  "System.out.println(\"Sucessfull return userDTO ...\");";
		
	}

}
