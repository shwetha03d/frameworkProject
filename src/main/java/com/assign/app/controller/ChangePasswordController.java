package com.assign.app.controller;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.assign.app.service.ChangePasswordService;

@Component
@RequestMapping("/")
public class ChangePasswordController {
	
	@Autowired
	private ChangePasswordService changePasswordService;
	
	public ChangePasswordController() {
		System.out.println("created:\t"+this.getClass().getSimpleName());
	}
	
	@RequestMapping(value="/ChangeSettings.ams",method=RequestMethod.POST)
	public ModelAndView changePasswordController(@RequestParam String newPass,@RequestParam String email,Model model,HttpServletRequest req) throws UnsupportedEncodingException {
		System.out.println("Invoked changePasswordController().... ");
		
		
		
		model.addAttribute("email", email);
		
		
		changePasswordService.changePasswordService(newPass,email);
		model.addAttribute("message", "password changed successfully");
		
		
		return new ModelAndView("ChangeSettings.jsp", "message", "change password successfully");
		
	}

}
