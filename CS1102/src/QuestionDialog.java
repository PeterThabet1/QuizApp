import java.awt.event.*;
import javax.swing.*;

public class QuestionDialog extends JDialog implements ActionListener { // begin of QuestionDialog Class
	String answer;
	public void actionPerformed(ActionEvent e) { //Action handler begin
		answer= e.getActionCommand();
		dispose();
		} // Action handler end
	
	
	
	
	
	
} // End of QuestionDialog class
