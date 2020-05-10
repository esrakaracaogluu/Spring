package com.esra.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterInjectionApp {

	public static void main(String[] args) {
	    

	   // Motor benzinli=new BenzinliMotor();
	   // Mercedes m=new Mercedes();
	    //m.setMotor(benzinli);
		
	    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

	    Mercedes mercedes=context.getBean("mercedes200",Mercedes.class);
	    mercedes.getMotorInfo();
	   
	    System.out.println(mercedes);
	
	
	}

}
