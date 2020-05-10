package com.org.singtel;

public class Chicken extends Bird{
	@Override
	public String sing() {
		String res = "Cluck, Cluck";
		System.out.println(res);
		return res;
	}
	
	@Override
	public String fly() {
		String res = "I can not fly";
		System.out.println(res);
		return res;
	}

}
