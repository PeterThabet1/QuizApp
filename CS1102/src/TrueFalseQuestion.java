
import javax.swing.*;

public class TrueFalseQuestion extends Question { // begin of TFQ class
	
	
	
	TrueFalseQuestion(String question, String answer){ //begin of constructor
		super(question);
		JPanel buttons = new JPanel();
		addButton(buttons, "TRUE");
		addButton(buttons, "FALSE");
		this.question.add(buttons);
		initQuestionDialog();
		answer= answer.toUpperCase();
		switch (answer) {   // Begin of switch
		case "T","TRUE","Y","YES":{
			super.correctAnswer = "TRUE";
			break;
		}
		case "F", "FALSE", "N", "NO":{
			super.correctAnswer = "FALSE";
			break;
		}
		default:{  // Begin of Default
			try {
				System.out.println("The answer you provided is invalid."+
			"Please try providing the following answers \" t, true, y , yes\" or \" f, false, n, NO\"" );
			}
			catch(IllegalArgumentException e) {
				System.out.println("Invalid argument!");
				}
		}  // End of Default
		
		}  // End of switch
		
		
	} // end of constructor
	
	void addButton(JPanel buttons, String label) { // begin of addButton method
		JButton button = new JButton(label);
		button.addActionListener(question);
		buttons.add(button);
	} // End of addButton

} // end of TFQ class
