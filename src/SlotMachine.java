import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class SlotMachine implements ActionListener {
	JFrame frame;
	JPanel panel;
	JButton spin = new JButton();
	JLabel slot1; 
	JLabel slot2; 
	JLabel slot3;
	String cherry = "Cherry.jpg";
	String orange = "Orange.jpg";
	String lime = "Lime.png";
	Random rand = new Random();
	int luck;
	int num1;
	int num2;
	int num3;
	
	public static void main(String[] args) throws MalformedURLException {
		SlotMachine slot = new SlotMachine();
		slot.spinSlots();
	}
	
	void spinSlots() throws MalformedURLException {
		frame = new JFrame();
		panel = new JPanel();
		spin.addActionListener(this);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Take a chance, and take a spin!");
		frame.add(panel);
		
		
		luck = rand.nextInt(3);
		num1 = luck;
		if(luck == 0) {
			slot1 = createLabelImage(cherry);
		}
		else if(luck == 1) {
			slot1 = createLabelImage(orange);
		}
		else if(luck == 2) {
			slot1 = createLabelImage(lime);
		}
		
		luck = rand.nextInt(3);
		num2 = luck;
		if(luck == 0) {
			slot2 = createLabelImage(cherry);
		}
		else if(luck == 1) {
			slot2 = createLabelImage(orange);
		}
		else if(luck == 2) {
			slot2 = createLabelImage(lime);
		}
		
		luck = rand.nextInt(3);
		num3 = luck;
		if(luck == 0) {
			slot3 = createLabelImage(cherry);
		}
		else if(luck == 1) {
			slot3 = createLabelImage(orange);
		}
		else if(luck == 2) {
			slot3 = createLabelImage(lime);
		}
		
		panel.add(slot1);
		panel.add(slot2);
		panel.add(slot3);
		spin.setText("Spin Again!");
		panel.add(spin);
		
		frame.pack();
		if(num1 == num2 && num2 == num3) {
			JOptionPane.showMessageDialog(null, "Congratulations, you win!");
			System.exit(0);
		}
		
		
		
		
	}
	
	private JLabel createLabelImage(String fileName)
			throws MalformedURLException
	{
		URL imageURL = getClass().getResource(fileName);
		if (imageURL == null)
		{
			System.err.println("Could not find image " + fileName);
			return new JLabel();
		}
		Icon icon = new ImageIcon(imageURL);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		frame.dispose();
		try {
			spinSlots();
		} catch (MalformedURLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	
}
