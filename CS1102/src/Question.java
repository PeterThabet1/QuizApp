import java.awt.*;
import javax.swing.*;

public abstract class Question { // begin of absC Question
	static int nQuestions = 0; // number of questions
	static int nCorrect = 0; // number of correct answers
	QuestionDialog question;
	String correctAnswer;
	
	Question(String question){ // Begin question const. with string param
		this.question = new QuestionDialog();
		this.question.setLayout(new GridLayout(0,1));
		this.question.add(new JLabel("		"+ question + "		", JLabel.CENTER));
	} // End of question const. with string param
	
	void initQuestionDialog() { // Begin of initQuestionDialog
		question.setModal(true);
		question.pack();
		question.setLocationRelativeTo(null);
	} // End of initQuestionDialog
	
	String ask() { // begin of ask method
		question.setVisible(true);
		return question.answer;
		
		}; // abstract method ask
	
	void check() { // begin of check method
		String answer = ask();
		nQuestions++;
		if (answer.equals(correctAnswer)) {// begin of if
			JOptionPane.showMessageDialog(null,"Correct!");
			nCorrect++;
		} // end of if
		
		else { // begin of else
			JOptionPane.showMessageDialog(null,"Incorrect. The correct answer is "+ correctAnswer);
		}// end of else	
		
	}// end of check method
	
	static void showResults() { // begin of showResults method
		
		JOptionPane.showMessageDialog(null,nCorrect+" correct out of "+nQuestions+" questions");
		
	} // end of showResults method
	
	
	
	
} // end of abs C Question
