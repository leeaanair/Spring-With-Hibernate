package com.udemy.spring.spring6;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/student")
public class StudentController {

	@Value("#{genderOptions}") 			//same as util id in servlet.xml
	private Map<String, String> genderOptions;

	@RequestMapping("/showForm")
	public String showForm(Model theModel){
		
		Student student = new Student();
		
		
		System.out.println("gender" + genderOptions);
		
		theModel.addAttribute("student", student); 
		theModel.addAttribute("genderOptions", genderOptions); 
				
		return "student-form";
		
	}
	
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("student") Student student){
	return "student-confirmation";
		
	}


}
