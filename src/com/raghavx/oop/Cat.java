package com.raghavx.oop;

import java.awt.Color;

public class Cat extends Animal{

	// 1. instance variable - state
	private int eyes, ears, nose;

	private final int id;

	private boolean sleeping;

	private int legs;

	private final Color color;

	public Cat(Color color, int id) {
		// constructor
		this.eyes = 2;
		this.legs = 4;
		this.color = color;
		this.id = id;
	}

	// 2. Behavior - method

	public void run() {
		System.out.println("Cat runs ");
	}

	public void drink() {
		System.out.println("Drinking milk ");
	}

	// 3. Identity
	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			Cat cat = (Cat) obj;
			return cat.id == this.id;
		}
		return false;
	}

}
