package com.udemy.spring.spring5;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {

	
	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return "You Suck";
	}

}
