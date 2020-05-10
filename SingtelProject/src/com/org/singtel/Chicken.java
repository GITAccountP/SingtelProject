package com.org.singtel;

public class Chicken extends Bird{
	@Override
	public void sing() {
		System.out.println("Cluck, Cluck");
	}
	
	@Override
	public void fly() {
		System.out.println("I can not fly");
	}
	
	@Override
	public void swim() {
		System.out.println("I can not swim");
	}
}
