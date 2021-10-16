package _03_string_conversion._1_intro;

import javax.swing.JOptionPane;

public class String_to_Intager {
	public static void main(String[] args) {
		String quant = JOptionPane.showInputDialog("PLEASE ENTER A NUMBER OF YOUR CHOICE.");
		int num = Integer.parseInt(quant);
		System.out.println(num);
		
		JOptionPane.showMessageDialog(null, "Ok, here is all of the garlic bread you ordored.");
		
		int t = 0;
		while(t<num) {
			JOptionPane.showMessageDialog(null, (t+1) + " bread...");
			t += 1;
		}
		
		JOptionPane.showMessageDialog(null, "Ok. Thanks for comming to Garlic Bakery! Hope you enjoy your bread.");
	}
}