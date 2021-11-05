import java.awt.*;
import javax.swing.*;

public class MultipleChoiceQuestion extends Question {


	MultipleChoiceQuestion(String query, String a, String b, String c,
			String d, String e, String answer) { // begin of MCQ constructor
		super(query);
		addChoice("A",a);
		addChoice("B",b);
		addChoice("C",c);
		addChoice("D",d);
		addChoice("E",e);
		initQuestionDialog();
		correctAnswer = answer.toUpperCase();	
	} // End of MCQ constructor
	
	void addChoice(String name, String label) {  //begin of addchoice
		JPanel choice = new JPanel(new BorderLayout());
		JButton button = new JButton(name);
		button.addActionListener(question);
		choice.add(button, BorderLayout.WEST);
		choice.add(new JLabel(label +"		", JLabel.LEFT), BorderLayout.CENTER);
		question.add(choice);
	} // End of addchoice
	
	
} // end of class
