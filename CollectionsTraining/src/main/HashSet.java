package main;

import java.util.Iterator;
import java.util.Set;

public class HashSet {

	public static void main(String[] args) {
//		hashMethod();
		iteratorMethod();
	}

	static void hashMethod() {
		Set<Integer> numbers = new java.util.HashSet<>();

		boolean isEmpty = numbers.isEmpty();
		int size = numbers.size();

		System.out.println("isEmpty:" + isEmpty);
		System.out.println("size:" + size);

		numbers.add(2);
		numbers.add(5);
		numbers.add(2);

		size = numbers.size();
		System.out.println("size:" + size);

		for (Integer number : numbers) {
			System.out.println(number);
		}
	}

	static void iteratorMethod() {
		Set<Integer> numbers = new java.util.HashSet<>();
		numbers.add(10);
		numbers.add(25);
		numbers.add(100);
		numbers.add(500);
		numbers.add(1000);

//		for (int i : numbers) {
//			System.out.println(i);
//		}

//		System.out.println();
		Iterator iterator = numbers.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
