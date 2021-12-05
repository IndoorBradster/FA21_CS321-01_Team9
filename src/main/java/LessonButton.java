
import javax.swing.JButton;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**Lesson button
 *
 * @author Brad
 */
public class LessonButton<Lesson> extends JButton {
    private Lesson lesson;
 /**Gets a particular button's lesson
 *@return lesson 
 */    
    public Lesson getLesson() {
        return this.lesson;
    }
 /**Assigns a particular button to a lesson
 *@param lesson 
 */
    public void setLesson(Lesson lesson) {
        this.lesson = lesson;
    }
    
}
