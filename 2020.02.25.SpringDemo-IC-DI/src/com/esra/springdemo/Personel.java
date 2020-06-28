package com.esra.springdemo;

public class Personel {
	private String isim;
	private String soyisim;
	private OzlukDosyasi ozlukDosyasi;

	@Override
	public String toString() {
		return "Personel [isim=" + isim + ", soyisim=" + soyisim + ", ozlukDosyasi=" + ozlukDosyasi + "]";
	}

	Personel() {
		System.out.println("Default constructor");
	}

	public Personel(String isim, String soyisim) {
		super();
		this.isim = isim;
		this.soyisim = soyisim;
		System.out.println("Ýkili constructor");
	}

	public Personel(String isim, String soyisim, OzlukDosyasi ozlukDosyasi) {
		super();
		this.isim = isim;
		this.soyisim = soyisim;
		this.ozlukDosyasi = ozlukDosyasi;
		System.out.println("Üçlü constructor");
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

	public OzlukDosyasi getOzlukDosyasi() {
		return ozlukDosyasi;
	}

	public void setOzlukDosyasi(OzlukDosyasi ozlukDosyasi) {
		this.ozlukDosyasi = ozlukDosyasi;
	}
	
}
