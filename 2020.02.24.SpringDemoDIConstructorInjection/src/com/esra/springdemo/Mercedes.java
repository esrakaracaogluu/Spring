package com.esra.springdemo;

public class Mercedes {
	String model;
	Motor motor;

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}

	public Mercedes(Motor motor) {
		super();
		System.out.println("Mercedes oluþturuldu.");
		this.motor = motor;
	}

	public void getMotorInfo() {
		System.out.println("Motor Bilgileri");
		System.out.println("Motor: " + motor + 
				"\nGüç: " + motor.getGüc() + 
				"\nTork: " + motor.getTork() + 
				"\nHacim: "+ motor.getMotorHacmi());

	}

}
