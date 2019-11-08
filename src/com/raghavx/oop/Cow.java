package com.raghavx.oop;

public class Cow extends Animal implements Herbivorous {

	@Override
	public void drink() {
		System.out.println("Drinks water");
	}

	@Override
	public void grass() {
		System.out.println("Eating grass ");

	}

	@Override
	public void milk() {
		System.out.println("Cows milk");
	}
}
