package com.esra.springdemo;
public class OgretmenApp {

	public static void main(String[] args) {

		System.out.println("Merhaba..");

	//	Ogretmen hoca = new FenOgretmeni();//��retmen interfaceni implemente edenlerin hepsi hocad�r
		Ogretmen hoca = new TurkceOgretmeni();

		
		hoca.neDersin();
		System.out.println("G�le g�le");

	}

}
