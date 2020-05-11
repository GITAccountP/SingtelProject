package com.org.singtel;

public class Shark implements Fish{

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
		System.out.println("I am a big fish");
	}

	@Override
	public void colour() {
		System.out.println("I am a Grey Coloured fish");
	}

	@Override
	public String eat() {
		String res = "I eat Other small fish";
		System.out.println(res);
		return res;
	}

	@Override
	public String makeJokes() {
		String res = "I don't make Jokes";
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
