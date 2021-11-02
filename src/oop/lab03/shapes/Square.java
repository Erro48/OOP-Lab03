package oop.lab03.shapes;

import oop.lab03.shapes.interfaces.Polygon;

public class Square extends Rectangle implements Polygon {
	
	public Square(double edgeLength) {
		super(edgeLength, edgeLength);
	}

}
