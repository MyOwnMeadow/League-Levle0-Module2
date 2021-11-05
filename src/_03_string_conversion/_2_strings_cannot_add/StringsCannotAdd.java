package _03_string_conversion._2_strings_cannot_add;

import javax.swing.JOptionPane;

public class StringsCannotAdd {
	public static void main(String[] args) {
		// 1) Make a main method that includes all the steps below…. 
		String quant1 = JOptionPane.showInputDialog("PLEASE ENTER THE NUMBERS YOU WOULD LIKE TO ADD.\n"
				+ " (Please do so 1 at a time. The system also onley accsepts numbers)");
		String quant2 = JOptionPane.showInputDialog("NEXT NUMBER:");
		String quant3 = JOptionPane.showInputDialog("[This last number is optionol. If you don't want it, then just enter 0]");
		
		int num1 = Integer.parseInt(quant1);
		int num2 = Integer.parseInt(quant2);
		int num3 = Integer.parseInt(quant3);
		
		JOptionPane.showMessageDialog(null, "PROSSESING...");
		JOptionPane.showMessageDialog(null, "PROSSESING COMPLEAT.\n"
				+ "ANCER: " + (num1+num2+num3));
		System.out.println(quant1 + "+" + quant2 + "+" + quant3 + "=" + (num1+num2+num3));
			// 2) Ask the user to enter number 4 and hold it in the variable fourAsString 
			
			// 3) Ask the user to enter number 6 and hold it in the variable sixAsString 
			
			// 4) Print the addition of fourAsString and sixAsString using JOptionPane 
			
			// Did you notice 46 instead of 4 + 6 = 10?
			
			// 5) Ask the user to enter number 5 and hold it in the variable fiveAsString 
			
			// 6) Print the addition of the variables fourAsString, sixAsString, and fiveAsString 
			
			//Did you notice 456 instead of 4 + 6 + 5 = 15?
			
			// Insert fourAsString inside the parenthesis of Integer.parseInt() and set the method equal to fourAsInt
			// Hint: int fourAsInt = Integer.parseInt(fourAsString);
			
			// 7) Do the same for sixAsString. 
			
			// 8) Print the addition of fourAsInt and sixAsInt using JOptionPane 
			
			// Did you notice the value 10? If so, hurray! You just changed the type of your variable from String to int.
			
			// 9) Convert fiveAsString to fiveAsInt using Integer.parseInt();  
			
			// 10) Print the addition of fourAsInt, sixAsInt, and fiveAsInt using JOptionPane 
			
			// Is your value now 15 instead of 465?
	}
}
