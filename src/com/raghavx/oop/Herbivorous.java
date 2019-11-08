package com.raghavx.oop;

public interface Herbivorous {

	public void grass();
	
	/**
	 * JAVA 8 
	 */
	default void milk() {
		System.out.println("Milks");
	}
}
