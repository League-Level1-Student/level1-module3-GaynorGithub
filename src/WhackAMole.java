import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class WhackAMole {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	Random rand = new Random();
	int ran;
	
	
	
	
	public static void main(String[] args) {
		WhackAMole mole = new WhackAMole();
		mole.whacka();
	}
	
	
	void whacka() {
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		drawButtons(rand);
	}
	
	void drawButtons(Random rand) {
		frame.setSize(300, 320);
		frame.setTitle("Whack a Button for Fame and Glory");
		ran = rand.nextInt(24);
		
		
		for (int i = 0; i < 24; i++) {
			JButton button = new JButton();
			panel.add(button);
			
			if (i == ran) {
				button.setText("mole!");
			}
		}
	}
	
	
}
