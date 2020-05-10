package com.esra.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class OgretmenSpringApp {

	public static void main(String[] args) {

		System.out.println("Merhaba..");
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanlerim.xml");// beanlerimi oku
																										// beanlerimdeki
																										// beanleri
																										// canlandýr(oluþtur)
		// classpath ayaga kaldýrdým benim iþlerimi yönetsin diye

		// Ogretmen hoca = new FenOgretmeni();//öðretmen interfaceni implemente edenlerin hepsi hocadýr
		// Ogretmen hoca = new TurkceOgretmeni();

		Ogretmen hoca = context.getBean("turkceci", Ogretmen.class);// ben referans tanýmlýyorum bu referans containerýn
																	// içindeki türkceci'yi gösterecek
		hoca.neDersin();

		hoca = context.getBean("fenci", Ogretmen.class);// ben referans tanýmlýyorum bu referans containerýn
		                                                // içindeki fenci'yi gösterecek
		hoca.neDersin();
		
		
		/*JavaOgretmeni omer=context.getBean("javaci",Ogretmen.class);
		omer.selamla();
		omer.setIsim("omer karakas");*/

		// Ogretmen hoca2 = context.getBean("turkceci1", Ogretmen.class);

		// System.out.println(hoca1);
		// System.out.println(hoca2);

		// hoca1.neDersin();
		// hoca.neDersin();

		System.out.println("Güle güle");

	}

}
