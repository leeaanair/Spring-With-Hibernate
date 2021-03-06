package com.udemy.spring.spring3;

public class VolleyballCoach implements Coach {

	
	private FortuneService fortuneService;
	
	
	//FortuneService is the helper object
	
	public VolleyballCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}
	

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Do 100 serves";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return this.fortuneService.getFortune();
	}
	
	
	//init method
	public void startUp(){
		
		System.out.println("This is the start up method");
	}
	
	//destroy method
	
	public void shutDown(){
		//won't be called when scope is protoype
		System.out.println("this is the shut down method");
	}
}
