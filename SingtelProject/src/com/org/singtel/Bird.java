package com.org.singtel;

public class Bird implements Animal {
	public String fly() {
		String res = "I am flying";
		System.out.println(res);
		return res;
	}

	public String sing() {
		String res ="I am singing";
		System.out.println(res);
		return res;
	}

	@Override
	public String walk() {
		String res ="I am walking";
		System.out.println(res);
		return res;
	}

	@Override
	public String swim() {
		String res ="I can not swim";
		System.out.println(res);
		return res;
	}

}
