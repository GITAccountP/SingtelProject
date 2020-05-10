package com.org.singtel;

public class Dog extends AnimalImpl{

	@Override
	public String sing() {
		String res = "Woof, Woof";
		System.out.println(res);
		return res;
	}

}
