import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class BoardActions implements ActionListener {
	
	private Board board = new Board();
	private String xo = "";
	private int clicks = 0;
	private String winner = "";
	
	public void actionPerformed(ActionEvent e) {
		
		PlayerPrompt prompt = new PlayerPrompt();
		
		
		if(e.getSource() == board.Jbutton1()) {
			if(board.Jbutton1().getText().length() == 0) {
				clicks++;
			}
			if(clicks % 2 == 0) {
				xo = "O";
			} else {
				xo = "X";
			}
			if(board.Jbutton1().getText().length() == 0) {
				board.changeButton1Text(xo);	
			}
		}
		else if(e.getSource() == board.Jbutton2()) {
			if(board.Jbutton2().getText().length() == 0) {
				clicks++;
			}
			if(clicks % 2 == 0) {
				xo = "O";
			} else {
				xo = "X";
			}
			if(board.Jbutton2().getText().length() == 0) {
				board.changeButton2Text(xo);	
			}
		}
		else if(e.getSource() == board.Jbutton3()) {
			if(board.Jbutton3().getText().length() == 0) {
				clicks++;
			}
			if(clicks % 2 == 0) {
				xo = "O";
			} else {
				xo = "X";
			}
			if(board.Jbutton3().getText().length() == 0) {
				board.changeButton3Text(xo);	
			}
		}
		else if(e.getSource() == board.Jbutton4()) {
			if(board.Jbutton4().getText().length() == 0) {
				clicks++;
			}
			if(clicks % 2 == 0) {
				xo = "O";
			} else {
				xo = "X";
			}
			if(board.Jbutton4().getText().length() == 0) {
				board.changeButton4Text(xo);	
			}
		}
		else if(e.getSource() == board.Jbutton5()) {
			if(board.Jbutton5().getText().length() == 0) {
				clicks++;
			}
			if(clicks % 2 == 0) {
				xo = "O";
			} else {
				xo = "X";
			}
			if(board.Jbutton5().getText().length() == 0) {
				board.changeButton5Text(xo);	
			}
		}
		else if(e.getSource() == board.Jbutton6()) {
			if(board.Jbutton6().getText().length() == 0) {
				clicks++;
			}
			if(clicks % 2 == 0) {
				xo = "O";
			} else {
				xo = "X";
			}
			if(board.Jbutton6().getText().length() == 0) {
				board.changeButton6Text(xo);	
			}
		}
		else if(e.getSource() == board.Jbutton7()) {
			if(board.Jbutton7().getText().length() == 0) {
				clicks++;
			}
			if(clicks % 2 == 0) {
				xo = "O";
			} else {
				xo = "X";
			}
			if(board.Jbutton7().getText().length() == 0) {
				board.changeButton7Text(xo);	
			}
		}
		else if(e.getSource() == board.Jbutton8()) {
			if(board.Jbutton8().getText().length() == 0) {
				clicks++;
			}
			if(clicks % 2 == 0) {
				xo = "O";
			} else {
				xo = "X";
			}
			if(board.Jbutton8().getText().length() == 0) {
				board.changeButton8Text(xo);	
			}	
		}
		else if(e.getSource() == board.Jbutton9()) {
			if(board.Jbutton9().getText().length() == 0) {
				clicks++;
			}
			if(clicks % 2 == 0) {
				xo = "O";
			} else {
				xo = "X";
			}
			if(board.Jbutton9().getText().length() == 0) {
				board.changeButton9Text(xo);	
			}
		}
		
		
		String button1Text = board.Jbutton1().getText();
		String button2Text = board.Jbutton2().getText();
		String button3Text = board.Jbutton3().getText();
		String button4Text = board.Jbutton4().getText();
		String button5Text = board.Jbutton5().getText();
		String button6Text = board.Jbutton6().getText();
		String button7Text = board.Jbutton7().getText();
		String button8Text = board.Jbutton8().getText();
		String button9Text = board.Jbutton9().getText();
		
		JPanel winnerPanel = new JPanel();
		
		
		if(button1Text.equals(button2Text) && button1Text.equals(button3Text) && button1Text.length() > 0 && button2Text.length() > 0 && button3Text.length() > 0) {
				winnerPanel.add(new JLabel(button1Text + " Wins! New Game?"));
				int result = JOptionPane.showConfirmDialog(null, winnerPanel, 
			               "Winner!", JOptionPane.OK_CANCEL_OPTION);
			      if (result == JOptionPane.OK_OPTION) {
			    	  	 Board newGame = new Board();
			    	  	 newGame.boardFrame.dispose();
			    	  	 newGame.main(null);
			      } else {
			    	  	Board exitGame = new Board();
			    	  	exitGame.boardFrame.dispose();
			      }
		}
		else if(button1Text.equals(button4Text) && button1Text.equals(button7Text) && button1Text.length() > 0 && button4Text.length() > 0 && button7Text.length() > 0) {
				winnerPanel.add(new JLabel(button1Text + " Wins! New Game?"));
				int result = JOptionPane.showConfirmDialog(null, winnerPanel, 
			               "Winner!", JOptionPane.OK_CANCEL_OPTION);
			      if (result == JOptionPane.OK_OPTION) {
			    	  	 Board newGame = new Board();
			    	  	 newGame.boardFrame.dispose();
			    	  	 newGame.main(null);
			      } else {
			    	  	Board exitGame = new Board();
			    	  	exitGame.boardFrame.dispose();
			      }
		}
		else if(button1Text.equals(button5Text) && button1Text.equals(button9Text) && button1Text.length() > 0 && button5Text.length() > 0 && button9Text.length() > 0) {
				winnerPanel.add(new JLabel(button1Text + " Wins! New Game?"));
				int result = JOptionPane.showConfirmDialog(null, winnerPanel, 
			               "Winner!", JOptionPane.OK_CANCEL_OPTION);
			      if (result == JOptionPane.OK_OPTION) {
			    	  	 Board newGame = new Board();
			    	  	 newGame.boardFrame.dispose();
			    	  	 newGame.main(null);
			      } else {
			    	  	Board exitGame = new Board();
			    	  	exitGame.boardFrame.dispose();
			      }
		}
		else if(button2Text.equals(button5Text) && button2Text.equals(button8Text) && button2Text.length() > 0 && button5Text.length() > 0 && button8Text.length() > 0) {
				winnerPanel.add(new JLabel(button2Text + " Wins! New Game?"));
				int result = JOptionPane.showConfirmDialog(null, winnerPanel, 
			               "Winner!", JOptionPane.OK_CANCEL_OPTION);
			      if (result == JOptionPane.OK_OPTION) {
			    	  	 Board newGame = new Board();
			    	  	 newGame.boardFrame.dispose();
			    	  	 newGame.main(null);
			      } else {
			    	  	Board exitGame = new Board();
			    	  	exitGame.boardFrame.dispose();
			      }
		}
		else if(button3Text.equals(button5Text) && button3Text.equals(button7Text) && button3Text.length() > 0 && button5Text.length() > 0 && button7Text.length() > 0) {
				winnerPanel.add(new JLabel(button3Text + " Wins! New Game?"));
				int result = JOptionPane.showConfirmDialog(null, winnerPanel, 
			               "Winner!", JOptionPane.OK_CANCEL_OPTION);
			      if (result == JOptionPane.OK_OPTION) {
			    	  	 Board newGame = new Board();
			    	  	 newGame.boardFrame.dispose();
			    	  	 newGame.main(null);
			      } else {
			    	  	Board exitGame = new Board();
			    	  	exitGame.boardFrame.dispose();
			      }
		}
		else if(button3Text.equals(button6Text) && button3Text.equals(button9Text) && button3Text.length() > 0 && button6Text.length() > 0 && button9Text.length() > 0) {
			winnerPanel.add(new JLabel(button3Text + " Wins! New Game?"));
			int result = JOptionPane.showConfirmDialog(null, winnerPanel, 
		               "Winner!", JOptionPane.OK_CANCEL_OPTION);
		      if (result == JOptionPane.OK_OPTION) {
		    	  	 Board newGame = new Board();
		    	    	 newGame.boardFrame.dispose();
		    	  	 newGame.main(null);
		      } else {
		    	  	Board exitGame = new Board();
		    	  	exitGame.boardFrame.dispose();
		      }
	}
		else if(button4Text.equals(button5Text) && button4Text.equals(button6Text) && button4Text.length() > 0 && button5Text.length() > 0 && button6Text.length() > 0) {
				winnerPanel.add(new JLabel(button4Text + " Wins! New Game?"));
				int result = JOptionPane.showConfirmDialog(null, winnerPanel, 
			               "Winner!", JOptionPane.OK_CANCEL_OPTION);
			      if (result == JOptionPane.OK_OPTION) {
			    	  	 Board newGame = new Board();
			    	  	 newGame.boardFrame.dispose();
			    	  	 newGame.main(null);
			      } else {
			    	  	Board exitGame = new Board();
			    	  	exitGame.boardFrame.dispose();
			      }
		}
		else if(button7Text.equals(button8Text) && button7Text.equals(button9Text) && button7Text.length() > 0 && button8Text.length() > 0 && button9Text.length() > 0) {
				winnerPanel.add(new JLabel(button7Text + " Wins! New Game?"));
				int result = JOptionPane.showConfirmDialog(null, winnerPanel, 
			               "Winner!", JOptionPane.OK_CANCEL_OPTION);
			      if (result == JOptionPane.OK_OPTION) {
			    	  	 Board newGame = new Board();
			    	  	 newGame.boardFrame.dispose();
			    	  	 newGame.main(null);
			      } else {
			    	  	Board exitGame = new Board();
			    	  	exitGame.boardFrame.dispose();
			      }
		}
		
		else if(button1Text.length() > 0 && button2Text.length() > 0 && button3Text.length() > 0 && button4Text.length() > 0 && button5Text.length() > 0 && button6Text.length() > 0 && button7Text.length() > 0 && button8Text.length() > 0 && button9Text.length() > 0) {
			winnerPanel.add(new JLabel("That's A Draw! Play Again?"));
			int result = JOptionPane.showConfirmDialog(null, winnerPanel, 
		               "Draw!", JOptionPane.OK_CANCEL_OPTION);
		      if (result == JOptionPane.OK_OPTION) {
		    	  	 Board newGame = new Board();
		    	  	 newGame.boardFrame.dispose();
		    	  	 newGame.main(null);
		      } else {
		    	  	Board exitGame = new Board();
		    	  	exitGame.boardFrame.dispose();
		      }
		}
		
	}
	public String winner() {
		return this.winner;
	}
	
}
