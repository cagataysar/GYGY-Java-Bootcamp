package main;

public class FinallyBlockWithoutCatch {

	public static void main(String[] args) {
		System.out.println("The program is begining here."); // 1
		try {
			divide(20, 4); // 2
			System.out.println("in try block in main(). Just after calling divide()\n"); // 6
		} finally {
			System.out.println("in finally"); // 7
		}
		System.out.println("in main(), after calling divide()\n"); // 8
	}

	public static void divide(int num1, int num2) {
		System.out.println("in divide() with arguments: " + num1 + " and " + num2); // 3
		if (num2 == 0)
			throw new ArithmeticException("0'a bolemezsiniz.");
		else {
			int division = num1 / num2; // 4
			System.out.println(num1 + "/" + num2 + " = " + division); // 5
		}
	}
}
