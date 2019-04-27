package br.com.gilmario;

import br.com.gilmario.model.FirstDayAtSchool;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

/**
 * Created by gilmario on 16/02/17.
 * Página 21 do JUnit-Tutorial.pdf
 */
@Ignore
public class FirstDayAtSchoolTest {

    FirstDayAtSchool firstDayAtSchool = new FirstDayAtSchool();
    String[] bag1 = {"Books", "Notebooks", "Pens"};
    String[] bag2 = {"Books", "Notebooks", "Pens", "Pencils"};

    @Test
    public void testPrepareMyBag(){
        System.out.println("Inside testPrepareMyBag");
        Assert.assertArrayEquals(bag1, firstDayAtSchool.prepareMyBag());
    }


    @Test
    public void testAddPencils(){
        System.out.println("Inside testAddPencils");
        Assert.assertArrayEquals(bag2, firstDayAtSchool.addPencils());
    }
}
