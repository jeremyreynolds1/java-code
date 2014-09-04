/*
	created by Jeremy Reynolds
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
class Calculator extends JPanel implements ActionListener{
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
				JTextField display = new JTextField("0", 40);
				//add TextArea to BorderLayout North
				frame.add(display, BorderLayout.NORTH);
				//make display not editable
				display.setEditable(false);
				
				//create new panel to hold the buttons.
				JPanel buttons = new JPanel();
				//create GridLayout(num of rows, num of columns)
				//4 rows 3 columns
				GridLayout buttonLayout = new GridLayout(4, 3);
				//set layout to a new GridLayout
				buttons.setLayout(buttonLayout);
				
				//create JButtons for number panel
				//numbers 0 - 9, and .
				JButton period = new JButton(".");
				JButton zero = new JButton("0");
				JButton one = new JButton("1");
				JButton two = new JButton("2");
				JButton three = new JButton("3");
				JButton four = new JButton("4");
				JButton five = new JButton("5");
				JButton six = new JButton("6");
				JButton seven = new JButton("7");
				JButton eight = new JButton("8");
				JButton nine = new JButton("9");
				JButton divide = new JButton("/");
				JButton multiply = new JButton("X");
				JButton subtract = new JButton("-");
				JButton add = new JButton("+");
				JButton equals = new JButton("=");
				
				//add action listeners
				period.addActionListener(this);
				zero.addActionListener(this);
				one.addActionListener(this);
				two.addActionListener(this);
				three.addActionListener(this);
				four.addActionListener(this);
				five.addActionListener(this);
				six.addActionListener(this);
				seven.addActionListener(this);
				eight.addActionListener(this);
				nine.addActionListener(this);
				divide.addActionListener(this);
				multiply.addActionListener(this);
				subtract.addActionListener(this);
				add.addActionListener(this);
				equals.addActionListener(this);
				
				
				
						
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
	
	public void actionPerformed(ActionEvent e){
		System.out.println("It works!");
	}

}