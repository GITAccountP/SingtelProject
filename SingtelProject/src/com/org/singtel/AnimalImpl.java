package com.org.singtel;

public class AnimalImpl implements Animal{

	@Override
	public String fly() {
		String res = "I can not fly";
		System.out.println(res);
		return res;
	}

	@Override
	public String sing() {
		String res = "I can talk";
		System.out.println(res);
		return res;
	}

	@Override
	public String walk() {
		String res =  "I am walking";
		System.out.println(res);
		return res;
	}

	@Override
	public String swim() {
		String res =  "I can swim";
		System.out.println(res);
		return res;
	}
}
