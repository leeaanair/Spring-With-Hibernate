package com.udemy.spring.spring5;

import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class SadFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return "Today's a sad day";
	}
	
	@PreDestroy
	public void shutDown(){
		System.out.println("Sad fortune destruction");
	}

}
