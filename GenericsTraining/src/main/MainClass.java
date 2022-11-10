package main;

class Animal {
	public void eat() {
		System.out.println("Animal eat");
	}
}

class Dog extends Animal {
	public void eat() {
		System.out.println("Dog eat");
	}
}

class Cat extends Animal {
	public void eat() {
		System.out.println("Cat eat");
	}
}

public class MainClass {

	public static void main(String[] args) {
//		Dog dog = new Dog();
//		Animal animal = new Animal();
//		Animal animalCat = new Cat();

		polymorphismTest(new Dog());
		polymorphismTest(new Animal());
		polymorphismTest(new Cat());

	}

	public static void polymorphismTest(Animal a) {
		a.eat();

	}
}
