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
    
    public void addLesson(Lesson lesson) {
        LessonList.add(lesson);
    }
    
    public void removeLesson(Lesson lesson) {
        LessonList.remove(lesson);
    }
    
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
}
