
import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;


/**
 *
 * @author Brad
 */
public class QuizQuestionPanel extends JPanel {
    ButtonGroup bg = new ButtonGroup();
    Question question = new Question();
    quiz quiz = new quiz();
    JRadioButton answera = new JRadioButton();
    JRadioButton answerb = new JRadioButton();
    JRadioButton answerc = new JRadioButton();
    JRadioButton answerd = new JRadioButton();
    
 /**Constructor
 *
 */
    public void QuizQuestionPanel() {
    }
 /**question getter
 *@return question
 */ 
    public Question getQuestion() {
        return question;
    }
 /**quiz getter
 *@return quiz
 */  
    public quiz getQuiz() {
        return quiz;
    }
 /**quiz sets the answer choices for each of the questions to a radio button
 *@param q
 *@param Quiz
 */ 
    public void initQuestionPanel(Question q, quiz Quiz) {
            question = q;
            quiz = Quiz;
            answera.setText(question.getOptionA());
            answerb.setText(question.getOptionB());
            answerc.setText(question.getOptionC());
            answerd.setText(question.getOptionD());
            
            bg.add(answera);
            bg.add(answerb);
            bg.add(answerc);
            bg.add(answerd);
            
            this.add(answera);
            this.add(answerb);
            this.add(answerc);
            this.add(answerd);
            
            answera.addActionListener((java.awt.event.ActionEvent evt) -> {
                question.setSelectedAnswer("a");
            });
            answerb.addActionListener((java.awt.event.ActionEvent evt) -> {
                question.setSelectedAnswer("b");
            });
            answerc.addActionListener((java.awt.event.ActionEvent evt) -> {
                question.setSelectedAnswer("c");
            });
            answerd.addActionListener((java.awt.event.ActionEvent evt) -> {
                question.setSelectedAnswer("d");
            });
            
    }
}
