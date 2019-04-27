package br.com.gilmario;

import br.com.gilmario.model.Calculate;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

/**
 * Created by gilmario on 16/02/17.
 */
@RunWith(Parameterized.class)
public class CalculateParameterizedTest {
    private int expected;
    private int first;
    private int second;

    public CalculateParameterizedTest(int expected, int first, int second) {
        this.expected = expected;
        this.first = first;
        this.second = second;
    }

    @Parameterized.Parameters
    public static Collection addedNumbers(){
        return Arrays.asList(new Integer[][]{ { 3, 1, 2 }, { 5, 2, 3 },
                { 7, 3, 4 }, { 9, 4, 5 }, });
    }

    @Test
    public void sum(){
        Calculate add = new Calculate();
        System.out.println("Addition with parameters : " + first + " and " + second);
        Assert.assertEquals(expected, add.sum(first, second));
    }
}
