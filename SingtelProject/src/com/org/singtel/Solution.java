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
		Parrot myParrotWithRooster = new Parrot();
		System.out.println("*********Parrot With Rooster*********");
		myParrotWithRooster.parrotLivesWith(new Rooster());
		myParrotWithRooster.sing();
		myParrotWithRooster.swim();
		Shark myShark = new Shark();
		System.out.println("*********Shark*********");
		myShark.walk();
		myShark.fly();
		myShark.sing();
		myShark.swim();
		myShark.colour();
		myShark.eat();
		myShark.makeJokes();
		ClownFish myClownFish = new ClownFish();
		System.out.println("*********ClownFish*********");
		myClownFish.walk();
		myClownFish.fly();
		myClownFish.sing();
		myClownFish.swim();
		myClownFish.colour();
		myClownFish.eat();
		myClownFish.makeJokes();
		Dolphin myDolphin = new Dolphin();
		System.out.println("*********Dolphin*********");
		myDolphin.isFish(new Shark());
		myDolphin.walk();
		myDolphin.fly();
		myDolphin.sing();
		myDolphin.swim();
		
	}

}
