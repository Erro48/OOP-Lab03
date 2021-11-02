package oop.lab03.shapes;

import oop.lab03.shapes.interfaces.Polygon;

public class Triangle implements Polygon {
	
	static final int EDGE_NUMBER = 3;
	
	private double[] edges;
	
	public Triangle(double[] edges) {
		this.edges = edges;
	}

	@Override
	public double calculatePerimeter() {
		return this.edges[0] + this.edges[1] + this.edges[2];
	}
	
	private double getSemiPerimeter() {
		return calculatePerimeter() / 2;
	}

	@Override
	public double calculateArea() {
		return Math.sqrt(getSemiPerimeter() * (getSemiPerimeter() - this.edges[0])
						* (getSemiPerimeter() - this.edges[1])
						* (getSemiPerimeter() - this.edges[2]));
	}

	@Override
	public int getEdgeCount() {
		return Triangle.EDGE_NUMBER;
	}

}
