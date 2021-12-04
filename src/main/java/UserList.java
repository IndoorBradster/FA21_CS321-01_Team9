import java.util.HashMap;



/**
*Stores all users of the program in a list 
*
*/
public class UserList {
    private final HashMap<String, accountcontrol> UserList = new HashMap<>();
    

/**
*Constructor
*
*/
    public UserList() {
    }

/**
*Adds a users account names and accountcontrol (user/pass) to list
*@param accountname name of account
* @param account accountcontrol object
*/    
    public void addUser(String accountname, accountcontrol account) {
        UserList.put(accountname, account);
    }

/**
*Checks to see if passwords match
*@param username 
* @param password 
* @return account
* @return null 
*/ 
    
    public accountcontrol getUser(String username, String password) {
        accountcontrol account = UserList.get(username);
        if (account.getPassword().equals(password)) {
            return account;
        }
        else {
            return null;
        }
    }
}
