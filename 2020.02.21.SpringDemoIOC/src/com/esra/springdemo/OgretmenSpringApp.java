package com.esra.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class OgretmenSpringApp {

	public static void main(String[] args) {

		System.out.println("Merhaba..");
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanlerim.xml");// beanlerimi oku
																										// beanlerimdeki
																										// beanleri
																										// canland�r(olu�tur)
		// classpath ayaga kald�rd�m benim i�lerimi y�netsin diye

		// Ogretmen hoca = new FenOgretmeni();//��retmen interfaceni implemente edenlerin hepsi hocad�r
		// Ogretmen hoca = new TurkceOgretmeni();

		Ogretmen hoca = context.getBean("turkceci", Ogretmen.class);// ben referans tan�ml�yorum bu referans container�n
																	// i�indeki t�rkceci'yi g�sterecek
		hoca.neDersin();

		hoca = context.getBean("fenci", Ogretmen.class);// ben referans tan�ml�yorum bu referans container�n
		                                                // i�indeki fenci'yi g�sterecek
		hoca.neDersin();
		
		
		/*JavaOgretmeni omer=context.getBean("javaci",Ogretmen.class);
		omer.selamla();
		omer.setIsim("omer karakas");*/

		// Ogretmen hoca2 = context.getBean("turkceci1", Ogretmen.class);

		// System.out.println(hoca1);
		// System.out.println(hoca2);

		// hoca1.neDersin();
		// hoca.neDersin();

		System.out.println("G�le g�le");

	}

}
