package com.esra.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
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

	@Autowired
	public void setMotor(@Qualifier("dizelMotor") Motor motor) {
		this.motor = motor;
		System.out.println("Setter,setMotor");
	}

	public Mercedes() {
		System.out.println("Mercedes,Default consturocturs.");
	}

	@Autowired
	public void startVars(@Qualifier("dizelMotor") Motor motor) {// buraya ne g�nderiyorsak onun �zelli�ini,�zellikle �u
																	// s�n�f� istiyorum
		model = "500SEL";
		System.out.println("Autowired, startVars Metodu");
	}

	/*
	 * public Mercedes(Motor motor) {
	 * 
	 * super(); this.motor = motor; System.out.println("Mercedes olu�turuldu.");
	 * 
	 * }
	 */

	public void getMotorInfo() {
		System.out.println("Motor Bilgileri");
		System.out.println("Motor: " + motor + "\nG��: " + motor.getG�c() + "\nTork: " + motor.getTork() + "\nHacim: "
				+ motor.getMotorHacmi());

	}

	@Override
	public String toString() {
		return "Mercedes [model=" + model + ", motor=" + motor + "]";
	}
	

}
