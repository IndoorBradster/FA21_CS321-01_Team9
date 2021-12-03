import java.util.*;

/** Object that holds the score details for a specific lesson.**/
public class Grade {
    private String LessonID;    // Correlates to the LessonID of a lesson.
    private int QuizGrade;   // The final score of a quiz.
    
    /** Grade Class Constructor **/
    public void Grade() {
    }
    
    /** Sets the Grade for a specific grade
    * @param ID: Lesson ID is a unique string identifier for each Lesson
    * @param ScoreGrade: Grade value for specific lesson**/
    public void setGrade(String ID, int ScoreGrade) {
        LessonID = ID;
        QuizGrade = ScoreGrade;
    }
    
    /** Returns the QuizScore of the Grade object
     * @return double QuizScore
     */
    public int getGrade() {
        return QuizGrade;
    }
    
    /** Updates the score for a lesson that already has a QuizScore
     * @param Grade **/
    public void updateGrade(int Grade) {
        QuizGrade = Grade;
    }
    
    public String GetLessonID() {
        return LessonID;
    }
}
