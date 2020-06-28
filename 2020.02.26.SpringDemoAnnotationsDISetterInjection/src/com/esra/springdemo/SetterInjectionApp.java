package com.esra.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterInjectionApp {

	public static void main(String[] args) {
		
	    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
	    

	    Mercedes mercedes=context.getBean("mercedes",Mercedes.class);
	    mercedes.getMotorInfo();
	    //System.out.println(mercedes);
	    
	  
	}

}
