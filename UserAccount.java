/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uah.cs321.termproject;

/**
 *
 * @author adrianalanier
 */
public class UserAccount {
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
