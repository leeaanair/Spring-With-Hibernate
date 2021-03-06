package com.udemy.spring.spring5;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:sports.properties")
public class BeanConfig {
	
	//define bean for our sad fortune Service
	@Bean
	public FortuneService sadFortuneService(){
		
		return new SadFortuneService();
		
	}
	
	//define bean for swimCoach and inject the sadFortune service in it. 
	@Bean
	public Coach swimCoach(){
		
		return new SwimCoach(sadFortuneService());
	}
	
	// define bean for our swimcoach and inject dependency into it
	
	

}
