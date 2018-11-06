import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class WhackAMole implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	Random rand = new Random();
	int ran;
	int score = 0;
	int misses = 0;
	Date timeStart = new Date();
	
	
	
	public static void main(String[] args) {
		WhackAMole mole = new WhackAMole();
		mole.whacka();
	}
	
	
	void whacka() {
		frame = new JFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Whack a Button for Fame and Glory");
		frame.setSize(300, 320);
		drawButtons();
	}
	
	void drawButtons() {
		panel = new JPanel();
		frame.add(panel);
		ran = rand.nextInt(24);
		
		
		for (int i = 0; i < 24; i++) {
			JButton button = new JButton();
			panel.add(button);
			button.addActionListener(this);
			if (i == ran) {
				button.setText("mole!");
			
			}
		}
		
	}

	void speak(String words) {
	     try {
	          Runtime.getRuntime().exec("say " + words).waitFor();
	     } catch (Exception e) {
	          e.printStackTrace();
	     }
	}
	
	private void endGame(Date timeAtStart, int molesWhacked) {
	     Date timeAtEnd = new Date();
	     JOptionPane.showMessageDialog(null, "Your whack rate is "
	          + ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked)
	          + " moles per second.");
	}
	
	private void playSound(String fileName) {
	     AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
	     sound.play();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton button = (JButton)e.getSource();
		if(button.getText().equals("mole!")) {
			playSound("ding 1.wav");
			speak("Great job!");
			score++;
		}
		else {
			misses++;
			if(misses == 1) {
				speak("Uh oh, you missed! Try again!");
			}
			if(misses == 2) {
				speak("You missed again? How? Just keep trying.");
			}
			if(misses == 3) {
				speak("This game isn't very difficult, so even 3 times is a lot of missed moles!");
			}
			if(misses == 4) {
				speak("This is getting ridiculous, how are you so bad at this game!");
			}
			if(misses == 5) {
				speak("Congratulations, you missed so many times that this program will now self destruct!");
				speak("5, 4, 3, 2, 1, Self Destruct");
				System.exit(0);
			}
		}
		if(score == 10) {
			endGame(timeStart, 10);
			System.exit(0);
		}
		frame.dispose();
		whacka();
	}
	
	
}
