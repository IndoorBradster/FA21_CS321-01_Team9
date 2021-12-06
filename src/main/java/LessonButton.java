import javax.swing.JButton;

/**Lesson button
 *
 * @author Brad
 * @param <Lesson>
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
