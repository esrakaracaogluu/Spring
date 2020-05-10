package com.esra.springdemo;

public class Mercedes {
	private String model;
	private Motor motor;

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
		System.out.println("Mercedes'in modeli " + model);

	}

	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
		System.out.println("Mercedes'in motoru " + motor);
	}

	public Mercedes() {
		System.out.println("Mercedes oluþturuldu.");
	}

	public void getMotorInfo() {
	System.out.println("Motor Bilgileri");
		System.out.println("Motor: " + motor + "\nGüç: " + motor.getGüc() + "\nTork: " + motor.getTork() + "\nHacim: "
				+ motor.getMotorHacmi());

	}

	@Override
	public String toString() {
		return "Mercedes [model=" + model + ", motor=" + motor + "]";
	}

}
