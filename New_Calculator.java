package Calculator;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;

import javax.swing.*;

public class New_Calculator implements ActionListener{
	private static GridBagConstraints gbc;
	protected static JButton button;
	public static JTextField field;
	private static JFrame frame;
	private static JPanel panel;
	
	private String opFinder;
	String lLet;
	String word;
	
	public static void main(String[] args) {
		New_Calculator calc = new New_Calculator();
	}
	
	//Super constructor calling the setFrame method
	public New_Calculator() {
		setFrame(frame);
		
	}
	
	//sets the JPanel for the JFrame
	private JPanel setPanel() {
		panel = new JPanel(new GridBagLayout());
		setButtons(panel);
		
		return panel;
	}
	
	//Sets the frame parameters and call setPanel
	private void setFrame(JFrame frame) {
		frame = new JFrame("Calculator");
		frame.setSize(260,380);
		frame.setResizable(false);
		frame.add(setPanel());
		frame.setVisible(true);
		frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
	}
	
	//sets the buttons, text field, and format of the JPanel using GridBagLayout
	private void setButtons(JPanel panel) {
		gbc = new GridBagConstraints();	
		//Text Field 
		
		field = new JTextField(10);
		field.setHorizontalAlignment(SwingConstants.RIGHT);
		Font tnr = new Font("TimesRoman", Font.PLAIN, 25);
		field.setFont(tnr);
		
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.ipadx = 30;
		gbc.ipady = 30;
		gbc.insets = new Insets(9,2,10,1);
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.gridwidth = 4;
		panel.add(field, gbc);
		
		//Button General Layout
		gbc = new GridBagConstraints();
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.ipadx = 15;
		gbc.ipady = 20;
		gbc.insets = new Insets(2,2,2,1);
		
		//First Row
		
		button = new JButton("C");
		button.addActionListener(this);
		button.setPreferredSize(new Dimension(60,60));
		gbc.gridx = 0;
		gbc.gridy = 1;
		button.setBackground(Color.LIGHT_GRAY);
		panel.add(button, gbc);
		
		button = new JButton("<");
		button.addActionListener(this);
		button.setPreferredSize(new Dimension(60,60));
		gbc.gridx = 1;
		gbc.gridy = 1;
		button.setBackground(Color.LIGHT_GRAY);
		panel.add(button, gbc);
		
		button = new JButton("%");
		button.addActionListener(this);
		button.setPreferredSize(new Dimension(60,60));
		gbc.gridx = 2;
		gbc.gridy = 1;
		button.setBackground(Color.LIGHT_GRAY);
		panel.add(button, gbc);
		
		button = new JButton("÷");
		button.addActionListener(this);
		button.setPreferredSize(new Dimension(60,60));
		gbc.gridx = 3;
		gbc.gridy = 1;
		button.setBackground(Color.LIGHT_GRAY);
		panel.add(button, gbc);
		
		//Second Row
		
		button = new JButton("7");
		button.addActionListener(this);
		button.setPreferredSize(new Dimension(60,60));
		gbc.gridx = 0;
		gbc.gridy = 2;
		panel.add(button, gbc);
		
		button = new JButton("8");
		button.addActionListener(this);
		button.setPreferredSize(new Dimension(60,60));
		gbc.gridx = 1;
		gbc.gridy = 2;
		panel.add(button, gbc);
		
		button = new JButton("9");
		button.addActionListener(this);
		button.setPreferredSize(new Dimension(60,60));
		gbc.gridx = 2;
		gbc.gridy = 2;
		panel.add(button, gbc);
		
		button = new JButton("X");
		button.addActionListener(this);
		button.setPreferredSize(new Dimension(60,60));
		gbc.gridx = 3;
		gbc.gridy = 2;
		button.setBackground(Color.LIGHT_GRAY);
		panel.add(button, gbc);
		
		//Third Row
		
		button = new JButton("4");
		button.addActionListener(this);
		button.setPreferredSize(new Dimension(60,60));
		gbc.gridx = 0;
		gbc.gridy = 3;
		panel.add(button, gbc);
		
		button = new JButton("5");
		button.addActionListener(this);
		button.setPreferredSize(new Dimension(60,60));
		gbc.gridx = 1;
		gbc.gridy = 3;
		panel.add(button, gbc);
		
		button = new JButton("6");
		button.addActionListener(this);
		button.setPreferredSize(new Dimension(60,60));
		gbc.gridx = 2;
		gbc.gridy = 3;
		panel.add(button, gbc);
		
		button = new JButton("-");
		button.addActionListener(this);
		button.setPreferredSize(new Dimension(60,60));
		gbc.gridx = 3;
		gbc.gridy = 3;
		button.setBackground(Color.LIGHT_GRAY);
		panel.add(button, gbc);
		
		//Fourth Row
		
		button = new JButton("1");
		button.addActionListener(this);
		button.setPreferredSize(new Dimension(60,60));
		gbc.gridx = 0;
		gbc.gridy = 4;
		panel.add(button, gbc);
		
		button = new JButton("2");
		button.addActionListener(this);
		button.setPreferredSize(new Dimension(60,60));
		gbc.gridx = 1;
		gbc.gridy = 4;
		panel.add(button, gbc);
		
		button = new JButton("3");
		button.addActionListener(this);
		button.setPreferredSize(new Dimension(60,60));
		gbc.gridx = 2;
		gbc.gridy = 4;
		panel.add(button, gbc);
		
		button = new JButton("+");
		button.addActionListener(this);
		button.setPreferredSize(new Dimension(60,60));
		gbc.gridx = 3;
		gbc.gridy = 4;
		button.setBackground(Color.LIGHT_GRAY);
		panel.add(button, gbc);
		
		//Fifth Row
		
		button = new JButton("±");
		button.addActionListener(this);
		button.setPreferredSize(new Dimension(60,60));
		gbc.gridx = 0;
		gbc.gridy = 5;
		panel.add(button, gbc);
		
		button = new JButton("0");
		button.addActionListener(this);
		button.setPreferredSize(new Dimension(60,60));
		gbc.gridx = 1;
		gbc.gridy = 5;
		panel.add(button, gbc);
		
		button = new JButton(".");
		button.addActionListener(this);
		button.setPreferredSize(new Dimension(60,60));
		gbc.gridx = 2;
		gbc.gridy = 5;
		panel.add(button, gbc);
		
		button = new JButton("=");
		button.addActionListener(this);
		button.setPreferredSize(new Dimension(60,60));
		gbc.gridx = 3;
		gbc.gridy = 5;
		button.setBackground(Color.ORANGE);
		panel.add(button, gbc);
		
	}
	
	// Defines actions for keys pressed by user
	@Override
	public void actionPerformed(ActionEvent e) {
		word = field.getText();
		lLet = lLet();
		double number1 = 0.0;
		double number2 = 0.0;
		String result = "";
		String opFinder = opFinder(word);
		String buttonText = "";
		int opIndex;
		
		//converts object key text into usable string for logic
		Object o = e.getSource();
		JButton b = null;
		String text = "";
		
		if (o instanceof JButton) {
			b = (JButton) o;
		}
		
		if (b != null) {
			text = b.getText();
		}
		
		// Row one of button handlers {Clear, back, percent, division}
		
		if (text == "C") {
			buttonText = "";
			number1 = 0.0;
			field.setText(buttonText);
		}
		else if (text == "<") {
			if (!word.contentEquals("")) {
				buttonText = word.substring(0, word.length() - 1);
				field.setText(buttonText);
			}
			else {
				
			}
		}
		else if (text == "%") {
			if (word.length() > 0 && !lLet.contentEquals(".") && !lLet.contentEquals("%") && opFinder.contentEquals("")) {
				buttonText = word + "%";
				field.setText(buttonText);
			}
			else {
				
			}
		}
		else if (text == "÷") {
			if (word.length() > 0 && !lLet.contentEquals(".") && opFinder(word.substring(1)).contentEquals("")) {
				buttonText = word + "÷";
				field.setText(buttonText);
			}
			else {
				
			}	
		}
		
		// Row two of button handlers {7, 8, 9, multiply}
		
		else if (text == "7" && !word.contains("%")) {
			buttonText = word + "7";
			field.setText(buttonText);
			
		}
		else if (text == "8" && !word.contains("%")) {
			buttonText = word + "8";
			field.setText(buttonText);
		}
		else if (text == "9" && !word.contains("%")) {
			buttonText = word + "9";
			field.setText(buttonText);
		}
		else if (text == "X") {
			if (word.length() > 0 && !lLet.contentEquals(".") && opFinder(word.substring(1)).contentEquals("")) {
				buttonText = word + "x";
				field.setText(buttonText);
			}
			else {
				
			}		
		}
		
		// Row three of button handlers {4, 5, 6, minus}
		
		else if (text == "4" && !word.contains("%")) {
			buttonText = word + "4";
			field.setText(buttonText);
		}
		else if (text == "5" && !word.contains("%")) {
			buttonText = word + "5";
			field.setText(buttonText);
		}
		else if (text == "6" && !word.contains("%")) {
			buttonText = word + "6";
			field.setText(buttonText);
		}
		else if (text == "-") {
			if (word.length() == 0) {
				buttonText = "";
				field.setText(buttonText);
			}
			else if (word.length() == 1 && word.substring(0,1).contentEquals("-")) {
				buttonText = word;
				field.setText(buttonText);
			}
			else if (word.length() > 0 && !opFinder(word.substring(1)).contentEquals("")) {
				buttonText = word;
				field.setText(buttonText);
			}
			else if (word.length() > 0 && opFinder(word).contentEquals("")) {
				buttonText = word + "-";
				field.setText(buttonText);
			}
			else if (word.length() > 0 && opFinder(word.substring(1)).contentEquals("")) {
				buttonText = word + "-";
				field.setText(buttonText);
			}
		}
		
		// Row four of button handlers {1, 2, 3, plus}
		
		else if (text == "1" && !word.contains("%")) {
			buttonText = word + "1";
			field.setText(buttonText);
		}
		else if (text == "2" && !word.contains("%")) {
			buttonText = word + "2";
			field.setText(buttonText);
		}
		else if (text == "3" && !word.contains("%")) {
			buttonText = word + "3";
			field.setText(buttonText);
		}
		else if (text == "+") {
			if (word.length() > 0 && !lLet.contentEquals(".") && opFinder(word.substring(1)).contentEquals("")) {
				buttonText = word + "+";
				field.setText(buttonText);
			}
			else {
				
			}	
		}
		
		// Row five of button handlers {plus/minus, 0, decimal, equals}
		
		//Sets the cases for placing or deleting the minus sign for negative and positive numbers
		else if (text == "±") {
			
			if (word.contentEquals("")) {
				buttonText = "-";
				field.setText("-");
			}
			else if (word.contentEquals("-")) {
				buttonText = "";
				field.setText(buttonText);
			}
			else if (word.length() > 0 && !word.substring(0,1).contentEquals("-")
					&& opFinder(word).contentEquals("")) {
				
				buttonText = "-" + word;
				field.setText(buttonText);
			}
			else if (word.length() > 0 && word.substring(0,1).contentEquals("-")
					&& opFinder(word.substring(1)).contentEquals("")) {
				
				buttonText = word.substring(1);
				field.setText(buttonText);
			}
			else if (word.length() > 0 && opFinder(word.substring(1)).contentEquals("-")
					&& !word.contains("x") && !word.contains("÷")) {
				
				opIndex = word.substring(1).indexOf(opFinder(word)) + 1 ;
				word = word.substring(0, opIndex) + "+" + word.substring(opIndex + 1, word.length());
				buttonText = word;
				field.setText(buttonText);
			}
			else if (word.length() > 0 && opFinder(word.substring(1)).contentEquals("+")
					&& !word.contains("x") && !word.contains("÷")) {
				
				opIndex = word.substring(1).indexOf(opFinder(word)) + 1 ;
				word = word.substring(0, opIndex) + "-" + word.substring(opIndex + 1, word.length());
				buttonText = word;
				field.setText(buttonText);
			}
			else if (word.length() > 0 && !opFinder(word.substring(1)).contentEquals("+") 
					&& !opFinder(word.substring(1)).contentEquals("-") &&
					!opFinder(word.substring(1)).contentEquals("")) {
	
				opIndex = word.substring(1).indexOf(opFinder(word.substring(1))) + 1 ;
				word = word.substring(0, opIndex + 1) + "-" + word.substring(opIndex + 1, word.length());
				buttonText = word;
				field.setText(buttonText);
			}
			else if (word.length() > 0 && !opFinder(word.substring(1)).contentEquals("+") 
					&& !opFinder(word.substring(1)).contentEquals("")
					&& word.substring(0,1).contentEquals("-")) {
				
				opIndex = word.substring(1).indexOf("-") + 1 ;
				word = word.substring(0, opIndex) + word.substring(opIndex + 1, word.length());
				buttonText = word;
				field.setText(buttonText);
			}
			
		}
		
		else if (text == "0" && !word.contains("%")) {
			buttonText = word + "0";
			field.setText(buttonText);
		}
		
		// sets the cases for determining when the decimal place can and can not be added
		else if (text == ".") {
			String dNum2;
			
			if (word.contentEquals("")) {
				buttonText = word + ".";
				field.setText(buttonText);
			}
			else if (word.length() > 0 && opFinder.contentEquals("") && !lLet.contentEquals(".")) {
				
				if (!word.contains(".")) {
					buttonText = word + ".";
					field.setText(buttonText);
				}
				else {
					
				}
			}
			else if (word.length() > 0 && !opFinder.contentEquals("") && lLet.contentEquals("")) {
				dNum2 = word.substring(word.indexOf(opFinder) + 1, word.length());
				
				if (!dNum2.contains(".")) {
					buttonText = word + ".";
					field.setText(buttonText);
				}
				else {
					
				}
			}
			else if (word.length() > 0 && !opFinder.contentEquals("") && !lLet.contentEquals(".") && !lLet.contentEquals("%")) {
				
				buttonText = word + ".";
				field.setText(buttonText);

			}
		}
		
		// handles the logic for computing values entered by the user
		else if (text == "=") {
			
			if (word.contains("x") && lLet.contentEquals("")) {
				
				opIndex = word.indexOf("x");
				
				number1 = Double.parseDouble(word.substring(0, opIndex));
				number2 = Double.parseDouble(word.substring(opIndex + 1, word.length()));
				result = Double.toString(number1 * number2);
				
				if (!result.substring(result.length() - 2, result.length()).equals(".0")) {
					result = String.format("%.2f", number1 * number2);
					field.setText(result);
				}
				else {
					int num2 = (int) (number1 * number2);
					buttonText = Integer.toString(num2);
					field.setText(buttonText);
				}
			}
			else if (word.contains("-") && !word.substring(0,1).contentEquals("-") && lLet.contentEquals("")) {
				
				if (word.substring(0,1).contentEquals("-")) {
					opIndex = word.indexOf(opFinder(word.substring(1)));
				}
				else {
					opIndex = word.indexOf(opFinder(word));
				}
				
				number1 = Double.parseDouble(word.substring(0, opIndex));
				number2 = Double.parseDouble(word.substring(opIndex + 1, word.length()));
				result = Double.toString(number1 - number2);
				
				if (!result.substring(result.length() - 2, result.length()).equals(".0")) {
					result = String.format("%.2f", number1 - number2);
					field.setText(result);
				}
				else {
					int num2 = (int) (number1 - number2);
					buttonText = Integer.toString(num2);
					field.setText(buttonText);
				}
			}
			else if (word.contains("+") && lLet.contentEquals("")) {
				
				if (word.substring(0,1).contentEquals("-")) {
					opIndex = word.indexOf(opFinder(word.substring(1)));
				}
				else {
					opIndex = word.indexOf(opFinder(word));
				}
				
				number1 = Double.parseDouble(word.substring(0, opIndex));
				number2 = Double.parseDouble(word.substring(opIndex + 1, word.length()));
				result = Double.toString(number1 + number2);
				
				if (!result.substring(result.length() - 2, result.length()).equals(".0")) {
					result = String.format("%.2f", number1 + number2);
					field.setText(result);
				}
				else {
					int num2 = (int) (number1 + number2);
					buttonText = Integer.toString(num2);
					field.setText(buttonText);
				}

			}
			else if (word.contains("÷") && lLet.contentEquals("") && !word.substring(word.length() - 2, word.length()).contentEquals("÷0")) {
				
				opIndex = word.indexOf("÷");
				
				number1 = Double.parseDouble(word.substring(0, opIndex));
				number2 = Double.parseDouble(word.substring(opIndex + 1, word.length()));
				result = Double.toString(number1 / number2);
				
				if (!result.substring(result.length() - 2, result.length()).equals(".0")) {
					result = String.format("%.4f", number1 / number2);
					result = strParser(result);
					field.setText(result);
				}
				else {
					int num2 = (int) (number1 / number2);
					buttonText = Integer.toString(num2);
					field.setText(buttonText);
				}

			}
			else if (word.contains("%") && (opFinder.contentEquals("") || opFinder.contentEquals("%"))) {
				
				number1 = Double.parseDouble(word.substring(0, word.length() - 1));
				result = Double.toString(number1);
				
				if (!result.substring(result.length() - 2, result.length()).equals(".0000")) {
					result = String.format("%.5f", number1 / 100);
					result = strParser(result);
					field.setText(result);
				}
				else {
					int num1 = (int) (number1 / 100);
					buttonText = Integer.toString(num1);
					field.setText(buttonText);
				}
			}
		}
	}
	
	//finds the operator in the text field and returns it as a string
	public String opFinder(String word) {
		String words = word;
		opFinder = "";
		
		for (int i = 0; i < field.getText().length(); i++) {
			if (words.contains("+")) {
				opFinder = "+";
			}
			else if (words.contains("-")) {
				opFinder = "-";
			}
			else if (words.contains("x")) {
				opFinder = "x";
			}
			
			else if (words.contains("÷")) {
				opFinder = "÷";
			}
			else if (words.contains("%")) {
				opFinder = "%";
			}
		}
		
		return opFinder;
	}
	
	//finds the last letter of text field and stores it in a string then returns it if true
	public String lLet() {
		word = field.getText();
		lLet = "";
		
		for (int i = 0; i < word.length(); i++) {
			if (word.length() > 1 && word.substring(word.length() -1, word.length()).equals("+")) {
				lLet = "+";
			}
			else if (word.length() > 1 && word.substring(word.length() -1, word.length()).equals("-")) {
				lLet = "-";
			}
			else if (word.length() > 1 && word.substring(word.length() -1, word.length()).equals("x")) {
				lLet = "x";
			}
			else if (word.length() > 1 && word.substring(word.length() -1, word.length()).equals("÷")) {
				lLet = "÷";
			}
			else if (word.length() > 1 && word.substring(word.length() -1, word.length()).equals(".")) {
				lLet = ".";
			}
			else if (word.length() > 1 && word.substring(word.length() -1, word.length()).equals("%")) {
				lLet = "%";
			}
		}
		
		return lLet;
	}
	
	//searches the string backwards to forwards and cuts the extra zeroes for decimal values
	public String strParser(String result) {
		int cutIndex = 0;

		for (int i = result.length() - 1; i > 0; i--) {
			if (result.charAt(i) != '.' && result.charAt(i) != '0') {
				cutIndex = i;
				result = result.substring(0, cutIndex + 1);
				break;
			}
		}
		return result;
	}
}
