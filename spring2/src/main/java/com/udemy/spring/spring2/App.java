package com.udemy.spring.spring2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    	Coach coach = context.getBean("myCoach",  Coach.class);
    	
    	System.out.println(coach.getDailyWorkout());
    	System.out.println(coach.getDailyFortune());
    	System.out.println(coach.getDailyTreat());
    	
    	context.close();
    }
}
