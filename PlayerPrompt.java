import javax.swing.*;

public class PlayerPrompt {
	
	JTextField xField = new JTextField(10);
    JTextField yField = new JTextField(10);
    String playerOneName = "";
    String playerTwoName = "";
    
   public void userPrompt() {
	   
      JPanel myPanel = new JPanel();
      myPanel.add(new JLabel("Player 1 Name:"));
      myPanel.add(this.xField);
      myPanel.add(new JLabel("Player 2 Name:"));
      myPanel.add(this.yField);

      int result = JOptionPane.showConfirmDialog(null, myPanel, 
               "Enter Player Names", JOptionPane.OK_CANCEL_OPTION);
      if (result == JOptionPane.OK_OPTION) {
    	  	 this.playerOneName = String.valueOf(this.xField.getText());
    	  	 this.playerTwoName = this.yField.getText();
      }
      
   }
   public String getPlayer1Name() {
	  	return playerOneName;
 }
   public String getPlayer2Name() {
	   return playerTwoName;
 }
}