/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//package uah.cs321.termproject;

/**
 *
 * @author adrianalanier
 */
/*public class Question {
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
*/


import java.util.Scanner;
public class Main 
{
    public static void main(String args[])
    {
		// <-- ui implementation ---------------------------------------------------- //
		/* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EducatorUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new EducatorUI().setVisible(true);
        });
		// -- ui implementation ----------------------------------------------------> //
		
        String Username, Password;
        accountcontrol obj = new accountcontrol();
        quiz obj2 = new quiz();
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the username:");//username:user
        Username = s.nextLine();
        System.out.print("Enter the password:");//password:user
        Password = s.nextLine();
        if(Username.equals(obj.getUserName()) && Password.equals(obj.getPassword()))
        {
            System.out.println("Authentication Successful");
            System.out.println("Enter the difficulty level for the questions");
            String i;
            i = s.nextLine();
            if (i.equals("1")) {
            	obj2.questions1();
                obj2.answers1();
            }	
            if (i.equals("2")) {
            	obj2.questions2();
                obj2.answers2();
            }	
            if (i.equals("3")) {
            	obj2.questions3();
                obj2.answers3();
            }	
            
        }
        else
        {
            System.out.println("Authentication Failed");
        }
        s.close();
    }
}
