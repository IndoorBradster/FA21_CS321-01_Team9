import java.util.HashMap;

/**
*Stores all users of the program in a list 
*
*/
public class UserList extends HashMap<String, accountcontrol> {
    //private final HashMap<String, accountcontrol> UserList = new HashMap<>();
    
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
        this.put(accountname, account);
    }

    /**
    *Checks to see if passwords match
    *@param username 
    *@param password 
    *@return account
    */ 
    public accountcontrol getUser(String username, String password) {
        accountcontrol account = this.get(username);
        if (account.getPassword().equals(password)) {
            return account;
        }
        else {
            return null;
        }
    }
}
