package com.udemy.spring.spring1;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	//create object method 1
    	BaseBallCoach coach = new BaseBallCoach();
    	//create object method 2 interface which loosens the coupling
    	Coach coach1 = new BaseBallCoach();
    	Coach coach2 = new TrackCoach();
    	
    	//use the object
    	System.out.println(coach.getDailyWorkout());
    	System.out.println(coach1.getDailyWorkout());
    	System.out.println(coach2.getDailyWorkout());

        
    }
}
