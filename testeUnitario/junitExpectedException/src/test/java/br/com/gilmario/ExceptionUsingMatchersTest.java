package br.com.gilmario;

import static org.hamcrest.Matchers.hasProperty;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import javax.ws.rs.NotFoundException;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

/**
 * Created by gilmario on 19/02/17.
 */
public class ExceptionUsingMatchersTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void shouldThown(){
        TestThing testThing = new TestThing();
        thrown.expect(NotFoundException.class);
        thrown.expectMessage(startsWith("Some Message"));
        thrown.expect(hasProperty("response", hasProperty("Status", is(404))));
        testThing.chuck();
    }

    private class TestThing{
        public void chuck(){
            Response response = Response.status(Status.NOT_FOUND).entity("Resource not found").build();
            throw new NotFoundException("Some message", response);
        }
    }
}
