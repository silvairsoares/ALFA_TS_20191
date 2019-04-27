package br.com.gilmario;

import br.com.gilmario.util.MessageUtil;
import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by gilmario on 16/02/17.
 */
public class TestJunit2Pagina20 extends TestCase{
    protected double fValue1;
    protected double fValue2;

    @Before
    public void setUp(){
        fValue1=2.0;
        fValue2=3.0;
    }

    @Test
    public void testAdd(){
        //count the number of test cases
        System.out.println("Number of test cases: " + this.countTestCases());

        //test getName
        System.out.println("Test case name: " + this.getName());

        //test setName
        this.setName("testNewAdd");
        System.out.println("Updated Test case name: " + this.getName());
    }

    //tearDown used to close the connection or clean up activities
    public void tearDown(){

    }

}
