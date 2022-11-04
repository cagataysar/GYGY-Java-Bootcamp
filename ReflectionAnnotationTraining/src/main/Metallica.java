package main;

public class Metallica {

	public final static int KISI_SAYISI = 4;
	private String vocalName;
	private int vocalAge;

	public Metallica() {
		this("James", 50);
	}

	public Metallica(String vocalName, int vocalAge) {
		super();
		this.vocalName = vocalName;
		this.vocalAge = vocalAge;
	}

	public String getVocalName() {
		return vocalName;
	}

	public void setVocalName(String vocalName) {
		this.vocalName = vocalName;
	}

	public int getVocalAge() {
		return vocalAge;
	}

	public void setVocalAge(int vocalAge) {
		this.vocalAge = vocalAge;
	}

	private void increaseAge() {
		++vocalAge;
	}

	public static void printPersonCount() {
		System.out.println("No: " + KISI_SAYISI);
	}

	@Override
	public String toString() {
		return "Metallica [vocalName=" + vocalName + ", vocalAge= " + vocalAge + "]";
	}

}
