package main;

public abstract class Shape {

	private String name;
	private int numberOfSides;

	public Shape(String name, int numberOfSides) {
		super();
		this.name = name;
		this.numberOfSides = numberOfSides;
	}

	abstract void draw();

	abstract void erase();

	abstract double calculateArea();

	abstract double calculateCircumference();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumberOfSides() {
		return numberOfSides;
	}

	public void setNumberOfSides(int numberOfSides) {
		this.numberOfSides = numberOfSides;
	}
}
