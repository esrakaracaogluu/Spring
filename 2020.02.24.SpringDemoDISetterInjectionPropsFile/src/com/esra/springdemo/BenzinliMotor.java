package com.esra.springdemo;

public class BenzinliMotor implements Motor {

	@Override
	public int getMotorHacmi() {
		// TODO Auto-generated method stub
		return 2000;
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

	@Override
	public String toString() {
		return "BenzinliMotor: [getMotorHacmi()=" + getMotorHacmi() + ", getGüc()=" + getGüc() + ", getTork()="
				+ getTork() + "]";
	}
	
}
