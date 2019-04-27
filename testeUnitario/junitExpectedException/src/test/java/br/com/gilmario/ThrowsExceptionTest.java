package br.com.gilmario;

import org.junit.Test;

import java.util.ArrayList;


/**
 * Created by gilmario on 19/02/17.
 */
public class ThrowsExceptionTest {
    @Test(expected=IndexOutOfBoundsException.class)
    public void empty(){
        new ArrayList<Object>().get(0);
    }

    @Test(expected = ArithmeticException.class)
    public void divideByZero(){
        int n1 = 2;
        int n2 = 0;
        double result = n1/n2;
    }
}
