package com.udemy.spring.spring6;

import java.util.LinkedHashMap;


public class Student {
	
	private String firstName;
	private String lastName;
	private String country;
	private String gender;
	private String language;
	
	
	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	private LinkedHashMap<String, String> countryOptions;
	private LinkedHashMap<String, String> languageOptions;
	private String[] operatingSystems;
	

	
	public Student() {
		
		//key, name
		//value, label
		countryOptions = new LinkedHashMap<>();
		countryOptions.put("BR", "Brazil");
		countryOptions.put("FR", "France");
		countryOptions.put("DE", "Germany");
		countryOptions.put("IN", "India");
		
		languageOptions = new LinkedHashMap<>();
		languageOptions.put("Ruby", "Ruby");
		languageOptions.put("C", "C");
		languageOptions.put("C++", "C++");
		languageOptions.put("C#", "C#");

	}
	
	
	
	public String[] getOperatingSystems() {
		return operatingSystems;
	}

	public void setOperatingSystems(String[] operatingSystems) {
		this.operatingSystems = operatingSystems;
	}

	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}

	public void setCountryOptions(LinkedHashMap<String, String> countryOptions) {
		this.countryOptions = countryOptions;
	}

	public LinkedHashMap<String, String> getLanguageOptions() {
		return languageOptions;
	}

	public void setLanguageOptions(LinkedHashMap<String, String> languageOptions) {
		this.languageOptions = languageOptions;
	}
	
	

}
