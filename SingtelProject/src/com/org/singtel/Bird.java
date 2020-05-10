package com.org.singtel;

public class Bird implements Animal {
	public void fly() {
		System.out.println("I am flying");
	}

	public void sing() {
		System.out.println("I am singing");
	}

	@Override
	public void walk() {
		System.out.println("I am walking");
	}

	@Override
	public void swim() {
		System.out.println("I can swim");
	}

}
