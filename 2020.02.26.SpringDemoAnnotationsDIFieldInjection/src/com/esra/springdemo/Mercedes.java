package com.esra.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Mercedes {
	String model;

	@Autowired // Bu motoru setter�n �zerinden de�il field �zerinden
	
	@Qualifier("dizelMotor")//dizel isimli bean� buraya g�nder
	
	private Motor motor;// buldu�u ilk motoru buraya inject etti

	// java reflection:seti olmadan set ettik
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Motor getMotor() {
		return motor;
	}

	/*
	 * @Autowired
	 *  public void setMotor(Motor motor) {
	 *   this.motor = motor;
	 * System.out.println("Setter,setMotor"); }
	 */

	public Mercedes() {
		System.out.println("Mercedes,Default consturocturs.");
	}

	/*
	 * public Mercedes(Motor motor) { super(); this.motor = motor;
	 * System.out.println("Mercedes olu�turuldu.");
	 * 
	 * }
	 */

	public void getMotorInfo() {
		System.out.println("Motor Bilgileri");
		System.out.println("Motor: " + motor + "\nG��: " + motor.getG�c() + "\nTork: " + motor.getTork() + "\nHacim: "
				+ motor.getMotorHacmi());

	}

}
