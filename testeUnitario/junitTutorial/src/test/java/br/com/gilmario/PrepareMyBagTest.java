package br.com.gilmario;

import br.com.gilmario.model.FirstDayAtSchool;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by gilmario on 16/02/17.
 */
public class PrepareMyBagTest {

    FirstDayAtSchool school = new FirstDayAtSchool();

    String[] bag = {"Books", "Notebooks", "Pens"};

    @Test
    public void testPrepareMyBag(){
        System.out.println("Inside testPrepareMyBag");
        Assert.assertArrayEquals(bag, school.prepareMyBag());
    }
}
