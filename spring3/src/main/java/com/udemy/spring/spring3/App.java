package com.udemy.spring.spring3;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	//loading spring config file
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean-scope-applicationContext.xml");
    	
    	//retrieving bean from spring container
    	
    	//singleton
    	Coach coach = context.getBean("myCoach", Coach.class);
    	
    	Coach coach2 = context.getBean("myCoach", Coach.class);
    	
    	boolean result = (coach == coach2);
    	
    	System.out.println("Pointing to the same object : "+result);
    	System.out.println("Memory location of coach2: "+coach2);
    	System.out.println("Memory location of coach: "+coach);

    	
    	//prototype
    	Coach coach3 = context.getBean("myCoach2", Coach.class);
    	
    	Coach coach4 = context.getBean("myCoach2", Coach.class);
    	
    	result = (coach3 == coach4);
    	
    	System.out.println("Pointing to the same object : "+result);
    	System.out.println("Memory location of coach3: "+coach3);
    	System.out.println("Memory location of coach4: "+coach4);

    	
    	//assignment singleton
    	Coach coach5 = context.getBean("myCoach3", Coach.class);
    	
    	Coach coach6 = context.getBean("myCoach3", Coach.class);
    	
    	result = (coach5 == coach6);
    	
    	System.out.println("Pointing to the same object : "+result);
    	System.out.println("Memory location of coach5: "+coach5);
    	System.out.println("Memory location of coach6: "+coach6);
    	
    	//assignment prototype
    	
    	Coach coach7 = context.getBean("myCoach4", Coach.class);
    	
    	Coach coach8 = context.getBean("myCoach4", Coach.class);
    	
    	result = (coach7 == coach8);
    	
    	System.out.println("Pointing to the same object : "+result);
    	System.out.println("Memory location of coach7: "+coach7);
    	System.out.println("Memory location of coach8: "+coach8);

    	context.close();
    	

    }
}
