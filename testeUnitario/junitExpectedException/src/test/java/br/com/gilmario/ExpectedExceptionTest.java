package br.com.gilmario;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.fail;
import static org.junit.Assert.assertThat;
import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by gilmario on 19/02/17.
 */
public class ExpectedExceptionTest {
    @Test
    public void testExceptionMessage(){
        try{
            new ArrayList<Object>().get(0);
            fail("Expected an IndexOutOfBoundsException to be thrown");
        }catch (IndexOutOfBoundsException e){
            assertThat(e.getMessage(), is("Index: 0, Size: 0"));
        }
    }
}
