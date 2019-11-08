package com.raghavx.oop;

import java.awt.Color;

public class Tiger extends Cat implements WildAnimal, Carnivorus {

	public Tiger(Color color, int id) {
		super(color, id);
	}

	public void talk() {
		System.out.println("Animal Roars ");
	}

	@Override
	public void drink() {
		System.out.println("Drinks blood");
	}

	@Override
	public void life() {
		System.out.println("Lives in Jungle");

	}

	@Override
	public void meat() {
		System.out.println("Happy eating meat");
	}
}
