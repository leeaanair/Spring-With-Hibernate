package com.udemy.spring.spring4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("CoachUkai")		//this is the bean id
public class Volleyball implements Coach {
	
	
	FortuneService fortuneService;
	
	
	@Autowired
	public Volleyball(@Qualifier("randomFortune") FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practice setting";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return this.fortuneService.getFortune();
	}

}
