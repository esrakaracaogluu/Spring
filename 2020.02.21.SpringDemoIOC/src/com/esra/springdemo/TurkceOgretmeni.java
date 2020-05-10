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
		System.out.println("Türkçe öðretmeni oluþturuluyor.");
	}

	public void neDersin() {
		System.out.println("Dil önemli...");
	}

}
