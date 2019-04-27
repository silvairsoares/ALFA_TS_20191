package br.com.gilmario;

import br.com.gilmario.util.MessageUtil;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by gilmario on 16/02/17.
 */
public class TestJunit1 {
    String message = "Robert";
    MessageUtil messageUtil = new MessageUtil(message);

    @Test
    public void testPrintMessage(){
        System.out.println("Inside testPrintMessage");
        Assert.assertEquals(message, messageUtil.printMessage());
    }
}
