package com.esra.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Mercedes {// bunu constructor ile olu�turucak.default yok parametreli var.
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

	@Autowired // Otomatik olarak ba�la,tetikle(iki tane constructor var ama sen beani olu�tururken
				// bunun �zerinden olu�tur
	
	public Mercedes(@Qualifier("dizelMotor") Motor motor) {// Bunu olu�turmak i�in bir motora ihtiyac duyuyor.dizel yada benzinli olmas�
		// farketmiyor.Dizel motoru implemente etti�i i�in motoru dizel al�yor.

		super();
		this.motor = motor;
		System.out.println("Mercedes olu�turuldu.");

	}

	public void getMotorInfo() {
		System.out.println("Motor Bilgileri");
		System.out.println("Motor: " + motor + "\nG��: " + motor.getG�c() + "\nTork: " + motor.getTork() + "\nHacim: "
				+ motor.getMotorHacmi());

	}

}
