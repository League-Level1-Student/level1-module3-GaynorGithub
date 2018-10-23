import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;

public class CalculatorRunner implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton add = new JButton();
	JButton subtract = new JButton();
	JButton multiply = new JButton();
	JButton divide = new JButton();
	JTextField text1 = new JTextField(10);
	JTextField text2 = new JTextField(10);
	JLabel label = new JLabel();
	Calculator calc = new Calculator();
	String answer;
	int numOne;
	int numTwo;
	
	
	public static void main(String[] args) {
		CalculatorRunner calcu = new CalculatorRunner();
		calcu.runner();
	}
	
	void runner() {
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		panel.add(text1);
		panel.add(text2);
		panel.add(add);
		panel.add(subtract);
		panel.add(multiply);
		panel.add(divide);
		panel.add(label);
		add.setText("add");
		subtract.setText("sub");
		multiply.setText("mul");
		divide.setText("div");
		frame.setSize(320, 200);
		add.addActionListener(this);
		subtract.addActionListener(this);
		multiply.addActionListener(this);
		divide.addActionListener(this);
		label.setFont(new Font("Arial", Font.PLAIN, 50));
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		numOne = Integer.parseInt(text1.getText());
		numTwo = Integer.parseInt(text2.getText());
		if(e.getSource().equals(add)) {
			answer = String.valueOf(calc.add(numOne, numTwo));
		}
		else if(e.getSource().equals(subtract)) {
			answer = String.valueOf(calc.subtract(numOne, numTwo));
		}
		else if(e.getSource().equals(multiply)) {
			answer = String.valueOf(calc.multiply(numOne, numTwo));
		}
		else if(e.getSource().equals(divide)) {
			answer = String.valueOf(calc.divide(numOne, numTwo));
		}
		label.setText(answer);
		
	}
	
	
}
