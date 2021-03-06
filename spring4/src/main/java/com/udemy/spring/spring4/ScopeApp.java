package com.udemy.spring.spring4;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach tennisCoach1 = context.getBean("tennisCoach", Coach.class);
		Coach tennisCoach2 = context.getBean("tennisCoach", Coach.class);
		
		boolean result = (tennisCoach1==tennisCoach2);
		
		System.out.println("TennisCoach is same object : "+result);
		System.out.println("TennisCoach1 memory location : "+tennisCoach1);
		System.out.println("TennisCoach2 memory location : "+tennisCoach2);
		
		Coach cricketCoach1 = context.getBean("cricketCoach", Coach.class);
		Coach cricketCoach2 = context.getBean("cricketCoach", Coach.class);
		
		result = (cricketCoach1==cricketCoach2);
		
		System.out.println("CricketCoach is same object : "+result);
		System.out.println("cricketCoach1 memory location : "+cricketCoach1);
		System.out.println("cricketCoach2 memory location : "+cricketCoach2);
		
		context.close();
		System.out.println(context.isActive());

	}

}
