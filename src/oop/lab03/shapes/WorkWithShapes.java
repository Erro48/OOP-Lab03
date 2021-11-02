package oop.lab03.shapes;

public class WorkWithShapes {

	public static void main(String[] args) {
		Square square = new Square(10);
		System.out.println("Square perimeter: " + square.calculatePerimeter());
		System.out.println("Square area: " + square.calculateArea());

		Rectangle rectangle = new Rectangle(5, 8);
		System.out.println("Rectangle perimeter: " + rectangle.calculatePerimeter());
		System.out.println("Rectangle area: " + rectangle.calculateArea());
		
		Triangle triangle = new Triangle(new double[] { 3, 6, 7 });
		System.out.println("Triangle perimeter: " + triangle.calculatePerimeter());
		System.out.println("Triangle area: " + triangle.calculateArea());
		
		
	}

}
