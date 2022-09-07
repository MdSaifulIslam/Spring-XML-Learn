package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeApp {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationBeanScopeContext.xml");
		
		Coach myCoach =  context.getBean("myCoach", Coach.class);
		Coach alphaCoach =  context.getBean("myCoach", Coach.class);
		
		boolean res = myCoach == alphaCoach;
		
		System.out.println("Are same: " + res);
		System.out.println("My Coach: " + myCoach);
		System.out.println("Alpha  Coach: " + alphaCoach);
		
		context.close();
		

	}

}
