package com.assign.app.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.assign.app.dto.CreateAssignmentEntity;
import com.assign.app.service.SearchAssignmentService;

@Controller
@RequestMapping("/")
public class SearchAssignmentCotroller {

	@Autowired
	private SearchAssignmentService searchAssignmentService;

	public SearchAssignmentCotroller() {
		System.out.println("created:" + this.getClass().getSimpleName());
	}

	@RequestMapping(value = "/SearchAssignment.ams", method = RequestMethod.POST)
	public ModelAndView searchAssignment(@RequestParam long pin, Model model,HttpServletRequest req) {
		System.out.println("invoked searchAssignment");
		HttpSession session=req.getSession(false);
		System.out.println(session.getAttribute("dtoFromDb"));
		if(session.getAttribute("dtoFromDb")!=null) {
		
		System.out.println("Pin:" + pin);
		try {
			CreateAssignmentEntity entity;
			entity = searchAssignmentService.searchAssign(pin);

			if (entity != null) {
				System.out.println("Entity from controller in if condition");

				//model.addAttribute("data", entity);
				return new ModelAndView("SearchAssignment.jsp", "jspList", entity);

				//return "SearchAssignment.jsp";

			} else {
				System.out.println("Entity from controller in else condition");
				model.addAttribute("Message", "Record Not Found...");
				// return new ModelAndView(viewName, modelName, modelObject);
				return new ModelAndView("SearchAssignment.jsp", "msg", "Record Not Found");
			}

		} catch (Exception e) {
			e.printStackTrace();
			return new ModelAndView("SearchAssignment.jsp", "msg", "Record not Found");
		}

		}
		else {
			return new ModelAndView("SignIn.jsp", "msg", "Signin First..");
		}

	}

}
