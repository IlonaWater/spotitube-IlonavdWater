package nl.oose.dea;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/")
public class App {

    public static void main(String[] args) {
    }

    @GET
    @Produces("text/plain")
    public String re() {
        return "Hello, world!";
    }
}
