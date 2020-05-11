package com.org.singtel;

public class Parrot extends Bird{
	
	Animal animal = null;
	
	public void parrotLivesWith(Animal animal)
	{
		this.animal = animal;
	}

	@Override
	public String sing() {
		return this.animal.sing();
	}
	
	@Override
	public String swim() {
		return this.animal.swim();
	}

}
