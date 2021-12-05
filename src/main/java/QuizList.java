
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Brad
 */
public class QuizList {
    // Mapped by LessonID and respective Quiz
    private final HashMap<String, quiz> quizzes = new HashMap<>();

    // Default Constructor
    public QuizList() {
    }
    
    // Put a quiz in the list
    public void addQuiz(String LessonID, quiz newquiz) {
        quizzes.put(LessonID, newquiz);
    }
    
    // Return a quiz from the list
    public quiz getQuiz(String LessonID) {
        return quizzes.get(LessonID);
    }
}
