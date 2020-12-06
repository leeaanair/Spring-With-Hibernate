package com.udemy.spring.spring6;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FormController {
	
	@RequestMapping("/showForm")
	public String showForm(){
		
		return "helloForm";
	}
	
	@RequestMapping("/processForm")
	public String processForm(){
		
		return "welcomeStudent";
	}
	
	@RequestMapping("/processFormVersion2")
	public String processFormVersion2(HttpServletRequest request, Model model){
		
		String name = request.getParameter("studentName");
		name = name.toUpperCase();
		String result = "Yo!" + name;
		model.addAttribute("message", result);
		return "welcomeStudent";
	}
	
	
	@RequestMapping("/processFormVersion3")
	public String processFormVersion3(@RequestParam("studentName") String name, Model model){
		
		name = name.toUpperCase();
		String result = "Yo!" + name;
		model.addAttribute("message", result);
		return "welcomeStudent";
	}


}