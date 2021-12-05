
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**Represents the collection of all quizzes
 *
 */
public class QuizList {
    // Mapped by LessonID and respective Quiz
    private final HashMap<String, quiz> quizzes = new HashMap<>();

/** Constructor
 */
    public QuizList() {
    }
    
 /**Adds a quiz to the list
 *@param LessonID
 *@param newquiz
 */
    public void addQuiz(String LessonID, quiz newquiz) {
        quizzes.put(LessonID, newquiz);
    }
    

 /**Return a quiz from the list
 *@param LessonID
 *@return quizzes.get(LessonID)
 */
    public quiz getQuiz(String LessonID) {
        return quizzes.get(LessonID);
    }
 /**Assigns score to a quiz
 *@param LessonID
 *@param question
 */
    public void setQuizQuestionScore(String LessonID, Question question) {
        
    }
}
