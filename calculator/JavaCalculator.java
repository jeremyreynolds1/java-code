/*
	created by Jeremy Reynolds
	
	going to implement 2 action listeners, one for numbers and one for operations instead of having one generic actionListener
*/

import javax.swing.*;
import javax.swing.JOptionPane;
import java.awt.*;
import java.awt.event.*;

public class JavaCalculator{
	public static void main(String[] args) {
		Calculator main = new Calculator();
	}
}

class Calculator extends JPanel{
	double current, next;
	JButton period, zero, one, two, three, four, five, six, seven, eight, nine, divide, multiply, subtract, add, equals;
	JTextField display;
	boolean startNumber = true;
	
	public Calculator(){
		//create Calculator gui here.
				//Border layout for textarea, number panel, and operations panel (x, +, -, /)
				//Gridlayout for numberpanel, and add onto frame border layout.
				//Gridlayout, inside of a BorderLayout
						
				//create frame
				JFrame frame = new JFrame("Calculator");
						
				//create BorderLayout and apply to frame
				frame.setLayout(new BorderLayout());
				
				//set Dimensions of frame
				//width, height
				frame.setPreferredSize(new Dimension(325, 500));
				//set default closing operation	
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				//create TextArea for display
				display = new JTextField("0", 40);
				//add TextArea to BorderLayout North
				frame.add(display, BorderLayout.NORTH);
				//make display not editable
				//display.setEditable(false);
				
				//create new panel to hold the buttons.
				JPanel buttons = new JPanel();
				//create GridLayout(num of rows, num of columns)
				//4 rows 3 columns
				GridLayout buttonLayout = new GridLayout(4, 3);
				//set layout to a new GridLayout
				buttons.setLayout(buttonLayout);
				
				//create JButtons for number panel
				//numbers 0 - 9, and .
				period = new JButton(".");
				zero = new JButton("0");
				one = new JButton("1");
				two = new JButton("2");
				three = new JButton("3");
				four = new JButton("4");
				five = new JButton("5");
				six = new JButton("6");
				seven = new JButton("7");
				eight = new JButton("8");
				nine = new JButton("9");
				divide = new JButton("/");
				multiply = new JButton("X");
				subtract = new JButton("-");
				add = new JButton("+");
				equals = new JButton("=");
				
				//create 2 action listener classes. One for Numbers and one for operations
				
				ActionListener nums = new numListener();
				
				ActionListener ops = new opListener();
				
				//add action listeners
				period.addActionListener(nums);
				zero.addActionListener(nums);
				one.addActionListener(nums);
				two.addActionListener(nums);
				three.addActionListener(nums);
				four.addActionListener(nums);
				five.addActionListener(nums);
				six.addActionListener(nums);
				seven.addActionListener(nums);
				eight.addActionListener(nums);
				nine.addActionListener(nums);
				

				divide.addActionListener(ops);
				multiply.addActionListener(ops);
				subtract.addActionListener(ops);
				add.addActionListener(ops);
				equals.addActionListener(ops);
				
				//add JButtons to gridlayout starting with 0
				buttons.add(seven);
				buttons.add(eight);
				buttons.add(nine);
				buttons.add(four);
				buttons.add(five);
				buttons.add(six);
				buttons.add(one);
				buttons.add(two);
				buttons.add(three);
				buttons.add(zero);
				buttons.add(period);
				
				
				//add panel which is a borderLayout
				frame.add(buttons, BorderLayout.WEST);
				
				//create second panel to hold operators
				
				JPanel operators = new JPanel();
				
				//create second grid layout(num of rows, num of columns)
				operators.setLayout(new GridLayout(5, 1));
				
				//create JButtons for operations panel
				//add JButtons to GridLayout
				
				operators.add(divide);
				operators.add(multiply);
				operators.add(subtract);
				operators.add(add);
				operators.add(equals);
				
				//add panel to BorderLayout. East
				
				frame.add(operators, BorderLayout.EAST);
				
						
				//pack everything together and show frame.
				frame.pack();
				frame.setVisible(true);
	}
	class numListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
				//use e.getActionCommand() to get text from button
				String digit = e.getActionCommand();
				
				if (startNumber) {
					display.setText(digit);
					//System.out.print(digit);
					startNumber = false;
				}else {
					display.setText(display.getText() + digit);
				}
			}

	}
	class opListener implements ActionListener{
			public void actionPerformed(ActionEvent e){
					//call logic class here; OR do calculations here?
				}

		}

}