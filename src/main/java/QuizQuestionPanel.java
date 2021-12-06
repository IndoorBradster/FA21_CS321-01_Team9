
import java.awt.BorderLayout;
import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;


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
    public JTextArea QuestionPromptText = new JTextArea();
    
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
    
    public void setLabel(String text) {
        QuestionPromptText.setText(text);
    }
    
 /**quiz sets the answer choices for each of the questions to a radio button
 *@param q
 *@param Quiz
 */ 
    public void initQuestionPanel(Question q, quiz Quiz) {
        
            
            QuestionPromptText.setText("Testing");
            QuestionPromptText.setLineWrap(true);
            this.add(QuestionPromptText);
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

            JPanel radiobox = new JPanel();
            radiobox.add(answera);
            radiobox.add(answerb);
            radiobox.add(answerc);
            radiobox.add(answerd);
            
            this.add(radiobox, BorderLayout.SOUTH);
            
            radiobox.setBounds(12, 200, 30, 200);
            
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
