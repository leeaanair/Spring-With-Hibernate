package com.udemy.spring.spring7;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CustomerController {
	
	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		
		System.out.println("it;s cakked");
		dataBinder.registerCustomEditor(String.class, new StringTrimmerEditor(true));
	}	
	
	@RequestMapping("/showForm")
	public String showCustomerForm(Model model){
		
		Customer customer = new Customer();
		model.addAttribute("customer", customer);
		return "customer-form";
	}
	
	@RequestMapping("/processForm")
	public String processCustomerForm(@Valid @ModelAttribute("customer") Customer customer, BindingResult bindingResult){
		
		if(bindingResult.hasErrors()){
			System.out.println("it's true");
			return "customer-form";
		}
		
		else{
			System.out.println("it's a false");
			return "customer-confirmation";			
		}
	}


}
