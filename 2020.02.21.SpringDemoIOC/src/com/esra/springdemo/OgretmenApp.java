package com.esra.springdemo;
public class OgretmenApp {

	public static void main(String[] args) {

		System.out.println("Merhaba..");

	//	Ogretmen hoca = new FenOgretmeni();//öðretmen interfaceni implemente edenlerin hepsi hocadýr
		Ogretmen hoca = new TurkceOgretmeni();

		
		hoca.neDersin();
		System.out.println("Güle güle");

	}

}
