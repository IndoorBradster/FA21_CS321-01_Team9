import java.util.*;

/** Object that holds the score details for a specific lesson.**/
public class Grade {
    private String LessonID;    // Correlates to the LessonID of a lesson.
    private int QuizScore;   // The final score of a quiz.
    
    /** Grade Class Constructor **/
    public void Grade() {
    }
    
    /** Sets the Grade for a specific grade
    * @param ID: Lesson ID is a unique string identifier for each Lesson
    * @param ScoreGrade: Grade value for specific lesson**/
    public void setGrade(String ID, int ScoreGrade) {
        LessonID = ID;
        QuizScore = ScoreGrade;
    }
    
    /** Returns the QuizScore of the Grade object
     * @return double QuizScore
     */
    public int getScore() {
        return QuizScore;
    }
    
    /** Updates the score for a lesson that already has a QuizScore **/
    public void updateScore(int Score) {
        QuizScore = Score;
    }
    
    String GetLessonID() {
        return LessonID;
    }
}
