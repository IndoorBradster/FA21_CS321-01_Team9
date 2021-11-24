/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uah.cs321.termproject;

/**
 *
 * @author adrianalanier
 */
public class Question {
    private String questionStr;
    private String answerStr;
    private int difficultyLevel = 0;
    private String choiceOne;
    private String choiceTwo;
    private String choiceThree;
    
    public void Question(String question, String answer)
    {
       this.questionStr = question;
       this.answerStr = answer;
    }
    
    public void setDifficultyLevel(int difficulty)
    {
       this.difficultyLevel = difficulty;
    }
    
   
    
}
