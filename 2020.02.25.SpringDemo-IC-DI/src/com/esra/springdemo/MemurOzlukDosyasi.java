package com.esra.springdemo;

public class MemurOzlukDosyasi implements OzlukDosyasi {

	@Override
	public int getHizmetYili() {
		return 15;
	}

  /*@Override
	public String toString() {
		return "MemurOzlukDosyasi [getHizmetYili()=" + getHizmetYili() + "]";
	}*/
	
	public MemurOzlukDosyasi() {
		System.out.println("Memur özlük,default constructor");
	}

}
