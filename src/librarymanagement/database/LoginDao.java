
package librarymanagement.database;

import librarymanagement.model.LoginUser;

public class LoginDao {
    public boolean checkLogin(LoginUser user) {
        if (user != null) {
            if ("admin".equals(user.getNameLogin()) 
                    && "admin".equals(user.getPassLogin())) {
                return true;
            }
        }
        return false;
    }
}
