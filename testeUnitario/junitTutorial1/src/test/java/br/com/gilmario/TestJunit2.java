package br.com.gilmario;

import br.com.gilmario.util.MessageUtil;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by gilmario on 16/02/17.
 */
public class TestJunit2 {

    String message = "Robert";
    MessageUtil messageUtil = new MessageUtil(message);

    @Test
    public void testSalutationMessage(){
        System.out.println("Inside testSalutationMessage()");
        message = "Hi!" + "Robert";
        Assert.assertEquals(message, messageUtil.salutationMessage());
    }
}
