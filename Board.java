import javax.swing.*;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;

public class Board {
	
	private static int FRAME_DIMENSIONS = 500;
	public static JLabel declareWinner = new JLabel();
	public static JFrame boardFrame;
	private static JButton button1;
	private static JButton button2;
	private static JButton button3;
	private static JButton button4;
	private static JButton button5;
	private static JButton button6;
	private static JButton button7;
	private static JButton button8;
	private static JButton button9;
	
	public static void main(String[] args) {
		
		PlayerPrompt prompt = new PlayerPrompt();
		prompt.userPrompt();
		String name1 = prompt.getPlayer1Name();
		String name2 = prompt.getPlayer2Name();
		boardFrame = new JFrame();
		JLabel player1Name = new JLabel();
		JLabel player2Name = new JLabel();
		player1Name.setText(name1 + " is X's");
		player2Name.setText(name2 + " is O's");
		JPanel board = new JPanel();
		board.setLayout(null);
		
		button1 = new JButton("");
		button2 = new JButton("");
		button3 = new JButton("");
		button4 = new JButton("");
		button5 = new JButton("");
		button6 = new JButton("");
		button7 = new JButton("");
		button8 = new JButton("");
		button9 = new JButton("");
		
		button1.setFont(new Font("Arial", Font.BOLD, 40));
		button2.setFont(new Font("Arial", Font.BOLD, 40));
		button3.setFont(new Font("Arial", Font.BOLD, 40));
		button4.setFont(new Font("Arial", Font.BOLD, 40));
		button5.setFont(new Font("Arial", Font.BOLD, 40));
		button6.setFont(new Font("Arial", Font.BOLD, 40));
		button7.setFont(new Font("Arial", Font.BOLD, 40));
		button8.setFont(new Font("Arial", Font.BOLD, 40));
		button9.setFont(new Font("Arial", Font.BOLD, 40));
		
		button1.setBounds(20, 20, 150, 150);
		button2.setBounds(170, 20, 150, 150);
		button3.setBounds(320, 20, 150, 150);
		button4.setBounds(20, 170, 150, 150);
		button5.setBounds(170, 170, 150, 150);
		button6.setBounds(320, 170, 150, 150);
		button7.setBounds(20, 320, 150, 150);
		button8.setBounds(170, 320, 150, 150);
		button9.setBounds(320, 320, 150, 150);
		
		
		player1Name.setBounds(150, 0, FRAME_DIMENSIONS, 20);
		player2Name.setBounds(250, 0, FRAME_DIMENSIONS, 20);
		declareWinner.setBounds(170, 480, FRAME_DIMENSIONS, FRAME_DIMENSIONS);
		
		
		ActionListener clickX = new BoardActions();
		
		button1.addActionListener(clickX);
		button2.addActionListener(clickX);
		button3.addActionListener(clickX);
		button4.addActionListener(clickX);
		button5.addActionListener(clickX);
		button6.addActionListener(clickX);
		button7.addActionListener(clickX);
		button8.addActionListener(clickX);
		button9.addActionListener(clickX);
		
		board.setBackground(Color.cyan);
		board.add(button1);
		board.add(button2);
		board.add(button3);
		board.add(button4);
		board.add(button5);
		board.add(button6);
		board.add(button7);
		board.add(button8);
		board.add(button9);
		
		board.add(player1Name);
		board.add(player2Name);
		board.add(declareWinner);
		
		boardFrame.add(board);
		boardFrame.setSize(FRAME_DIMENSIONS, FRAME_DIMENSIONS);
	    boardFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		boardFrame.setVisible(true);
		
	}
	public JButton Jbutton1() {
		return button1;
	}
	public JButton Jbutton2() {
		return button2;
	}
	public JButton Jbutton3() {
		return button3;
	}
	public JButton Jbutton4() {
		return button4;
	}
	public JButton Jbutton5() {
		return button5;
	}
	public JButton Jbutton6() {
		return button6;
	}
	public JButton Jbutton7() {
		return button7;
	}
	public JButton Jbutton8() {
		return button8;
	}
	public JButton Jbutton9() {
		return button9;
	}
	
	public void changeButton1Text(String value) {
		button1.setText(value);
	}
	public void changeButton2Text(String value) {
		button2.setText(value);
	}
	public void changeButton3Text(String value) {
		button3.setText(value);
	}
	public void changeButton4Text(String value) {
		button4.setText(value);
	}
	public void changeButton5Text(String value) {
		button5.setText(value);
	}
	public void changeButton6Text(String value) {
		button6.setText(value);
	}
	public void changeButton7Text(String value) {
		button7.setText(value);
	}
	public void changeButton8Text(String value) {
		button8.setText(value);
	}
	public void changeButton9Text(String value) {
		button9.setText(value);
	}
	public String showWinner(String value) {
		return value;
	}
}