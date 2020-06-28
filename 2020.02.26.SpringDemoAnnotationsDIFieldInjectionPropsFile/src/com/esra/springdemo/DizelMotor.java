package com.esra.springdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class DizelMotor implements Motor {
	
	@Value("${dizel.hacim}")
	private int motorHacmi;

	@Override
	public int getMotorHacmi() {
		return motorHacmi;
	}

	@Override
	public int getGüc() {
		// TODO Auto-generated method stub
		return 150;
	}

	@Override
	public int getTork() {
		// TODO Auto-generated method stub
		return 250;
	}

	public DizelMotor() {
		System.out.println("Dizel motor oluþturuldu");
		System.out.println(this);
	}

}
