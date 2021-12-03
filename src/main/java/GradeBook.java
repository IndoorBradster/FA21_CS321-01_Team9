import java.util.*;

public class GradeBook {

    private Hashtable<String, Grade> GradeBookScores = new Hashtable<String, Grade>();
    //private Dictionary<String, Grade> GradeBookScores;
    
    /** Default GradeBook constructor **/
    public GradeBook() {
    }
    
    /** Add new grade object to the GradeBook.
     * @param LessonID: Lesson ID is a unique identifier for each Lesson
     * @param grade: Grade Object stores details about a users grade for a specific lesson. **/
    public void addScore(String LessonID, Grade grade) {
        GradeBookScores.put(LessonID, grade);
    }
    
    /** Return the quiz score related to the LessonID **/
    public int getScore(String LessonID) {
        Grade grade = GradeBookScores.get(LessonID);
        return grade.getScore();
    }
    
    /** Return the int value of the size of the GradeBook. **/
    public int getGradeBookSize() {
        return GradeBookScores.size();
    }
    
    /** This method will return an Enumeration of keys (LessonID's) **/
    public Enumeration<String> getGradeBookIDs() {
        return GradeBookScores.keys();
        
        /* Example: Use the following code to print each LessonID
        Enumeration keys = Gradebook1.getGradeBookIDs();
        while (keys.hasMoreElements()) {
            System.out.println(keys.nextElement());
        }
        */
    }
}
