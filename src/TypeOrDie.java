import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class TypeOrDie implements KeyListener {
	
	JFrame frame = new JFrame();
	char currentLetter;
	JLabel label = new JLabel();
	
	public static void main(String[] args) {
		TypeOrDie type = new TypeOrDie();
		type.window();
	}
	
	void window() {
		currentLetter = generateRandomLetter();
		frame.setTitle("Type or Die");
		frame.add(label);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		label.setText(String.valueOf(currentLetter));
		label.setFont(label.getFont().deriveFont(28.0f));
		label.setHorizontalAlignment(JLabel.CENTER);
		label.addKeyListener(this);
		frame.pack();

	}
	
	char generateRandomLetter() {
	      Random r = new Random();
	      return (char) (r.nextInt(26) + 'a');
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		currentLetter = generateRandomLetter();
		label.repaint();
	}
	
	
	
}
