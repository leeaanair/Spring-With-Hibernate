package com.udemy.spring.spring5;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
    	Coach coach = context.getBean("swimCoach", Coach.class);
    	System.out.println(coach.getDailyFortune());
    	
    	SwimCoach swimcoach = context.getBean("swimCoach", SwimCoach.class);
    	System.out.println(swimcoach.getEmail());
    	System.out.println(swimcoach.getName());
    	
    	
    	context.close();
    }
}
