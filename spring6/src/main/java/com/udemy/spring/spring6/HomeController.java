package com.udemy.spring.spring6;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@Controller
public class HomeController {

	@RequestMapping("/")
	public String showPage(){
		System.out.print("We are in showPage");
		return "homepage";
	}
}
