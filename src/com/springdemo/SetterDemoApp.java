package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		CricketCoach myCricketCoach =  (CricketCoach) context.getBean("myCricketCoach", Coach.class);
		
		System.out.println(myCricketCoach.getDailyWorkout());
		System.out.println(myCricketCoach.getDailyFortune());
		System.out.println(myCricketCoach.getEmailAddress());
		System.out.println(myCricketCoach.getTeamName());
		
		context.close();

	}

}
