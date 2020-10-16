package com.qa.Stages;

import java.util.Scanner;

public class StartStage {

	Scanner sc = new Scanner(System.in);
	
//	public void Start(String name) {}
//	public String name = "";
//	public String action = "";
	
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
			System.out.println("You may now follow this path down to the next stage");
			battle();
			break;
		default:
			System.out.println("That is not a valid selection, please try again!");
			break;
		
		}
	}

	private void battle() {
		System.out.println("Travelling down the path. Your footsteps echo. Left. Right.");
		System.out.println("+__");
		System.out.println("__+");
		System.out.println("+__");
		System.out.println("__+");
		System.out.println("+__");
		System.out.println("__+");
		System.out.println("");
		System.out.println("");

		System.out.println("Which path do you choose?");
		//action = sc.nextLine();
	
}

}
