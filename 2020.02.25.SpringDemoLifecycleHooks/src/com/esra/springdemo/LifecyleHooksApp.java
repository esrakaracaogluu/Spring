package com.esra.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LifecyleHooksApp {

	public static void main(String[] args) {
	/*	
		System.out.println("1");
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		
		System.out.println("2");
		Personel omerk = ctx.getBean("omer", Personel.class);
		
		System.out.println("3");
		System.out.println(omerk);
		System.out.println("4");	
		
		//prototype
	//	Personel alic = ctx.getBean("ali", Personel.class);
	//	System.out.println(alic);
		

		ctx.close();
		System.out.println("5");
*/
		System.out.println("1");
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		
		System.out.println("2");
		Personel alic = ctx.getBean("ali", Personel.class);
		
		System.out.println("3");
		System.out.println(alic);
		System.out.println("4");

		alic.destroyPersonel();//prototype olduðu için alic'nin destroy metodunu ben çaðýrýyorum
		ctx.close();
		System.out.println("5");

	}

}
