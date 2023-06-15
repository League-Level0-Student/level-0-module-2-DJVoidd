//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

package _01_random._4_validation;

import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {
		
		Random randomMaker = new Random();
		
		int randomChoice = randomMaker.nextInt(5);
		
		System.out.println(randomChoice);

		// 1. Use each value of randomNumber to give the user a random compliment.
		if (randomChoice == 0) {
JOptionPane.showMessageDialog(null, "You are cool c:");
		} else if (randomChoice == 1) {
			JOptionPane.showMessageDialog(null, "You are not cool :c (it's opposite day)");
		} else if (randomChoice == 2) {
			JOptionPane.showMessageDialog(null, "you are chill");
		} else if (randomChoice == 3) {
			JOptionPane.showMessageDialog(null, "you have a below-room-tempurature heat level");
		} else if (randomChoice == 4) {
			JOptionPane.showMessageDialog(null, "your thermal energy is not up to standards");
		} else {
			JOptionPane.showMessageDialog(null, "you are feeling quite brisk today");
		}
		// 2. Repeat all the code above 10 times
		
		// 3. Find someone to test out your program. They will like it :)
	}
}
