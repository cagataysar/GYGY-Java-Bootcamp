package Challenge_03;

import java.util.Scanner;

public class SimpleCalculator {
	public static void main(String[] args) {
		SimpleCalculator calculator = new SimpleCalculator();
		calculator.calculateGivenNumbers();
	}

	void calculateGivenNumbers() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Select the operation you want to perform: \n" + "Addition (1) \n" + "Subtraction (2) \n"
				+ "Multiplication (3) \n" + "Division (4) \n" + "Exponentiation (5) \n" + "Mode (6) \n"
				+ "Factorial (7) \n");

		int choose = scanner.nextInt();
		if (choose == 1) {
			sumNumbers();
		} else if (choose == 2) {
			subNumbers();
		} else if (choose == 3) {
			multiplyNumbers();
		} else if (choose == 4) {
			divNumbers();
		} else if (choose == 5) {
			expNumbers();
		} else if (choose == 6) {
			modeNumbers();
		} else if (choose == 7) {
			factorialNumber();
		} else
			System.out.println("Wrong choose!");
	}

	public void sumNumbers() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first number: ");
		double a = sc.nextDouble();
		System.out.print("Enter the second number: ");
		double b = sc.nextDouble();
		double result = a + b;
		System.out.println("Result: " + result);
	}

	public void subNumbers() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first number: ");
		double a = sc.nextDouble();
		System.out.print("Enter the second number: ");
		double b = sc.nextDouble();
		double result = a - b;
		System.out.println("Result " + result);
	}

	public void multiplyNumbers() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first number: ");
		double a = sc.nextDouble();
		System.out.print("Enter the second number: ");
		double b = sc.nextDouble();
		double result = a * b;
		System.out.println("Result " + result);
	}

	public void divNumbers() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first number: ");
		double a = sc.nextDouble();
		System.out.print("Enter the second number: ");
		double b = sc.nextDouble();
		double result = a / b;
		System.out.println("Result " + result);
	}

	public void expNumbers() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first number: ");
		double a = sc.nextDouble();
		System.out.print("Enter the base number: ");
		double b = sc.nextDouble();
		double result = Math.pow(a, b);
		System.out.println("Result " + result);
	}

	public void modeNumbers() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first number: ");
		double a = sc.nextDouble();
		System.out.print("Enter the second number: ");
		double b = sc.nextDouble();
		double result = a % b;
		System.out.println("Result " + result);
	}

	public void factorialNumber() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first number: ");
		double a = sc.nextDouble();

		int result = 1;
		for (int i = 1; i <= a; i++) {
			result = result * i;
		}
		System.out.println("Result " + result);
	}
}
