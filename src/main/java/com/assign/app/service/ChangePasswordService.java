package com.assign.app.service;

import java.io.UnsupportedEncodingException;
import java.util.Base64;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Service;

import com.assign.app.dao.ChangePasswordDAO;

@Service
public class ChangePasswordService {

	@Autowired
	private ChangePasswordDAO changePasswordDAO;
/*
	@Autowired
	private ValidData data;
*/
	@Autowired
	private MailSender mailSender;

	public ChangePasswordService() {
		System.out.println("created:\t" + this.getClass().getSimpleName());
	}

	public String changePasswordService(String newPass, String email) throws UnsupportedEncodingException {

		System.out.println("Invoked changePasswordService()...");

		/*
		 * boolean check=false; check=valid(newPass);
		 */

		if (true) {

			System.out.println("Entered new password is:" + newPass);

			String enPass = Base64.getEncoder().encodeToString(newPass.getBytes("utf-8"));
			System.out.println("Encrypted pass in db:" + enPass);

			/*
			 * UserDTO userDTO=new UserDTO();
			 * System.out.println("Change pass Mail Send is preparing..");
			 * System.out.println("Email for change pass :"+userDTO);
			 */
			
		     	changePasswordDAO.changePasswordDAO(enPass, email);
		     	String subject="Change Password Mail From Assignment Management System";
			
		      	String text="Your Password is Chnaged \n"+
			    "please login by using \n"+"password:"+newPass;
			
				
				SimpleMailMessage simpleMailMessage=new SimpleMailMessage();
				
				simpleMailMessage.setTo(email);
				simpleMailMessage.setSubject(subject);
				simpleMailMessage.setText(text);
				
				mailSender.send(simpleMailMessage);
				
				return "Mail sent to:\t"+email;
			
			
			// mailSender.send(simpleMessage);
			// mailSender.changePassmailSending(email, newPass, null);
				
		}
		return "Succesfully from Services..";

	}

	/*private boolean valid(String newPass) {
		if (newPass != null) {
			@SuppressWarnings("unused")
			boolean vNewPass = data.isValidNewPass(newPass);
			System.out.println("Valid Data..going to save in DB..");
			return true;

		} else {
			System.out.println("Invalid Password Created......");
			return false;
		}

	}*/
	
	
}