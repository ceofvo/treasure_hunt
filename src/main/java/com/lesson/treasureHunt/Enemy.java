package com.lesson.treasureHunt;

public class Enemy extends Unit{
	
	public Enemy() {
		super();
		setName("Enemy"); 
		setCharacter("E");
		System.out.println("Unit initiated..." + super.getName());
	}

}
