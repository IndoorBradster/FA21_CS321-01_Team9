/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author adrianalanier
 */
public class Question {
    private int QuestionNumber;
    private String QuestionPrompt;
    private String LessonContent;
    private String OptionA;
    private String OptionB;
    private String OptionC;
    private String CorrectAnswer;
 
    
    /** Default constructor, This represents one singular question 
     * /
 public void Question() {
    }
    
// Setters
/** Set the number value of a question
 * @param num int to assign to set the question number.
 *  
*/
    public void setQuestionNumber(int num) {
        this.QuestionNumber = num;
    }

/** Set the question prompt
 * @param prompt 
 *  
*/
    public void seQuestionPrompt(String Prompt) {
        this.QuestionPrompt = Prompt;
    }
/** Set the correct answer
 * @param CorrectAnswer 
 *  
*/  
    public void setCorrectAnswer(String answer) {
        this.CorrectAnswer = answer;
    }
   
/** Set A  for the multiple choice options
 * @param optionA 
 *  
*/ 
    public void setOptionA(String optionA) {
        this.OptionA = optionA;
    }
    
/** Set B  for the multiple choice options
 * @param optionB 
 *  
*/ 
    public void setOptionB(String optionB) {
        this.OptionB = optionB;
    }
    
/** Set C  for the multiple choice options
 * @param optionC
 *  
*/ 
    public void setOptionC(String optionC) {
        this.OptionC = optionC;
    }
    
    
/** Get question number
 * @return QuestionNumber
 *  
*/ 
    public int getQuestionNumber() {
        return QuestionNumber;
    }
    
/** Get the prompt
 * @return QuestionPrompt
 *  
*/ 
    public String getQuestionPrompt() {
        return QuestionPrompt;
    }

/** Get A  from the multiple choice options
 * @return OptionA
 *  
*/ 

    public String getOptionA() {
        return OptionA;
    }
    
/** Get B  from the multiple choice options
 * @return OptionB
 *  
*/ 

    public String getOptionB() {
        return OptionB;
    }
    
/** Get C  from the multiple choice options
 * @return OptionC
 *  
*/ 

    public String getOptionC() {
        return OptionC;
    }

/** Get correctAnswer for the question
 * @return correctAnswer
 *  
*/ 

   public String getCorrectAnswer() {
        return CorrectAnswer;
   }
}
