package com.esra.springdemo;

public class FenOgretmeni implements Ogretmen {
	String isim;

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public FenOgretmeni(String isim) {
		super();
		this.isim = isim;
	}

	public FenOgretmeni() {
		super();
		System.out.println("Fen öðretmeni oluþturuluyor.");
	}

	public void neDersin() {
		System.out.println("Ben Big Bang'den önce... ");
	}

}
