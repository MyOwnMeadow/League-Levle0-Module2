package _01_random._6_lottery_numbers;

import java.util.Random;
import javax.swing.JOptionPane;

public class lottery {
	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("What lotory would you like to enter?");
		
		Random ran = new Random();
		
		JOptionPane.showMessageDialog(null, "Ok. Here is your lottory tickit. Have a nice day!", "Cashier", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, ran.nextInt(21) +"  "+ ran.nextInt(21) +"  "+ ran.nextInt(21) +"  "+ ran.nextInt(21) +"  "+ ran.nextInt(21) +"  "+ (ran.nextInt(21)+1), input, JOptionPane.INFORMATION_MESSAGE);
	}
}
