package nl.oose.dea.Login;

import nl.oose.dea.Account;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

public class LoginTest {
    private LoginControl sut;

    @Mock
    private Account account;

    @Before
    public void setUp() throws Exception {
        sut = new LoginControl();
    }

    @Test
    public void testThatLoginReturnsCorrectInformation() {
        account.setUser("donkey");
        account.setPassword("cabbage");


    }
}