package com.udemy.spring.spring2;

public class VolleyballCoach implements Coach {

	
	private FortuneService fortuneService;
	private TreatService treatService;
	
	
	//FortuneService is the helper object
	
	public VolleyballCoach(FortuneService fortuneService, TreatService treatService) {
		super();
		this.fortuneService = fortuneService;
		this.treatService = treatService;
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
	
	public String getDailyTreat(){
		
		return this.treatService.getTreat();
	}

}
