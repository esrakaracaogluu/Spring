package com.esra.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Mercedes {
	String model;

	@Autowired // Bu motoru setterýn üzerinden deðil field üzerinden
	
	@Qualifier("dizelMotor")//dizel isimli beaný buraya gönder
	
	private Motor motor;// bulduðu ilk motoru buraya inject etti

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
	 * System.out.println("Mercedes oluþturuldu.");
	 * 
	 * }
	 */

	public void getMotorInfo() {
		System.out.println("Motor Bilgileri");
		System.out.println("Motor: " + motor + "\nGüç: " + motor.getGüc() + "\nTork: " + motor.getTork() + "\nHacim: "
				+ motor.getMotorHacmi());

	}

}
