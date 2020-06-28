package com.esra.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Mercedes {// bunu constructor ile oluþturucak.default yok parametreli var.
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

	public Mercedes() {
		System.out.println("Mercedes,Default consturocturs.");

	}

	@Autowired // Otomatik olarak baðla,tetikle(iki tane constructor var ama sen beani oluþtururken
				// bunun üzerinden oluþtur
	
	public Mercedes(@Qualifier("dizelMotor") Motor motor) {// Bunu oluþturmak için bir motora ihtiyac duyuyor.dizel yada benzinli olmasý
		// farketmiyor.Dizel motoru implemente ettiði için motoru dizel alýyor.

		super();
		this.motor = motor;
		System.out.println("Mercedes oluþturuldu.");

	}

	public void getMotorInfo() {
		System.out.println("Motor Bilgileri");
		System.out.println("Motor: " + motor + "\nGüç: " + motor.getGüc() + "\nTork: " + motor.getTork() + "\nHacim: "
				+ motor.getMotorHacmi());

	}

}
