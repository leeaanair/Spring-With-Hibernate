package com.udemy.spring.spring6;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FormController {
	
	@RequestMapping("/showForm")				//this is relative to /hello
	public String showForm(){
		
		return "helloForm";
	}
	
	
	//method 1 for form processing just sending the value to next page using param.name
	@RequestMapping("/processForm")			//this is relative to the /hello
	public String processForm(){
		
		return "welcomeStudent";
	}
	
	//method 2 converting the data into upper case and using a model to send the data
	@RequestMapping("/processFormVersion2")
	public String processFormVersion2(HttpServletRequest request, Model model){
		
		String name = request.getParameter("studentName");
		name = name.toUpperCase();
		String result = "Yo!" + name;
		model.addAttribute("message", result);
		return "welcomeStudent";
	}
	
	
	//method 3 using Request param to get the parameter 
	@RequestMapping("/processFormVersion3")
	public String processFormVersion3(@RequestParam("studentName") String name, Model model){
		
		name = name.toUpperCase();
		String result = "Yo!" + name;
		model.addAttribute("message", result);				//tag, variable
		return "welcomeStudent";
	}


}
