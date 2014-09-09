import javax.swing.*;
import javax.swing.JOptionPane;
import java.awt.*;
import java.awt.event.*;

class TicTacToe {
	public static void main(String[] args) {
		TicTac gameon = new TicTac();
		
		//System.out.print("hello");
	}
}

class TicTac extends JPanel{
	
	JButton button1, button2, button3, button4, button5, button6, button7, button8, button9;
	
	JLabel display;
	//modes and scenarios to win
	//modes: 2 players and player vs Computer.
	//playerOneTurn = X
	//playerTwoTurn = O
	boolean player1win, player2win;
	boolean playerOneTurn = true;
	boolean playerTwoTurn = false;
	public TicTac(){
		JFrame frame = new JFrame("Tic Tac Toe");
		//set layout
		frame.setLayout(new BorderLayout());
		//set size
		frame.setPreferredSize(new Dimension(400, 300));
		//set default close operation
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//create JPanel buttonLayout to add JButtons to panel
		JPanel buttonLayout = new JPanel();
		buttonLayout.setLayout(new GridLayout(3,3));
		
		//create playing buttons
		button1 = new JButton("");
		button2 = new JButton("");
		button3 = new JButton("");
		button4 = new JButton("");
		button5 = new JButton("");
		button6 = new JButton("");
		button7 = new JButton("");
		button8 = new JButton("");
		button9 = new JButton("");
		
		//add buttons to layout
		buttonLayout.add(button1);
		buttonLayout.add(button2);
		buttonLayout.add(button3);
		buttonLayout.add(button4);
		buttonLayout.add(button5);
		buttonLayout.add(button6);
		buttonLayout.add(button7);
		buttonLayout.add(button8);
		buttonLayout.add(button9);
		
		//create actionListener for play buttons
		ActionListener selection = new selectionButton();
		
		//button.addActionListener(selection);
		button1.addActionListener(selection);
		button2.addActionListener(selection);
		button3.addActionListener(selection);
		button4.addActionListener(selection);
		button5.addActionListener(selection);
		button6.addActionListener(selection);
		button7.addActionListener(selection);
		button8.addActionListener(selection);
		button9.addActionListener(selection);
		
		//add JPanel to frame
		frame.add(buttonLayout, BorderLayout.WEST);
		
		/*//create new JPanel for modeSelection
		
		JPanel modes = new JPanel();
		
		//(rows, columns)
		modes.setLayout(new GridLayout(2, 1));
		
		//create new button to select modes
		buttonTwoPlayer = new JButton("Two Player");
		buttonOnePlayer = new JButton("One Player");
		
		//add actionListeners to buttons
		ActionListener mode = new modeSelection();
		
		buttonTwoPlayer.addActionListener(mode);
		buttonOnePlayer.addActionListener(mode);
		
		//add buttons to JPanel
		modes.add(buttonOnePlayer);
		modes.add(buttonTwoPlayer);
		
		//add JPanel to main frame
		frame.add(modes, BorderLayout.EAST);//*/
		
		//add display to top
		display = new JLabel("Player 1 start");
		
		frame.add(display, BorderLayout.NORTH);
		
		
		frame.pack();
		frame.setVisible(true);
	}
	class selectionButton implements ActionListener{
		/*
		playerOneTurn = X;
		playerTwoTurn = O;
		display shows player turn
		*/
		public void actionPerformed(ActionEvent e){
			String text = e.getActionCommand();
			JButton button = (JButton) e.getSource();
				//if button is blank and it's playerOneTurn is true, set button to "X", else set button to "O"
				if (text.equals("") && playerOneTurn == true) {
					button.setText("X");
					playerOneTurn = false;
					playerTwoTurn = true;
					display.setText("Player 2 turn");
				}
				else if (text.equals("") && playerTwoTurn == true) {
					button.setText("O");
					playerOneTurn = true;
					playerTwoTurn = false;
					display.setText("Player 1 turn");
				}
				//need to check for pattern of 3.
				/*
					8 ways to win
					3 vertical
					3 horizontal
					2 vertical
				*/
				//button1.getText()
				//horizontal wins
				/*
					board layout:
					1,2,3
					4,5,6
					7,8,9
				*/
				//row 1
				if ((button1.getText() == button2.getText()) && (button2.getText() == button3.getText()) && (button1.getText() != "")) {
					if (button1.getText() == "X") {
						player1win = true;
						player2win = false;
					}
					else if (button1.getText() == "O"){
						player2win = true;
						player1win = false;
					}
				}
				//row 2
				if((button4.getText() == button5.getText()) && (button5.getText() == button6.getText()) && (button4.getText() != "")){
					if (button4.getText() == "X") {
							player1win = true;
							player2win = false;
						}
					else if (button4.getText() == "O"){
							player2win = true;
							player1win = false;
						}
				}
				//row 3
				if((button7.getText() == button8.getText()) && (button8.getText() == button9.getText()) && (button7.getText() != "")){
					if (button7.getText() == "X") {
							player1win = true;
							player2win = false;
						}
					else if (button7.getText() == "O"){
							player2win = true;
							player1win = false;
						}
					}
				//vertical wins
				//column 1 (1,4,7)
				if ((button1.getText() == button4.getText()) && (button4.getText() == button7.getText()) && (button1.getText() != "")) {
					if (button1.getText() == "X") {
						player1win = true;
						player2win = false;
					} 
					else if(button1.getText() == "O") {
						player2win = true;
						player1win = false;
					}
				}
				//column 2 (2, 5, 8)
				if ((button2.getText() == button5.getText()) && (button5.getText() == button8.getText()) && (button2.getText() != "")) {
					if (button2.getText() == "X") {
						player1win = true;
						player2win = false;
					} 
					else if(button2.getText() == "O") {
						player2win = true;
						player1win = false;
					}
				}
				//column 3 (3, 6, 9)
				if ((button3.getText() == button6.getText()) && (button6.getText() == button9.getText()) && (button3.getText() != "")) {
					if (button3.getText() == "X") {
						player1win = true;
						player2win = false;
					} 
					else if(button3.getText() == "O") {
						player2win = true;
						player1win = false;
					}
				}
				//diagonal wins
				//top left down (1, 5, 9)
				if ((button1.getText() == button5.getText()) && (button5.getText() == button9.getText()) && (button1.getText() != "")) {
					if (button1.getText() == "X") {
						player1win = true;
						player2win = false;
					} 
					else if(button1.getText() == "O") {
						player2win = true;
						player1win = false;
					}
				}
				//top right down (3, 5, 7)
				if ((button3.getText() == button5.getText()) && (button5.getText() == button7.getText()) && (button3.getText() != "")) {
					if (button1.getText() == "X") {
						player1win = true;
						player2win = false;
					} 
					else if(button1.getText() == "O") {
						player2win = true;
						player1win = false;
					}
				}
				//set display to player 1,2 win!
				//might want to set JDialog to come up
				if (player1win == true) {
					display.setText("Player 1 wins!");
				}
				else if(player2win == true) {
					display.setText("Player 2 wins!");
					
				}
		}
		
	}
	/*class modeSelection implements ActionListener{
		public void actionPerformed(ActionEvent e){
			//String text = e.getActionCommand()
			//get button text for modes;
			
		}
	}//*/
}