package oop.lab03.shapes;

import oop.lab03.shapes.interfaces.Polygon;

public class Rectangle implements Polygon {
	
	static final int EDGE_NUMBER = 4;

	private double base;
	private double height;
	
	public Rectangle(double base, double height) {
		this.base = base;
		this.height = height;
	}

	@Override
	public double calculatePerimeter() {
		return this.base * 2 + this.height * 2;
	}

	@Override
	public double calculateArea() {
		return this.base * this.height;
	}

	@Override
	public int getEdgeCount() {
		return Rectangle.EDGE_NUMBER;
	}

}
