package com.esra.springdemo;

public class TurkceOgretmeni implements Ogretmen {
	String isim;

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public TurkceOgretmeni(String isim) {
		super();
		this.isim = isim;
	}

	public TurkceOgretmeni() {
		super();
		System.out.println("T�rk�e ��retmeni olu�turuluyor.");
	}

	public void neDersin() {
		System.out.println("Dil �nemli...");
	}

}
