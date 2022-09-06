package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringHelloApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		/*
		 * Pass the parent class to get Bean 
		 * Here id = "myCoach"
		 * class = "com.springdemo.BaseballCoach"  
		 * implements the Coach.java named parent class
		 * 
		 * */
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		
		context.close();

	}

}
