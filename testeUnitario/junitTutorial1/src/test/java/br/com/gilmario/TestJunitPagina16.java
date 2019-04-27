package br.com.gilmario;

import br.com.gilmario.util.MessageUtil;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by gilmario on 17/02/17.
 */
public class TestJunitPagina16 {
    String message = "Hello World!";
    MessageUtil messageUtil = new MessageUtil(message);

    @Test
    public void printMessage(){
        Assert.assertEquals(message, messageUtil.printMessage());
    }
}
