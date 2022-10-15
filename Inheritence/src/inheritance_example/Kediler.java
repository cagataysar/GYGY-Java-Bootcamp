package inheritance_example;

public class Kediler extends Memeliler {

	public static void sleep() {
		System.out.println("My job is to sleep. ");
	}

	@Override
	public String toString() {
		return "My name is " + isim;
	}
}
