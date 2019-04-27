package br.com.gilmario;

import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Created by gilmario on 17/02/17.
 */
public class TestNGSimpleTest {
    @Test
    public void testAdd(){
        String str = "TestNG is working fine";
        assertEquals("TestNG is working fine",str);
    }
}
