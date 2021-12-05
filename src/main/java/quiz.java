
import java.util.LinkedList;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//package uah.cs321.termproject;

/*
 *
 * @author adrianalanier
 */
/*public class Quiz {
    private int numQuestions;
    
    public void Quiz()
    {
    
    }
    
    public void addQuestion()
    {
    
    }
    
    
    
    
}
*/


/**
 *Represents one quiz
 * 
 */
public class quiz{
	//function to print introduction
    private List<Question> questions = new LinkedList<>();			//list to hold all questions in the quiz
    private String LessonID;							//matches the question to its lesson
    
    // setters
/** Assigns the ID of the matching lesson to the quiz
 * @param lessonID
 */
    public void setQuizID(String lessonid) {
        LessonID = lessonid;
    }
	
/** Adds 1 question to the Question linked list
 * @param question
 */
    public void addQuestion(Question question){
        questions.add(question);
    }
    

    
// getters
	
/** Gets the ID of the matching the lesson, which is now associated with QuizID
 * @return LessonID
 */
    public String getQuizID() {
        return LessonID;
    }
/** Gets the list of questions in the quiz
 * @return questions
 */
    public List getQuestions(){
        return questions;
    }
    
    public int calculateScore(){
        double Score = 0;
        for(Question q : questions) {
            try {
                String selectedAnswer = q.getSelectedAnswer();
                String correctAnswer = q.getCorrectAnswer();
                if (selectedAnswer.equals(correctAnswer)) {
                    Score++;
                }
            } catch (NullPointerException e) {
            }
        }
        Score = (int) ((Score / (double) questions.size())*100);
        return (int) Score;
    } 

// !- need to port to quizzes.xml -!
//	void questions1(){
//	System.out.println("Guess the Tense Type ");
//	System.out.println("Why do you live in France? ");
//	System.out.println("You are visiting EnglishClub. ");
//	System.out.println("I haven't had breakfast yet. ");
//	System.out.println("Would you like a coffee?");
//	}
//    
//	void questions2(){
//			System.out.println("Fill in the blanks");
//			System.out.println("Shruti ______ to study now.\r\n"
//					+ "(a) going\r\n"
//					+ "(b) is going\r\n"
//					+ "(c) will ");
//			System.out.println("James ____ to the market yesterday.\r\n"
//					+ "(a) went\r\n"
//					+ "(b) is left\r\n"
//					+ "(c) is going ");
//			System.out.println("At this time tomorrow, Jason ____ in Paris.\r\n"
//					+ "(a) will be\r\n"
//					+ "(b) was\r\n"
//					+ "(c) were ");
//			System.out.println("When Diya got the call, she _____ in her office.\r\n"
//					+ "(a) work\r\n"
//					+ "(b) will be\r\n"
//					+ "(c) was working");
//			}
//	 void questions3(){
//			System.out.println("Fill in the blanks 2");
//			System.out.println("When you phoned, I ……………….. a shower.\r\n"
//					+ "was having\r\n"
//					+ "am having\r\n"
//					+ "had");
//			System.out.println(" If you had arrived late, I ………………….. angry.\r\n"
//					+ "had been\r\n"
//					+ "would have been\r\n"
//					+ "will have been ");
//			System.out.println("They ………………….. the French course yet.\r\n"
//					+ "have not started\r\n"
//					+ "had not started\r\n"
//					+ "have not start ");
//			System.out.println("My family ………………….. in Australia for a year when I was a child.\r\n"
//					+ "was living\r\n"
//					+ "lives\r\n"
//					+ "lived ");
//			}
//	
//    void answers1(){
//	System.out.println("The answers are: ");
//	System.out.println("present simple ");
//	System.out.println("present continuous ");
//	System.out.println("present perfect ");
//	System.out.println("conditional ");
//	}
//	 void answers2(){
//			System.out.println("The answers are: ");
//			System.out.println("(b)");
//			System.out.println("(a)");
//			System.out.println("(a)");
//			System.out.println("(c)");
//			}
//	 void answers3(){
//			System.out.println("The answers are: ");
//			System.out.println("was having ");
//			System.out.println("would have been ");
//			System.out.println("have not started ");
//			System.out.println("lived ");
//			}
	
}


