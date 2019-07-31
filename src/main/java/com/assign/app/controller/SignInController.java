package com.assign.app.controller;

import java.io.UnsupportedEncodingException;
import java.util.Base64;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.assign.app.dto.SignInDTO;
import com.assign.app.dto.UserDTO;
import com.assign.app.service.SignInService;

@Controller
@RequestMapping("/")
public class SignInController {
	@Autowired
	private SignInService signInService;
	
	private static Logger log=LoggerFactory.getLogger(SignInController.class);
	
	public SignInController() {
		System.out.println("created:\t"+this.getClass().getSimpleName());
	}
	
	@RequestMapping(value="/SignIn.ams",method=RequestMethod.POST)
	public ModelAndView signInController(SignInDTO signInDTO, HttpServletRequest request) throws UnsupportedEncodingException {
		
		log.info(signInDTO.toString());
		//System.out.println("Data From User:"+signInDTO);
		UserDTO dtoFromDb=signInService.signInService(signInDTO);
		System.out.println("DATA from data:"+dtoFromDb);
		if(dtoFromDb!=null) {
			String mypass=signInDTO.getPassword();
			String nPass=Base64.getEncoder().encodeToString(mypass.getBytes("utf-8"));
			System.out.println("user enredpass :"+mypass);
			
			
			if(nPass.equals(dtoFromDb.getPassword())){
				//log.info("Login successful");
				/*System.out.println("Entered Pass:"+signInDTO.getPassword());
				System.out.println("DB Pass:"+dtoFromDb.getPassword());*/
				
				System.out.println("Login successful");
				HttpSession session=request.getSession(true);
				session.setMaxInactiveInterval(10*10);
				session.setAttribute("dtoFromDb", dtoFromDb);
				signInService.updateLastLogInAndFailCountService(dtoFromDb);
				return new ModelAndView("Home.jsp", "msg", "Login successful").addObject("user", dtoFromDb);
			}
			else {
				//log.info("Incorrect password");
				System.out.println("Incorrect password");
				int failCount=dtoFromDb.getFailCount();
				
				dtoFromDb.setFailCount(failCount+1);
				
				signInService.failedLogInService(dtoFromDb);
				
				return new ModelAndView("SignIn.jsp", "msg", "Incorrect password");
			}
		}
		else {
			//log.info("Wrong email id");
			System.out.println("Wrong email id");
			return new ModelAndView("SignIn.jsp", "msg", "Wrong email id");
		}
		
	}
	@RequestMapping(value="/LogOut.ams", method=RequestMethod.GET)
	public ModelAndView logOutController(HttpServletRequest req) {
		System.out.println("Invoked logOutController");
		HttpSession session=req.getSession(false);
		session.invalidate();
		
		return new ModelAndView("SignIn.jsp", "msg", "successfully Logged out");
		
	}
	
	
	

}
