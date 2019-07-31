package com.assign.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Service;

import com.assign.app.dao.AssigneesDAO;
import com.assign.app.dto.CreateAssignmentEntity;

@Service
public class AssigneesService {
	
	@Autowired
	private AssigneesDAO assigneesDAO;
	@Autowired
	private MailSender mailSender;
	
	public AssigneesService() {
		System.out.println("created:"+this.getClass().getSimpleName());
	}
	
	public String assigneesService(long pin,String[] emails) {
		System.out.println("invoked service");
		
		try {

		System.out.println("Service:"+pin);
		 CreateAssignmentEntity entity=assigneesDAO.assigneesDAO(pin, emails);
		System.out.println("Assignment pin:"+entity);
		mailAssignees(entity, emails);
		System.out.println("Mail sent Successfully....");
	
		}
		
		catch(Exception e) {
			e.printStackTrace();
			
		}
		
		
		return null;
		
	}
	
	public void mailAssignees(CreateAssignmentEntity entity,String[] emails) {
		SimpleMailMessage mailMessage=new SimpleMailMessage();
		System.out.println("invoked Mailsender method");
		for(int i=0; i<emails.length;i++) {
			try {
				mailMessage.setTo(emails[i]);
				mailMessage.setSubject("Assignment Management Application");
				mailMessage.setText("Pin:"+entity.getPin()+"\n"+"Course:"+entity.getCourse()+"\n"+
				"Topic:"+entity.getTopic()+"\n"+"Description:"+entity.getDescription()+"\n"+
				"DeadLine:"+entity.getDeadline()+"\n"+"Uploadtype:"+entity.getUploadType());	
				
				mailSender.send(mailMessage);
			}
			catch(Exception e) {
				e.printStackTrace();
				
			}
			
		}
	}

}
