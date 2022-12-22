package main;

public class DivisionByZero3 {

	public static void main(String[] args) {

		/**
		 * Bu durumda spesifik exception yazmak daha doğrudur. Dolayısıyla ilk try-catch
		 * bloğundaki ArithmeticException kullanılmalıdır.
		 */

		try {
			divide(20, 0);
		} catch (ArithmeticException e) {
			System.out.println(e.getClass().getName());
			System.out.println("Problem with division.");
			System.out.println("Message " + e.getMessage());
			System.out.println();
		}

		try {
			divide(20, 0);
		} catch (RuntimeException e) {
			System.out.println(e.getClass().getName());
			System.out.println("Problem with division.");
			System.out.println("Message " + e.getMessage());
			System.out.println();
		}

		try {
			divide(20, 0);
		} catch (Exception e) {
			System.out.println(e.getClass().getName());
			System.out.println("Problem with division.");
			System.out.println("Message " + e.getMessage());
			System.out.println();
		}

		try {
			divide(20, 0);
		} catch (Throwable e) {
			System.out.println(e.getClass().getName());
			System.out.println("Problem with division.");
			System.out.println("Message " + e.getMessage());
			System.out.println();
		}

	}

	private static void divide(int num1, int num2) throws ArithmeticException {
		System.out.println("in divide() with arguments: " + num1 + " and " + num2);
		if (num2 == 0) {
			throw new ArithmeticException("0'a bölme yapamazsınız. ");
		} else {
			int division = num1 / num2;
			System.out.println(num1 + "/" + num2 + " = " + division);
			System.out.println("Division operation has been successfull.");
		}
	}

}
