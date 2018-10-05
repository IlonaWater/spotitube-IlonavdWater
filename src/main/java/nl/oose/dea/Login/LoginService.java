package nl.oose.dea.Login;

import nl.oose.dea.Account;
import nl.oose.dea.UserToken;

import javax.security.auth.login.LoginException;

public class LoginService {


    public UserToken login(Account account) throws LoginException {
        if ("donkey".equals(account.getUser()) && "cabbage".equals(account.getPassword())) {
            UserToken token = new UserToken("Donkey Cabbage", "1234-1234-1234");
            return token;
        } else throw new LoginException("Unvalid user information.");
    }

}
