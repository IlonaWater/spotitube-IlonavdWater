package nl.oose.dea.Login;

import nl.oose.dea.Account;
import nl.oose.dea.UserToken;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/login")
public class LoginControl {

    //private LoginService loginService = new LoginService();

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response login(Account account) {

        if ("donkey".equals(account.getUser()) && "cabbage".equals(account.getPassword())) {
            UserToken token = new UserToken("Donkey Cabbage", "1234-1234-1234");
            return Response.ok().entity(token).build();
        } else {
            return Response.status(Response.Status.UNAUTHORIZED).build();
        }
    }

}
