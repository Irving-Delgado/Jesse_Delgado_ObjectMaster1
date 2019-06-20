package com.codingdojo.objects.part1;

public class HumanTest {
	public static void main(String[] args) {
		Ninja ninja = new Ninja();
		Wizard wizard = new Wizard();
		Samurai samurai = new Samurai();
		
		
		ninja.attack(wizard);
		ninja.displayHealth();
		
		wizard.attack(ninja);
		wizard.displayHealth();
		
		samurai.attack(wizard);
		wizard.displayHealth();
	
	}
}
