import java.util.HashMap;

public class UserList {
    private final HashMap<String, accountcontrol> UserList = new HashMap<>();
    
    public UserList() {
    }
    
    public void addUser(String accountname, accountcontrol account) {
        UserList.put(accountname, account);
    }
    
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
