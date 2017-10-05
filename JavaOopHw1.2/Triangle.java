package com.gmail.kaminsky;

public class Triangle {

	private double lengthOne;
	private double lengthTwo;
	private double lengthThree;
	private double areaOfTriangle;

	public Triangle(double lengthOne, double lengthTwo, double lengthThree) {
		super();
		this.lengthOne = lengthOne;
		this.lengthTwo = lengthTwo;
		this.lengthThree = lengthThree;
	}

	public Triangle() {
		super();
	}

	public double getLengthOne() {
		return lengthOne;
	}

	public void setLengthOne(double lengthOne) {
		this.lengthOne = lengthOne;
	}

	public double getLengthTwo() {
		return lengthTwo;
	}

	public void setLengthTwo(double lengthTwo) {
		this.lengthTwo = lengthTwo;
	}

	public double getLengthThree() {
		return lengthThree;
	}

	public void setLengthThree(double lengthThree) {
		this.lengthThree = lengthThree;
	}

	public double getAreaOfTriangle() {
		return areaOfTriangle;
	}

	public double areaOfTriangle(double lengthOne, double lengthTwo, double lengthThree) {

		double semiperimeter = (lengthOne + lengthTwo + lengthThree) / 2;

		return areaOfTriangle = Math.sqrt(semiperimeter * (semiperimeter - lengthOne) * (semiperimeter - lengthTwo)
				* (semiperimeter - lengthThree));
	}

	public double areaOfTriangleTwo() {

		double semiperimeter = (lengthOne + lengthTwo + lengthThree) / 2;

		return Math.sqrt(semiperimeter * (semiperimeter - lengthOne) * (semiperimeter - lengthTwo)
				* (semiperimeter - lengthThree));
	}
}
