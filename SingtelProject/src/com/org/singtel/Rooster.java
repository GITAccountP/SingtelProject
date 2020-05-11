package com.org.singtel;

import java.util.HashMap;
import java.util.Map;

public class Rooster extends Chicken{
	
	private static Map<String, String> myLang = null;
	static {
	myLang = new HashMap<String,String> ();
	myLang.put("Danish", "kykyliky");
	myLang.put("Dutch", "kukeleku");
	myLang.put("Finnish", "kukko kiekuu");
	myLang.put("French", "cocorico");
	myLang.put("German", "kikeriki");
	myLang.put("Greek", "kikiriki");
	myLang.put("Hebrew", "coo-koo-ri-koo");
	myLang.put("Hungarian", "kukuriku");
	myLang.put("Italian", "chicchirichi");
	myLang.put("Japanese", "ko-ke-kok-ko-o");
	myLang.put("Portuguese", "cucurucu");
	myLang.put("Russian", "kukareku");
	myLang.put("Swedish", "kuckeliku");
	myLang.put("Turkish", "kuk-kurri-kuuu");
	myLang.put("Urdu", "kuklooku");
	}
	@Override
	public String sing() {
		String res = "Cock-a-doodle-doo";
		System.out.println(res);
		return res;
	}
	
	public void sing(String language)
	{
		if(null == language || language.isEmpty())
		{
			System.out.println("Cock-a-doodle-doo");
		}
		else
		{
			System.out.println(myLang.get(language));
		}
	}
}
