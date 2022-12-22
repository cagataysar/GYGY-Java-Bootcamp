package main;

public class Circle extends Shape {

	private double radius;

	public Circle(double radius) {
		super("Circle", -1);
		this.radius = radius;
	}

	public double calculateArea() {
		return Math.PI * Math.pow(radius, 2);
	}

	public double calculateCircumference() {
		return 2 * Math.PI * radius;
	}

	public void draw() {
		System.out.println("Drawing the circle.");
	}

	public void erase() {
		System.out.println("Erasing the circle.");
	}
}
