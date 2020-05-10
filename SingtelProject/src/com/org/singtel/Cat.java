package com.org.singtel;

public class Cat extends AnimalImpl{

	@Override
	public String sing() {
		String res = "Meow";
		System.out.println(res);
		return res;
	}

}
