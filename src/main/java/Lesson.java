/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
    public void setLessonID(String ID) {
        LessonID = ID;
    }
    
    public void setLessonTitle(String Title) {
        LessonTitle = Title;
    }
    
    public void setLessonContent(String Content) {
        LessonContent = Content;
    }
    
    // Getters
    public String getLessonID() {
        return LessonID;
    }

    public String getLessonTitle() {
        return LessonTitle;
    }
    
    public String getLessonContent() {
        return LessonContent;
    }
}
