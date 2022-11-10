package main;

public class BasicGenericMethod {

	public static void main(String[] args) {
		toplaMetodu(3, 8);
	}

	public static <T extends Number> void toplaMetodu(T deger1, T deger2) {
		System.out.println(deger1.intValue() + deger2.intValue());
	}
}
