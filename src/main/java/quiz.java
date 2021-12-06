import java.util.LinkedList;
import java.util.List;
/*
 *
 * @author adrianalanier
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
	
}


