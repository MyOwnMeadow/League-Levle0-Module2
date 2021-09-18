//    Copyright (c) The League of Amazing Programmers 2013-2020
//    Level 0

package _02_methods._1_animal_farm;

import java.io.File;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class AnimalFarm {
	
	/***********  SOUND ***************
	 * Some computers are unable to play sounds. 
	 * If you cannot play sound on this computer, set canPlaySounds to false.
	 * If you are not sure, ask your teacher 
	 * *****************/
	boolean canPlaySounds = true;

	
	public static void main(String[] args) {
		new AnimalFarm().animals();
	}
	
	void animals() {
		String ani = "";
		while(!ani.equalsIgnoreCase("exit")) {
			ani = JOptionPane.showInputDialog(null, "Welcom to the animol sound maker! Plese enter the animol you want to hear. Chose from the list below:\n" + "     Cow\n" + "     Duck\n" + "     Dog\n" + "     Cat\n" + "     Llama (yes, that's how its spelled)\n" + "Enter ''exit'' to stop runing the program.", "Animol Sound Mashing", JOptionPane.INFORMATION_MESSAGE);
			
			if(ani.equalsIgnoreCase("cow")) {
				moo();
			}
			else if(ani.equalsIgnoreCase("duck")) {
				quack();
			}
			else if(ani.equalsIgnoreCase("dog")) {
				woof();
			}
			else if(ani.equalsIgnoreCase("cat")) {
				meow();
			}
			else if(ani.equalsIgnoreCase("llama")) {
				llamaScream();
			}
			else if(ani.equalsIgnoreCase("lama")) {
				JOptionPane.showMessageDialog(null, "I know that may make sence, but lama is actshaly spelled ''llama,'' with 2 ls.\n" + "Please try agin.", "Ms. Llama", JOptionPane.INFORMATION_MESSAGE);
			}
			else if(ani.equalsIgnoreCase("exit")) {
				JOptionPane.showMessageDialog(null, "Thanks for using Animol Soundmaker^tm!\n" + "Hope to see you agin soon!", "Animol Sound Mashing", JOptionPane.INFORMATION_MESSAGE);
			}
			else {
				JOptionPane.showMessageDialog(null, "THE PROGRAM COULD NOT UNDERSTAND WHAT YOU SAID OR DOES NOT HAVE THAT ANIMAL.\n" + "PLEASE TRY AGIN.\n" + "(They have now becom a beter speller then me... grate)", "Roburt / ???", JOptionPane.INFORMATION_MESSAGE);
			}
		}
		
		/* 1. Ask the user which animal they want, then see and hear 
		 *    the animal they chose using one of the methods below.
		*/			 
			
		/* 2. Make it so that the user can keep entering new animals. */

	}

	void moo() {
		playNoise(mooFile);
		showImage(cowIcon);
	}

	void quack() {
		playNoise(quackFile);
		showImage(duckIcon);
	}

	void woof() {
		playNoise(woofFile);
		showImage(dogIcon);
	}
	
	void meow() {
		playNoise(meowFile);
		showImage(catIcon);
	}
	
	void llamaScream() {
		playNoise(llamaFile);
		showImage(llamaIcon);
	}
	


	

	/* Ignore this stuff */
	String path = "src/_02_methods/_1_animal_farm/";
	String quackFile = "quack.wav";
	String mooFile = "moo.wav";
	String woofFile = "woof.wav";
	String meowFile = "meow.wav";
	String llamaFile = "llama.wav";
	ImageIcon llamaIcon;
	ImageIcon catIcon;
	ImageIcon dogIcon;
	ImageIcon duckIcon;
	ImageIcon cowIcon;
	
	private void showImage (ImageIcon icon) {
			JOptionPane.showMessageDialog(null, "", "You chose", 0, icon);
	}
	
	private void playNoise(String soundFile) {
		if (canPlaySounds) {	
			File sound = new File(path+soundFile);
			if (sound.exists()) {
				new Thread(() -> {
				try {
					Clip clip = AudioSystem.getClip();
					clip.open(AudioSystem.getAudioInputStream(sound));
					clip.start();
					Thread.sleep(clip.getMicrosecondLength()/1000);
				}
				catch (Exception e) {
					System.out.println("Could not play this sound");
				}}).start();
	 		}
			else {
				System.out.println("File does not exist");
			}
		}
	}
	public AnimalFarm() {
		try {
			llamaIcon = new ImageIcon(path+"llama.jpg");
			cowIcon = new ImageIcon(path+"cow.jpg");
			dogIcon = new ImageIcon(path+"dog.jpg");
			catIcon = new ImageIcon(path+"cat.jpg");
			duckIcon = new ImageIcon(path+"duck.jpg");

		} catch (Exception e) {
					
		}
	}
}