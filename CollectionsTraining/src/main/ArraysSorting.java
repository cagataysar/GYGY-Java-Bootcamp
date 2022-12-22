package main;

import java.util.Arrays;

public class ArraysSorting {

	public static void main(String[] args) {
		Integer[] numbers = { 10, 20, 50, 25, 35, 80, -20, -30, 0, 10 };

		for (int n : numbers) {
			System.out.print(n + " ");
		}
		System.out.println();

		System.out.println("Sorting Numbers");
		Arrays.sort(numbers);

		for (int n : numbers) {
			System.out.print(n + " ");
		}
		System.out.println("\n");

		String[] stringArray = { "de", "", "da", "De", "DE", "a", "A", "1", "Z" };

		for (String str : stringArray) {
			System.out.print(str + " ");
		}
		System.out.println();

		System.out.println("Sorting Strings");

		Arrays.sort(stringArray);

		for (String str : stringArray) {
			System.out.print(str + " ");
		}
	}
}
