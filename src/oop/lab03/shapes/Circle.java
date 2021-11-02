package oop.lab03.shapes;

import oop.lab03.shapes.interfaces.Shape;

public class Circle implements Shape {

	private double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public double getRadius() {
		return this.radius;
	}
	
	public double calculatePerimeter() {
		return 2 * Math.PI * this.radius;
	}

	public double calculateArea() {
		return Math.PI * Math.pow(this.radius, 2);
	}

}
