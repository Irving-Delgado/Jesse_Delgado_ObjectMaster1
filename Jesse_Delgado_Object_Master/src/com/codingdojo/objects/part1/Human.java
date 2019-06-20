package com.codingdojo.objects.part1;

public class Human {
	public int health = 100;
	public int strength = 3;
	public int stealth = 3;
	public int intelligence = 3;
	
	public void attack(Human human) {
		health -= strength; 
	}
	public void displayHealth() {
		System.out.println("Your health is, "+health);
	}
}
