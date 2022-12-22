package main;

import java.util.ArrayList;
import java.util.List;

public class MainClass {

	public static void main(String[] args) {

//		training();
		training2();
	}

	private static void training2() {
		List<Integer> myList = new ArrayList<Integer>();

		List beforeJava5 = new ArrayList();
		beforeJava5.add(new Integer(1989));

		for (int i = 0; i < beforeJava5.size(); i++) {
			System.out.println(beforeJava5.get(i));
		}

		List<Integer> afterJava5 = new ArrayList<Integer>();
		afterJava5.add(1989);

		for (int i = 0; i < afterJava5.size(); i++) {
			System.out.println(afterJava5.get(i));
		}
	}

	static void training() {
		ArrayList myArrayList = new ArrayList<>();
		myArrayList.add(20);
		myArrayList.add(30);
		myArrayList.add("test");
		myArrayList.add(40);
		// set metodu ile ilgili indexteki elemani override edebiliriz.
		myArrayList.set(3, 15);
		myArrayList.add(true);
		myArrayList.add(new MainClass());
		myArrayList.add("eleman");

		for (int i = 0; i < myArrayList.size(); i++) {
			System.out.println(myArrayList.get(i));
		}
		System.out.println();
		System.out.println("isEmpty: " + myArrayList.isEmpty());
		System.out.println("size: " + myArrayList.size());
		System.out.println("does myArrayList contains 25: " + myArrayList.contains(20));
	}
}
