package com.raghavx.oop;

public class MilkingAnimal {
	
	private Herbivorous h;
	
	// decoupling 
	public MilkingAnimal(Herbivorous h) {
		this.h = h;
	}
	
	public void milk() {
		h.milk();
	}

}
