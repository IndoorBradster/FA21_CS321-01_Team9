import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Brad
 */
public class LessonList {
    List<Lesson> LessonList = new LinkedList<>(); 
    
    /** Default LessonList constructor **/
    public LessonList() {
    }
    
/** Adds a lesson to LessonList
 * @param lesson Lesson to added to the list
*/
    public void addLesson(Lesson lesson) {
        LessonList.add(lesson);
    }
    
/** Deletes lesson from LessonList
 * @param lesson Lesson to be removed
 *  
*/
    public void removeLesson(Lesson lesson) {
        LessonList.remove(lesson);
    }

/** Gets List of lesson titles
 * @return Titles 
*/
    public List<String> getLessonTitles() {
        
        List<String> Titles = null;
        ListIterator<Lesson> iterator = LessonList.listIterator();
        try {
            while (iterator.hasNext()) {
                Titles.add(iterator.next().getLessonTitle());
            }
        }
        catch (NullPointerException e) {
            System.out.println("Exception thrown : " + e);
        }
        return Titles;
    }
/** Gets the number of items in the lesson list
 * @return LessonList.size 
*/
    public int getLength() {
        return LessonList.size();
    }
/**Returns the entire list of lessons
 * @return LessonList 
*/  
    public List<Lesson> getLessons() {
        return LessonList;
    }
}
