package com.org.singtel;

public class Solution {

	public static void main(String[] args) {
		System.out.println("First Implementation");
		System.out.println("*********Bird*********");
		Animal bird = new Bird();
		bird.walk();
		bird.fly();
		bird.sing();
		System.out.println("Second Implementation");
		System.out.println("*********Duck*********");
		Animal myDuck = new Duck();
		myDuck.walk();
		myDuck.fly();
		myDuck.sing();
		myDuck.swim();
		Animal myChicken = new Chicken();
		System.out.println("*********Chicken*********");
		myChicken.walk();
		myChicken.fly();
		myChicken.sing();
		myChicken.swim();
		Animal myRooster = new Rooster();
		System.out.println("*********Rooster*********");
		myRooster.walk();
		myRooster.fly();
		myRooster.sing();
		myRooster.swim();
		Parrot myParrot = new Parrot();
		System.out.println("*********Parrot*********");
		myParrot.parrotLivesWith(new Duck());
		myParrot.sing();
		myParrot.swim();
		Parrot myParrotWithCat = new Parrot();
		System.out.println("*********Parrot With Cat*********");
		myParrotWithCat.parrotLivesWith(new Cat());
		myParrotWithCat.sing();
		myParrotWithCat.swim();
		Parrot myParrotWithDog = new Parrot();
		System.out.println("*********Parrot With Dog*********");
		myParrotWithDog.parrotLivesWith(new Dog());
		myParrotWithDog.sing();
		myParrotWithDog.swim();
	}

}
