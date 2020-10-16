package com.qa;

import java.util.Scanner;

import com.qa.Stages.StartStage;

public class Runner {
	static Scanner sc = new Scanner(System.in);
//	static Scanner sc1 = new Scanner(System.in);
	public static String userName;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("What is your name?");
		String name = sc.nextLine();
		userName = name;
		System.out.println("Welcome to the swamp, " + name +
					"!! You best be prepared!");
		StartStage x = new StartStage();
		String action = "";
		x.Start(name, action);
	}

}
