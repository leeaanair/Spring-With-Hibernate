package com.udemy.spring.spring6;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/parent")
public class ParentController {
	
	@RequestMapping("/child")
	public String childMethod(){
		
		return "child";
		
	}

}
