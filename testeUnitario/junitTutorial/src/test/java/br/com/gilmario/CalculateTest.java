package br.com.gilmario;

import br.com.gilmario.model.Calculate;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by gilmario on 16/02/17.
 * Página 9 do JUnit-Tutorial.pdf
 */
public class CalculateTest {

    Calculate calculation = new Calculate();
    int sum = calculation.sum(2, 5);
    int testSum = 7;

    @Test
    public void testSum(){
        System.out.println("Testing sum: " + sum + " = " + testSum);
        Assert.assertEquals(sum, testSum);
    }
}
