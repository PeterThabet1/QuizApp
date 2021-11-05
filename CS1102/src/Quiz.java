
public class Quiz { //begin of class
	
	public static void main(String[] args) { // begin of main
		
		Question question1 = new MultipleChoiceQuestion("What is the largest country in the world?", 
				"Australia", "Russia", "India", "China", "Canada", "b");
		
		question1.check();
		
		Question question2 = new MultipleChoiceQuestion("Which country has the largest population?", 
				"China", "Indonesia", "India", "United States", "Nigeria", "a");
		
		question2.check();

		Question question3 = new MultipleChoiceQuestion("Who is the most famous celebrity in the world?", 
				"Scarlett Johansson", "Justin Bieber", "Cristiano Ronaldo", "Dwayne Johnson", "Shah Rukh Khan", "d");
		
		question3.check();
		
		Question question4 = new MultipleChoiceQuestion("What is the tallest building in the world?", 
				"Shanghai Tower", "Lotte World Tower", "Ping An International Finance Center", "One World Trade Center", "Burj Khalifa", "e");
		
		question4.check();
		
		Question question5 = new MultipleChoiceQuestion("What is the longest bridge in the world?", 
				"Bang Na Expressway", "The Danyang-Kunshan Grand Bridge", "Tiajin Grand Bridge", "Manchac Swamp", "Lake Pontchartrain Causeway", "b");
		
		question5.check();
		
		Question questionTF1 = new TrueFalseQuestion("Is the Great Wall of China longer than London to Beijing?", "True");
		
		questionTF1.check();
		
		Question questionTF2 = new TrueFalseQuestion("Trees existed before sharks?", "f");
		
		questionTF2.check();
		
		Question questionTF3 = new TrueFalseQuestion("The population of California is larger than the entire population of Canada?", "y");
		
		questionTF3.check();
		
		Question questionTF4 = new TrueFalseQuestion("Cumulus clouds could weigh more than a million pound?", "yes");
		
		questionTF4.check();
		
		Question questionTF5 = new TrueFalseQuestion("Polar bear's skin is white?", "n");
		
		questionTF5.check();
		
		Question.showResults();
		
		
	} // End of main
	
} // End of class
