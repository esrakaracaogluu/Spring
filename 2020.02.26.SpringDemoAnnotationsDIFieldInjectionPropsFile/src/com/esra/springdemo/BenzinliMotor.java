package com.esra.springdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class BenzinliMotor implements Motor {
	@Value("${benzinli.hacim}")
	private int motorHacmi;

	@Override
	public int getMotorHacmi() {
		// TODO Auto-generated method stub
		return motorHacmi;
	}

	@Override
	public int getGüc() {
		// TODO Auto-generated method stub
		return 180;
	}

	@Override
	public int getTork() {
		// TODO Auto-generated method stub
		return 200;
	}

	public BenzinliMotor() {
		System.out.println("Benzinli motor oluþturuldu");
		System.out.println(this);

	}
}
