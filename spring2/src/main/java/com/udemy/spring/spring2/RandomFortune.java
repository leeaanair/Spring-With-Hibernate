package com.udemy.spring.spring2;

import java.util.Random;

public class RandomFortune implements FortuneService {

	String fortunes[] = {"You are lucky", "You are rich", "You suck!"};
	
	@Override
	public String getFortune() {
		
		Random myRandom = new Random();
		
		int index = myRandom.nextInt(fortunes.length);
		
		String theFortune = fortunes[index];
		
		return theFortune;	
		}

}
