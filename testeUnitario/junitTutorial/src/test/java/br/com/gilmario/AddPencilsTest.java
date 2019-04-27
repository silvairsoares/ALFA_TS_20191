package br.com.gilmario;

import br.com.gilmario.model.FirstDayAtSchool;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by gilmario on 16/02/17.
 */
public class AddPencilsTest {

    FirstDayAtSchool school = new FirstDayAtSchool();

    String[] bag = {"Books", "Notebooks", "Pens", "Pencils"};

    @Test
    public void testAddPencils(){
        System.out.println("Inside testAddPencils");
        Assert.assertArrayEquals(bag, school.addPencils());
    }
}
