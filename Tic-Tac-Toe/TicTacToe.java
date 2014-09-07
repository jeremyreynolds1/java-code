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
	//modes and scenarios to win
	//modes: 2 players and player vs Computer.
	boolean player1win, player2win, computerwin, twoPlayer, playerComp;
	public TicTac(){
		JFrame frame = new JFrame("Tic Tac Toe");
		//set layout
		frame.setLayout(new BorderLayout());
		//set size
		frame.setPreferredSize(new Dimension(500, 500));
		//set default close operation
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel buttonLayout = new JPanel();
		buttonLayout.setLayout(new GridLayout(3,3));
		
		//add JPanel to frame
		frame.add(buttonLayout, BorderLayout.WEST);
		
		frame.pack();
		frame.setVisible(true);
	}
}