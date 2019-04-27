package br.com.gilmario;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by gilmario on 17/02/17.
 */
public class TestJunit1Pagina19 {
    @Test
    public void testAdd(){
        //test data
        int num = 5;
        String temp = null;
        String str = "Junit is working fine";

        //check for equality
        Assert.assertEquals("Junit is working fine", str);

        //check for false condition
        Assert.assertFalse(num > 6);

        //Assert for not null value
        Assert.assertNotNull(str);
    }
}
