package com.gmail.kaminsky;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dog dogOne = new Dog();
		dogOne.setBreed("Australian Shepherd");
		dogOne.setYear(2017);
		dogOne.setGrowth(51);
		dogOne.setWeight(25);
		dogOne.setColor("Black, red with tan, blue-merle, red");
		dogOne.setEars("Semi-permanent, moderate size");
		dogOne.setTail("Straight");
		
		Dog dogTwo = new Dog("Pug", "Pale, silver, apricot and black", "Very small", "A high set tail is twisted into a tight curl", 2015, 30, 11);
		
		System.out.println(dogOne);
		
		System.out.println();
		
		System.out.println(dogTwo);
		
		System.out.println();
		
		dogOne.barking(true);
		dogOne.scratchOnesEar(true);
		
		System.out.println();
		
		dogTwo.bind(true);
	}
}