package com.gmail.kaminsky;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Triangle triangleOne = new Triangle();
		triangleOne.setLengthOne(3);
		triangleOne.setLengthTwo(4);
		triangleOne.setLengthThree(5);
		System.out.println("The area of the triangle is " + triangleOne.areaOfTriangle(triangleOne.getLengthOne(),
				triangleOne.getLengthTwo(), triangleOne.getLengthThree()));

		Triangle triangleTwo = new Triangle();
		System.out.println("The area of the triangle is " + triangleTwo.areaOfTriangle(5, 10, 7));

		Triangle triangleThree = new Triangle(5, 6, 4);
		System.out.println("The area of the triangle is " + triangleThree.areaOfTriangleTwo());

	}

}
