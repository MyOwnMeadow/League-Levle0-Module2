package _03_string_conversion._3_rollercoaster;

import javax.swing.JOptionPane;

public class RollerCoaster {
	public static void main(String[] args) {
	// 1) Make a main method that includes all the steps below…. 
	String yourHightString = JOptionPane.showInputDialog("PLEASE ENTER YOUR HEIGHT IN INCHES.");
		// 2) Ask the user to enter their height in inches using JOptionPane and set it to the variable heightToRide
	int yourHight = Integer.parseInt(yourHightString);
		// Uncomment the line below...
	System.out.println(yourHight);
	if(yourHight > 48 ) {
		JOptionPane.showMessageDialog(null, "YOU MAY RIDE.");
	}
	else if(yourHight > 42) {
		JOptionPane.showMessageDialog(null, "YOU MAY RIDE, BUT ONLY WITH SOMEONE ELSE.");
	}
	else {
		JOptionPane.showMessageDialog(null, "YOU ARE TO SHORT TO RIDE. GO RIDE THE BABY TRAIN INSTED.");
	}
		// Do you see the heightToRide > 42 underlined red? That is because you are comparing a STRING to an INTEGER.
		
		// 3) Convert heightToRide to heightAsInt using Integer.parseInt();  Hint: int heightAsInt = Integer.parse... 
	
		// 4) If the heightAsInt is greater than or equal to 48 inches tall print:
	    // "Hurray! You are tall enough to ride the coaster alone!" Hint: use JoptionPane
		
		// 5) Else if the heightAsInt is greater than or equal to 42 inches tall print:
		// "You can ride the coaster with someone else!" 
	
		// 6) else print: "You must be at least 42 inches tall to ride the roller coaster pal!"
	}
} 
