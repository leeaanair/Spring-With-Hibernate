package com.udemy.spring.spring4;

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
    	
    	
    	//Explicit bean id
    	Coach coach = context.getBean("CoachUkai", Coach.class);
    	
    	System.out.println(coach.getDailyWorkout());
    	
//    	//default bean id
    	Coach coach1 = context.getBean("tennisCoach", Coach.class);
    	
    	System.out.println(coach1.getDailyWorkout());
    	
    	//using constructor autowiring
    	System.out.println(coach1.getDailyFortune());		
    	
    	//default bean id
    	Coach coach2 = context.getBean("cricketCoach", Coach.class);
    	
    	System.out.println(coach2.getDailyWorkout());
    	
    	//using setter autowiring
    	System.out.println(coach2.getDailyFortune());		    	

    	
    	Coach coach3 = context.getBean("hockeyCoach", Coach.class);
    	
    	//field injection
    	System.out.println("field injection" + coach3.getDailyFortune());
    	
    	
    	SwimCoach swimCoach = context.getBean("swimCoach", SwimCoach.class);
    	System.out.println("EMail of the swim coach is" + swimCoach.getHerEmail());
    	System.out.println(swimCoach.getHerName());
    	
    	context.close();
    	
    	
    }
}
