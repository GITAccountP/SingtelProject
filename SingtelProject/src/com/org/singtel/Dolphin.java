package com.org.singtel;

public class Dolphin implements Animal {
	
	Fish fish = null;
	
	void isFish(Fish fish)
	{
		this.fish = fish;
	}

	@Override
	public String fly() {
		return fish.fly();
	}

	@Override
	public String sing() {
		return fish.sing();
	}

	@Override
	public String walk() {
		return fish.walk();
	}

	@Override
	public String swim() {
		return fish.swim();
	}

}
