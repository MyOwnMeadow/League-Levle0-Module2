package _03_string_conversion._4_voting_booth;

import javax.swing.JOptionPane;

public class Voting_booth {
	public static void main(String[] args) {
		String sAge = JOptionPane.showInputDialog("PLEASE ENTER YOUR AGE.");
		int ageNum = Integer.parseInt(sAge);
		System.out.println(sAge + "/n" + ageNum);
		
		if(ageNum >= 18) {
			JOptionPane.showMessageDialog(null, "WHO WOULD YOU LIKE TO VOTE FOR?");
		}
		else {
			JOptionPane.showMessageDialog(null, "YOU ARE NOT OLD ENOUGH  YET TO VOTE. PLEASE COME BACK IN " + (18-ageNum) + " YEARS.");
		}
	}
}
