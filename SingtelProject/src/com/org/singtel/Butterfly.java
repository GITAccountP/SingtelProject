package com.org.singtel;

public class Butterfly implements Animal{
	
	boolean caterpiller = false;
	
	public void setCaterpiller(boolean caterpiller) {
		this.caterpiller = caterpiller;
	}

	public boolean caterpiller() {
		return caterpiller;
	}

	@Override
	public String fly() {
		String res = null;
		if(caterpiller)
		{
			res = "I can not fly";
		}
		else
		{
			res = "I can fly";
		}
		System.out.println(res);
		return res;
	}

	@Override
	public String sing() {
		String res ="I can not sing";
		System.out.println(res);
		return res;
	}

	@Override
	public String walk() {
		String res = null;
		if(caterpiller)
		{
			res = "I can walk slowly/ Crawl";
		}
		else
		{
			res = "I can not walk";
		}
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
