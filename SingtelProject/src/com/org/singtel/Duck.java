package com.org.singtel;

public class Duck extends Bird{
	@Override
	public String sing() {
		String res = "Quack, Quack";
		System.out.println(res);
		return res;
	}
	
	@Override
	public String fly() {
		String res = "I can not fly";
		System.out.println(res);
		return res;
	}

	@Override
	public String swim() {
		String res = "I can swim";
		System.out.println(res);
		return res;
	}
}