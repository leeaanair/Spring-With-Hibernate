package com.udemy.spring.spring1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApp {

	public static void main(String[] args) {
		
		//load spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//Retrieve the bean from the spring container
		Coach coach = context.getBean("myCoach", Coach.class);
		
		//call the method
		System.out.println(coach.getDailyWorkout());
		
		//close the context
		context.close();	

	}

}
