package com.udemy.spring.spring2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RandomApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach coach = context.getBean("myCoach5", Coach.class);
		
		System.out.println(coach.getDailyFortune());
		
		
		context.close();


	}

}
