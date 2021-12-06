/**
 *
 * @author Brad
 */
public class Lesson {
    private String LessonID;
    private String LessonTitle;
    private String LessonContent;
    
    /** Default constructor*/
    public void Lesson() {
    }
    
    // Setters
    /** Set the ID of a lesson
     * @param ID string to assign to a particular lesson as the ID
     *  
    */
    public void setLessonID(String ID) {
        LessonID = ID;
    }

    /** Set the title of a lesson
     * @param Title string to assign to a particular lesson as the title
     *  
    */
    public void setLessonTitle(String Title) {
        LessonTitle = Title;
    }
   
    /** Set the content of a lesson
     * @param Content string to assign to a particular lessons content
     *  
    */ 
    public void setLessonContent(String Content) {
        LessonContent = Content;
    }
    
    // Getters

    /** get the ID of a lesson
     * @return LessonID string
     *  
    */
    public String getLessonID() {
        return LessonID;
    }
    /** get the title of a lesson
     * @return LessonTitle string
     *  
    */
    public String getLessonTitle() {
        return LessonTitle;
    }

    /** get the content of a lesson
     * @return LessonContent string
     *  
    */ 
    public String getLessonContent() {
        return LessonContent;
    }
}
