package main;

public class ShapeMain {

	public static void main(String[] args) {
		ShapeMain test = new ShapeMain();
		for (int i = 0; i < 5; i++) {
			Shape shape = ShapeFactory.createShape();
			test.display(shape);
		}
	}

	public void display(Shape shape) {
		shape.draw();
		System.out.println("Area: " + shape.calculateArea());
		System.out.println("Circumference: " + shape.calculateCircumference());
	}

}
