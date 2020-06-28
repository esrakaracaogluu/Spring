package com.esra.springdemo;

public class IsciOzlukDosyasi implements OzlukDosyasi {

	@Override
	public int getHizmetYili() {
		return 20;
	}

/*	@Override
	public String toString() {
		return "IsciOzlukDosyasi [getHizmetYili()=" + getHizmetYili() + "]";
	}*/
	
	public IsciOzlukDosyasi() {
		System.out.println("Ýþçi özlük,default constructor");
	}
}
