
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
    private final HashMap<String, quiz> quizzes = new HashMap<>();
    
    public QuizList() {
    }
    
    public void addQuiz(String LessonID, quiz newquiz) {
        quizzes.put(LessonID, newquiz);
    }
    
    public quiz getQuiz(String LessonID) {
        return quizzes.get(LessonID);
    }
}
