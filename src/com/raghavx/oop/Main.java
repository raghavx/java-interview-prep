package com.raghavx.oop;

import java.awt.Color;

public class Main {
/**
 * Package 
 * Class
 * Object 
 * Inheritance 
 * 
 * @param args
 */
	public static void main(String[] args) {
		Cat cat = new Tiger(Color.yellow, 1);
		cat.drink();
		Animal a = new Cat(Color.white, 2);
		a.talk();

		Herbivorous h = new Cow();
		h = new Goat();
		Animal g = new Goat();
		if(g instanceof Herbivorous) {
			System.out.println("Yes ");
		}
		
		MilkingAnimal ma = new MilkingAnimal(new Cow());
		ma.milk();
		ma = new MilkingAnimal(new Goat());
		ma.milk();
	}

}
