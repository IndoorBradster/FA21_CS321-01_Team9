import java.util.*;

public class GradeBook {

    private final HashMap<String, Grade> GradeBook = new HashMap<>();
    //private Dictionary<String, Grade> GradeBookScores;
    
    /** Default GradeBook constructor **/
    public GradeBook() {
    }
    
    /** Add new grade object to the GradeBook.
     * @param LessonID: Lesson ID is a unique identifier for each Lesson
     * @param grade: Grade Object stores details about a users grade for a specific lesson. **/
    public void addScore(String LessonID, Grade grade) {
        GradeBook.put(LessonID, grade);
    }
    
    /** Return the quiz score related to the LessonID
     * @param LessonID
     * @return  int Score**/
    public int getGrade(String LessonID) {
        int grade = GradeBook.get(LessonID).getGrade();
        return grade;
    }
    
    /** Return the int value of the size of the GradeBook.
     * @return int GradeBookSize **/
    public int getGradeBookSize() {
        return GradeBook.size();
    }
    
    /**
     * @return returns a set of keys (LessonID's)**/
    public Set<String> getGradeBookIDs() {
        return GradeBook.keySet();
        
        /* Example: Use the following code to print each LessonID
        Enumeration keys = Gradebook1.getGradeBookIDs();
        while (keys.hasMoreElements()) {
            System.out.println(keys.nextElement());
        }
        */
    }
}
