package com.esra.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class OzlukDosyasiApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");

		Personel omerk = ctx.getBean("omer", Personel.class);
		System.out.println(omerk);
		
		Personel alic = ctx.getBean("ali", Personel.class);
		System.out.println(alic);
		
		Personel esrasen = ctx.getBean("esra", Personel.class);
		System.out.println(esrasen);
		
		System.out.println(omerk.getOzlukDosyasi());
		System.out.println(alic.getOzlukDosyasi());
		System.out.println(esrasen.getOzlukDosyasi());


		ctx.close();
	}

}
