package com.udemy.spring.spring2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach coach = context.getBean("myCoach2", Coach.class);
		
		System.out.println(coach.getDailyFortune());
		
		
		 SoccerCoach coach2 = context.getBean("myCoach3", SoccerCoach.class);
		
		 System.out.println(coach2.getEmail());
		 System.out.println(coach2.getName());

		 SoccerCoach coach3 = context.getBean("myCoach4", SoccerCoach.class);
			
		 System.out.println(coach3.getEmail());
		 System.out.println(coach3.getName());
		
		 context.close();
		
	}

}
