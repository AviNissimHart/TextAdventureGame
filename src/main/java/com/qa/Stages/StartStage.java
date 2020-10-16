package com.qa.Stages;

import java.util.Scanner;

public class StartStage {

	Scanner sc = new Scanner(System.in);
	Scanner sc1 = new Scanner(System.in);
	//userName = Start.name;
	public String answer = "";
	public int angle = 0;
	Scanner sc2 = new Scanner(System.in);
	
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
			gameOver();
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
		System.out.println("'Well done on completing the task!' Said the ghost of the troll");
		System.out.println("You must now decide if you want to go down my path of maths, riddles or of danger");
		
		
		action = sc.nextLine();
		switch (action) {
		case "maths":
			System.out.println("You have chosen: " + action);
			System.out.println("Follow the path this way");
			maths();
			break;
		case "riddles":
			System.out.println("You have chosen: " + action);
			System.out.println("Follow the path this way");
			riddles();
			break;
		case "danger":
			System.out.println("You have chosen: " + action);
			System.out.println("As you wish...foolish mortal");
			System.out.println();
			System.out.println("You walk down the danger path. You should have thought that through.");
			System.out.println("You lose due to being killed by the dangerous lions on the DANGER path");
			gameOver();
			break;
		default:
			System.out.println("That is not a valid selection, please try again!");
			break;
		}
		
		System.out.println("You have followed this path, only to find the evil MoJoJoJo standing in your way");
		System.out.println("In order to defeat me, you must summon the powerpuff girls");
		System.out.println("You must choose 4 ingredients from this list which makes them");
		finalBattle();
		
	}

	public void battle() {
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
					gameOver();
				} else if(health > 0 && trollHealth <= 0) {
					System.out.println("Success! You killed the troll!");
					System.out.println();
					break;
				}
			}
			break;
		}
		
}
	public void riddles() {
		System.out.println("You have reached the riddle river");
		System.out.println("An elderly wizard presents himself. Cackling");
		System.out.println();
		System.out.println("You have one chance to figure out my riddle. Get it wrong, and you will drown in the river of riddles");
		System.out.println();
		System.out.println("***What gets wetter as it dries?***");
		System.out.println("A - a dog, B - a towel, C - a toaster");
		
		answer = sc2.nextLine();
		switch (answer) {
		case "a":
			System.out.println("You have chosen a dog. This is wrong");
			gameOver();
			break;
		case "b":
			System.out.println("You have chosen a towel. Well done, you are smarter than you look");
			break;
		default:
			System.out.println("You have chosen a toaster. This is wrong");
			gameOver();
			break;
		}
	}

	public void maths() {
		System.out.println("You have reached the maths monkey's house");
		System.out.println("The maths monkey looks you up and down");
		System.out.println();
		System.out.println("You have one chance to figure out my calculation. Get it wrong, and you will be imprisoned as my calulator slave forever");
		System.out.println();
		System.out.println("***A triangle has 180 degree total of angles***");
		System.out.println("***If one angle is 90, what could the other angles be?***");
		System.out.println();
		
		System.out.println("Enter angle a");
		angle = sc2.nextInt();
		int a = angle;
		System.out.println("Enter angle b");
		angle = sc2.nextInt();
		int b = angle;
		
		if((a+b) == 90) {
			System.out.println("Correct! " + a + "+" + b + "+90 = 180");
			System.out.println("You may follow the path to your next decision junction");
		} else {
			System.out.println("You answered poorly! You lose. You are now my calculator for all eternity");
			gameOver();
		}
	}
	
	public void finalBattle() {
		System.out.println("|Chocolate	|Sugar	|Spice	|Everything Nice	|Flour	|Vanilla Essence");
	}
	
	public void gameOver() {
		System.out.println("You have failed the quest, better luck next time");
		System.exit(0);
	}
	

}
