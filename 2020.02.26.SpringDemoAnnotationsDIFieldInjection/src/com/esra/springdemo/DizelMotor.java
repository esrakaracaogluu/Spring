package com.esra.springdemo;
import org.springframework.stereotype.Component;


@Component
public class DizelMotor implements Motor {

	@Override
	public int getMotorHacmi() {
		// TODO Auto-generated method stub
		return 1500;
	}

	@Override
	public int getG�c() {
		// TODO Auto-generated method stub
		return 150;
	}

	@Override
	public int getTork() {
		// TODO Auto-generated method stub
		return 250;
	}

	public DizelMotor() {
		System.out.println("Dizel motor olu�turuldu");
		System.out.println(this);
	}

}
