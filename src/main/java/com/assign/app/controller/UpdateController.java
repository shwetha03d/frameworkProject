package com.assign.app.controller;

import java.util.Date;
import java.util.Enumeration;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.assign.app.dto.UserDTO;
import com.assign.app.service.UpdateService;

@Controller
@RequestMapping("/")
public class UpdateController {
	@Autowired
	private UpdateService updateService;
	
	public UpdateController() {
		System.out.println("Created:"+this.getClass().getSimpleName());
	}
	@RequestMapping(value="/Update.ams", method=RequestMethod.GET)
	public ModelAndView update(HttpServletRequest request) {
		System.out.println("Invoked update method");
		
		HttpSession session=request.getSession(false);
		UserDTO userDTO=(UserDTO) session.getAttribute("dtoFromDb");
	
		return new ModelAndView("Update.jsp", "user", userDTO);
		
	}
	
	
	@RequestMapping(value="/UpdateLater.ams", method=RequestMethod.POST)
	public ModelAndView updateUserDTOController(UserDTO udto, HttpServletRequest req) {
		System.out.println("Invoked updateUserDTOController.....");
		
		try {
		System.out.println("Data From Browser:"+udto);
		HttpSession ss=req.getSession(false);
		UserDTO oldUserDTO=(UserDTO) ss.getAttribute("dtoFromDb");
		System.out.println("DTO from session:"+oldUserDTO);
		String cCode=oldUserDTO.getcCode();
		String password=oldUserDTO.getPassword();
		Date lastLogIn=oldUserDTO.getLastLogIn();
		boolean newUser=oldUserDTO.isNewUser();
		Integer failCount=oldUserDTO.getFailCount();
		
		udto.setcCode(cCode);
		udto.setPassword(password);
		udto.setLastLogIn(lastLogIn);
		udto.setNewUser(newUser);
		udto.setFailCount(failCount);
		
		updateService.updateService(udto,oldUserDTO);
		
		ss.removeAttribute("dtoFromDb");
		ss.setAttribute("dtoFromDb", udto);
		
		return new ModelAndView("Update.jsp", "msg", "updated Successfully...").addObject("user", udto);
		}
		
		
		catch(Exception e) {
			e.printStackTrace();
			return new ModelAndView("SignIn.jsp", "msg", "SignIn First...");
			
		}
			
	}

}
