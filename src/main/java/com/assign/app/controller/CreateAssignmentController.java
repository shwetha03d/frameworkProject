package com.assign.app.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.assign.app.dto.CreateAssignmentDTO;
import com.assign.app.service.CreateAssignmentService;

@Controller
@RequestMapping("/")
public class CreateAssignmentController {
	
	@Autowired
	private CreateAssignmentService createAssignmentService;
	
	
	public CreateAssignmentController() {
		System.out.println("created:\t"+this.getClass().getSimpleName());
	}
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
	    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

	    binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
	}
	 
	@RequestMapping(value="/CreateAssignment.ams", method=RequestMethod.POST)
	public ModelAndView createAssignment(CreateAssignmentDTO dto,HttpServletRequest request)  {
		HttpSession session=request.getSession(false);
		System.out.println(session.getAttribute("dtoFromDb"));
		if(session.getAttribute("dtoFromDb")!=null) {
			
		
		System.out.println("CreateAssignment() started");
	
		System.out.println(dto);
		
			long rpin=createAssignmentService.createAssignmentService(dto);
			System.out.println("generated pin:"+rpin);
			System.out.println("CreateAssigment ended");
			return new ModelAndView("CreateAssignment.jsp","pin","Generated pin:"+rpin);
			
		}
		else {
      	System.out.println("Session is Closed");
			return new ModelAndView("SignIn.jsp","pin","session is closed");

		}
		
	}
	

}
