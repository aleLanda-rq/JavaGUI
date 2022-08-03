

public class Quiz  {

	public static void main(String[] args) {
//	
		MultipleChoiceQuestion question = new MultipleChoiceQuestion(
				 "How many bits are in a byte?",
				 "8",
				 "2",
				 "16",
				 "23",
				 "88",
				 "a");
           question.check();
           MultipleChoiceQuestion question1 = new MultipleChoiceQuestion(
  				 "What does CPU stand for?",
  				 "Candy Plus Unicorns",
  				 "Cheap Pizza Under",
  				 "Central Processing Unit",
  				 "Create Patch Update",
  				 "Create Push Ups",
  				 "c");
           question1.check();
           
           
           MultipleChoiceQuestion question2 = new MultipleChoiceQuestion(
    				 "What is Computer Science?",
    				 "Hard stuff",
    				 "Free Pizza",
    				 "The study of bears",
    				 "Unicorns",
    				 "The study of computers and computational systems\\",
    				 "e");
	             question2.check();
	
	MultipleChoiceQuestion question3 = new MultipleChoiceQuestion(
				 "Which one is not a programming language?",
				 "Java",
				 "Python",
				 "C++",
				 "CSS",
				 "C#",
				 "d");
	          question3.check();
	 
	MultipleChoiceQuestion question4 = new MultipleChoiceQuestion(
				 "What color is the sky at night?",
				 "Yellow",
				 "Pink",
				 "Black",
				 "Blue",
				 "Green",
				 "c");
	
	          question4.check();
		
	          Question question5 = new TrueFalseQuestion(
	        		  "Is the Earth round?",
	        		  "TRUE"
	        		 );
	      
	          question5.check();
//	          
	          Question question6 = new TrueFalseQuestion(
	        		  "Can Javascript be used for front-end and back-end?",
	        		  "TRUE"
	        		 );
	          question6.check();
	          
	          Question question7 = new TrueFalseQuestion(
	        		  "Is Miami in Florida?",
	        		  "TRUE"
	        		 );
	          question7.check();
	          
	          Question question8 = new TrueFalseQuestion(
	        		  "Are there 3 seasons?",
	        		  "FALSE"
	        		 );
	          question8.check();
//	          
	          Question question9 = new TrueFalseQuestion(
	        		  "Are dolphins mammals?",
	        		  "TRUE"
	        		 );
	          question9.check();
	          
	          
		question.showResults();
	
	}

}


