package com.udemy.spring.spring4;

import org.springframework.stereotype.Component;

@Component
public class RandomFortune implements FortuneService {

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return "This is of Random fortune";
	}

}
