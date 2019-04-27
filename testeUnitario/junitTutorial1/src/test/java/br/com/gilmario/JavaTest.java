package br.com.gilmario;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by gilmario on 16/02/17.
 */
public class JavaTest extends TestCase{

    protected int value1, value2;

    //assigning the values
    protected void setUp(){
        value1 = 3;
        value2 = 3;
    }

    //test method to add two values
    @Test
    public void testAdd(){
        double result = value1 + value2;
        Assert.assertTrue(result == 6);
    }
}
