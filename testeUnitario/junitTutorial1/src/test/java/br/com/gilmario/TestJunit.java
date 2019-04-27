package br.com.gilmario;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by gilmario on 16/02/17.
 */
public class TestJunit {
    @Test
    public void testAdd(){
        String str = "Junit is working fine. ";
        Assert.assertEquals("Junit is working fine. ", str);
    }
}
