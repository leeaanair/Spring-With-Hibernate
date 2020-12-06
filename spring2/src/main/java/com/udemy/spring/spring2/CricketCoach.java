package com.udemy.spring.spring2;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;
	
	
	//no-arg constructor
	public CricketCoach() {
		super();
		System.out.println("No arg constructor of cricket Coach");
	}
	
	

	public FortuneService getFortuneService() {
		return fortuneService;
	}



	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("setter of cricket");
		this.fortuneService = fortuneService;
	}



	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practice wicketKeeping for an hour";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

	@Override
	public String getDailyTreat() {
		// TODO Auto-generated method stub
		return null;
	}

}
