package com.org.singtel;

public class Rooster extends Chicken{
	@Override
	public String sing() {
		String res = "\"Cock-a-doodle-doo\"";
		System.out.println(res);
		return res;
	}
}
