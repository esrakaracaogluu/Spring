package com.esra.springdemo;

public class Personel {
	private String isim;
	private String soyisim;

	Personel() {
		System.out.println("Default constructor");
	}

	public Personel(String isim, String soyisim) {
		super();
		this.isim = isim;
		this.soyisim = soyisim;
		System.out.println("Ýkili constructor");
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public String getSoyisim() {
		return soyisim;
	}

	public void setSoyisim(String soyisim) {
		this.soyisim = soyisim;
	}

	public void initPersonel() {
		System.out.println("Personel init method");
	}

	public void destroyPersonel() {
		System.out.println("Personel destroy method");
	}

}
