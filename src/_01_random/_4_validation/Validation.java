//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

package _01_random._4_validation;

import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {
		
		Random ran = new Random();
		
		int ranC;
		
	for(int i=0; i<10; i++) {
		
		ranC = ran.nextInt(6);
		
		System.out.println(ranC);
		
		if(ranC == 0) {
			JOptionPane.showMessageDialog(null, "Test: Find x.\n" + (ran.nextInt(4)+2) + "(x-" + (ran.nextInt(3)+3) + ")+" + (ranC+1) + "^2 = (" + (ran.nextInt(4)+2) + "x-" + (ran.nextInt(11)+4) + ")/2");
		}
		else if(ranC == 1) {
			JOptionPane.showMessageDialog(null, "You spent A HOLE WEEK geting dragon parts. How much pashonce do you have?");
		}
		else if(ranC == 2) {
			JOptionPane.showMessageDialog(null, "Great hair you have! But why do you change your hair style EVERY. THREE. MONTHS. You're confuseing my brain!");
		}
		else if(ranC == 3) {
			JOptionPane.showMessageDialog(null, "You probuly have the largest turtel colectshon out of everybudy I know.");
		}
		else if(ranC == 4) {
			JOptionPane.showMessageDialog(null, "I am tired.");
		}
		else if(ranC == 5) {
			JOptionPane.showMessageDialog(null, "Draw a turtle!");
		}
		else {
			JOptionPane.showMessageDialog(null, "You are great at Breth of the Wild! But this message will never apear, so it is pointless saying this.");
		}
	}
	}
}
