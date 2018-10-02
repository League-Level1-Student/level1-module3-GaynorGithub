import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	public static void main(String[] args) {
		ChuckleClicker click = new ChuckleClicker();
		click.makeButtons();
	}
	
	 void makeButtons() {
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		panel.add(button1);
		panel.add(button2);
		button1.setText("joke");
		button2.setText("punchline");
		button2.setEnabled(false);
		button1.addActionListener(this);
		button2.addActionListener(this);
		frame.pack();
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource() == button1) {
			JOptionPane.showMessageDialog(null, "What do you call a theiving duck?");
			button2.setEnabled(true);
			button1.setEnabled(false);
		}
		else if(e.getSource() == button2) {
			JOptionPane.showMessageDialog(null, "A robber duck");
		}
	}
	
}
