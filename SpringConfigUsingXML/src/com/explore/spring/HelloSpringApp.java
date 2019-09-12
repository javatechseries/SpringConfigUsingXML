package com.explore.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctxt= new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach baseballCoach= ctxt.getBean("baseballCoach",Coach.class);
		//Coach theCoach2= (Coach)ctxt.getBean("myCoach");
		System.out.println("Baseball Coach: "+baseballCoach.getDailyWorkout());
		System.out.println("Baseball Coach Fortune: "+baseballCoach.getDailyFortune());
		
		Coach trackCoach=ctxt.getBean("trackCoach",Coach.class);
		
		System.out.println("Track Coach: "+trackCoach.getDailyWorkout());
		System.out.println("Track Coach Fortune: "+trackCoach.getDailyFortune());
		
		//Here we need to use CricketCoach instead of Coach as getTeam and getEmailAddress are only available in CricketCoach
		CricketCoach cricketCoach=ctxt.getBean("cricketCoach",CricketCoach.class);
		System.out.println("Cricket Coach: "+cricketCoach.getDailyWorkout());
		System.out.println("Cricket Coach Fortune: "+cricketCoach.getDailyFortune());
		System.out.println("Cricket Coach email ID: "+cricketCoach.getEmailAddress());
		System.out.println("Cricket Team Name: "+cricketCoach.getTeam());
		
		ctxt.close();
	}

}