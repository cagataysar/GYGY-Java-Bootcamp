package main;

public class DivisionByZero {

	public static void main(String[] args) {
		divide(20, 0);
		System.out.println("After divide."); // this line doesn't execute.
	}

	private static void divide(int num1, int num2) {
		System.out.println("in divide() with arguments: " + num1 + " and " + num2);
		int division = num1 / num2;
		System.out.println(num1 + "/" + num2 + " = " + division);

	}
}
