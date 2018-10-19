//    Copyright (c) The League of Amazing Programmers 2013-2018
//    Level 0

import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {

	// 1. Make a main method that includes all the steps below….
	public static void main(String[] args) {
		int rand = new Random().nextInt(4);
		System.out.println(rand);
		if(rand == 0) {
			JOptionPane.showMessageDialog(null, "The spirits point to yes");
		}
		if(rand == 1) {
			JOptionPane.showMessageDialog(null, "The crystal ball says decidedly no");
		}
		if(rand == 2) {
			JOptionPane.showMessageDialog(null, "The fog is unclear. Maybe ask Alexa?");
		}
		if(rand == 3) {
			JOptionPane.showMessageDialog(null, "The lights tell me it is possible but unlikely");
		}
	}
	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"

	// 3. Print out this variable

	// 4. Get the user to enter a question for the 8 ball

	// 5. If the random number is 0

	// -- tell the user "Yes"

	// 6. If the random number is 1

	// -- tell the user "No"

	// 7. If the random number is 2

	// -- tell the user "Maybe you should ask Google?"

	// 8. If the random number is 3

	// -- write your own answer

}