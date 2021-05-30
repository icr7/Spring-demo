package com.icr7.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMyApp {

	public static void main(String[] args) {
		
		//load the spring configuration
		ClassPathXmlApplicationContext context=
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean from spring container
		Student ishwar= context.getBean("myStudent",Student.class);
		
		//call method on the bean
		System.out.println("College: "+ishwar.getCollegeName());
		System.out.println("Branch: "+ishwar.getBranchName());
		
		//close context
        context.close();
	}
 
}
