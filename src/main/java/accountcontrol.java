/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//package uah.cs321.termproject;

/**
 *
 * @author adrianalanier
 */
/*public class UserAccount {
    private String UserName;
    private String PasswordHash;
    private String firstName;
    private String lastName;
    
    public void UserAccount(String User, String Password)
    {
       this.UserName = User;
       this.PasswordHash = Password;
    }
    
    public void setName(String first, String last)
    {
        this.firstName=first;
        this.lastName=last;
    }
    
    public String getName()
    {
       return this.firstName + " " + this.lastName;
    }
  
    
    
}
*/


/**
* Holds functions for username and password control
*/
public class accountcontrol {

   private String username;
   private String password;


/**
* Contructor, defaults username and password to generic string
*/
   public accountcontrol(){
       this.username = "anyusername";
       this.password = "anypassword";
   }

/**
* Sets account username
* @param UserName string to assign as the username
*/
   public void setUserName(String UserName) {
       username = UserName;
   }

/**
* Sets account username
* @param Password string to assign as the account password
*/   
   public void setPassword(String Password) {
       password = Password;
   }

/**
* gets account username
* @return UserName 
*/
   public String getUserName() {
       return username;
   }

/**
* gets account password
* @return Password 
*/
   public String getPassword() {
       return password;
   }

}

