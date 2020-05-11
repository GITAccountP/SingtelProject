package com.org.singtel;

public class ClownFish implements Fish{

	@Override
	public String fly() {
		String res = "I can not fly";
		System.out.println(res);
		return res;
	}

	@Override
	public String sing() {
		String res = "I can not sing";
		System.out.println(res);
		return res;
	}

	@Override
	public String walk() {
		String res = "I can not walk";
		System.out.println(res);
		return res;
	}

	@Override
	public void size() {
		System.out.println("I am a small fish");
	}

	@Override
	public void colour() {
		System.out.println("I am a Orange Coloured fish");
	}

	@Override
	public String eat() {
		String res = "I don't eat Other fish";
		System.out.println(res);
		return res;
	}

	@Override
	public String makeJokes() {
		String res = "I make Jokes";
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
