
import java.awt.BorderLayout;
import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
    
    public void QuizQuestionPanel() {
    }
    
    public Question getQuestion() {
        return question;
    }
    
    public quiz getQuiz() {
        return quiz;
    }
    
    public void setLabel(String text) {
        QuestionPromptText.setText(text);
    }
    
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
