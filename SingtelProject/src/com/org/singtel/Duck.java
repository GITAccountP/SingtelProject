package com.org.singtel;

public class Duck extends Bird{
	@Override
	public void sing() {
		System.out.println("Quack, Quack");
	}

	@Override
	public void swim() {
		System.out.println("I can swim");
	}
}