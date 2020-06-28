package com.esra.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopesApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		Personel omerk = ctx.getBean("omer", Personel.class);
		System.out.println(omerk);
		
		Personel omer = ctx.getBean("omer", Personel.class);
		System.out.println(omer);
		
	    //System.out.println(omerk==omer);//yukar�daki ile ayn� �ey
		 	 
		Personel alic = ctx.getBean("ali", Personel.class);
		System.out.println(alic);	
		
		Personel alici = ctx.getBean("ali", Personel.class);
		System.out.println(alici);
		ctx.close();
	}

}
