package br.com.gilmario;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;

/**
 * Created by gilmario on 16/02/17.
 */
public class NameRuleTest {

    @Rule
    public TestName name = new TestName();

    @Test
    public void testA(){
        System.out.println(name.getMethodName());
        Assert.assertEquals("testA", name.getMethodName());
    }

    @Test
    public void testB(){
        System.out.println(name.getMethodName());
        Assert.assertEquals("testB", name.getMethodName());
    }
}
