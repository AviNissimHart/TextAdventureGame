package com.qa.Stages;

import java.util.Scanner;

public class StartStage {

	Scanner sc = new Scanner(System.in);
	Scanner sc1 = new Scanner(System.in);
	//Scanner proceed = new Scanner(System.in);
	
//	public void Start(String name) {}
//	public String name = "";
	public String battleAction = "";
	public int health = 100;
	public int trollHealth = 100;
	
	public void Start(String name, String action) {
		System.out.println("Here, at the entrance of the swamp, you must choose between the left path and the right path.");
		System.out.println("Which path do you choose?");
		action = sc.nextLine();
		
		switch (action) {
		case "left":
			System.out.println("You have chosen: " + action);
			System.out.println("This is not the 'right' answer!!");
			System.out.println("*Laughs in Shrek*");
			System.out.println("You have fallen for my early trick quesiton, therefore you lose");
			break;
		case "right":
			System.out.println("You have chosen: " + action);
			System.out.println("Interesting. You have chosen wisely for a mortal. Beginners luck!");
			System.out.println("You may now follow this path down to the next stage.");
			//System.out.println("Are you ready to proceed? y/n");
			battle();
			break;
		default:
			System.out.println("That is not a valid selection, please try again!");
			break;
		
		}
		System.out.println("Well done on completing the task");
	}

	private void battle() {
		System.out.println("**Travelling down the path. Your footsteps echo. Left. Right**");
		System.out.println("+__");
		System.out.println("__+");
		System.out.println("+__");
		System.out.println("__+");
		System.out.println("+__");
		System.out.println("__+");
		System.out.println("**GROWL**");
		System.out.println("A troll has presented itself. It will strike you on its turn, docking you 20 health. Both your health starts at 100");
		System.out.println("On your turn, you can choose to either punch(10) or kick(50) the troll. Kill him before he kills you");
		
		while(health > 0) {
			while(trollHealth > 0) {
				System.out.println("Do you want to punch or kick the troll?");
				battleAction = sc1.nextLine();
				switch (battleAction) {
				case "punch":
					System.out.println("You have chosen punch. You have taken 10 troll health");
					trollHealth = trollHealth - 10;
					System.out.println("Troll's health is: "+ trollHealth);
					break;
				case "kick":
					System.out.println("You have chosen kick. You have taken 50 troll health");
					trollHealth = trollHealth - 50;
					System.out.println("Troll's health is: "+ trollHealth);
					break;
				default:
					System.out.println("That is not a valid selection, please try again!");
					break;
				}
				System.out.println("The troll has knocked you on the head, you lose 20 health");
				health = health - 20;
				System.out.println("Your health is now: " + health);
				if(health <= 0 && trollHealth > 0) {
					System.out.println("Troll killed you. Game over");
					System.exit(0);
				} else if(health > 0 && trollHealth <= 0) {
					System.out.println("Success! You killed the troll!");
					break;
				}
			}
			break;
		}
		
}
	

}
