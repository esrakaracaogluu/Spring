package com.esra.springdemo;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConstInjectionApp {

	public static void main(String[] args) {
		
		//Motor motor= new DizelMotor();//iki kere yazmas�n�n nedeni buray�da yazd�r�yor
	    //Mercedes m= new Mercedes(motor);
	    
	    
	    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
	    

	    Mercedes mercedes=context.getBean("mercedes200",Mercedes.class);
	    mercedes.getMotorInfo();
	    
	    
	    Mercedes mercedes190d=context.getBean("mercedes190d",Mercedes.class);
	    mercedes190d.getMotorInfo();
	
	}

}
