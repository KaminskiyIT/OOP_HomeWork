package com.gmail.kaminsky;

public class Dog {
	
	private String breed;
	private String color;
	private String ears;
	private String tail;
	private int year;
	private double growth;
	private double weight;
	private boolean barking;
	private boolean scratchOnsEar;
	private boolean bind;

	public Dog(String breed, String color, String ears, String tail, int year, double growth, double weight) {
		super();
		this.breed = breed;
		this.color = color;
		this.ears = ears;
		this.tail = tail;
		this.year = year;
		this.growth = growth;
		this.weight = weight;
	}
	
	public Dog() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getEars() {
		return ears;
	}

	public void setEars(String ears) {
		this.ears = ears;
	}

	public String getTail() {
		return tail;
	}

	public void setTail(String tail) {
		this.tail = tail;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getGrowth() {
		return growth;
	}

	public void setGrowth(double growth) {
		this.growth = growth;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	
	public boolean isBarking() {
		return barking;
	}

	public void setBarking(boolean barking) {
		this.barking = barking;
	}

	public boolean isScratchOnsEar() {
		return scratchOnsEar;
	}

	public void setScratchOnsEar(boolean scratchOnsEar) {
		this.scratchOnsEar = scratchOnsEar;
	}

	public boolean isBind() {
		return bind;
	}

	public void setBind(boolean bind) {
		this.bind = bind;
	}

	public void barking(boolean barking) {
		System.out.println("GAU-GAU!!!");
	}
	
	public void scratchOnesEar(boolean scratchOnesEar) {
		System.out.println(breed + " is happy when it scratches behind the ear.");
	}
	
	public void bind(boolean bind) {
		System.out.println(breed + " takes offense when it is tied.");
	}

	@Override
	public String toString() {
		return "Dog [breed=" + breed + "; color=" + color + "; ears=" + ears + "; tail=" + tail + "; year=" + year + "; growth=" + growth
				+ "; weight=" + weight + "]";
	}
}