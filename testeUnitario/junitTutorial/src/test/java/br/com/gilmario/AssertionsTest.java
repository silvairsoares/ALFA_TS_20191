package br.com.gilmario;


import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.Assert;

/**
 * Created by gilmario on 16/02/17.
 * Página 13 do JUnit-Tutorial.pdf
 */
public class AssertionsTest {

    String obj1 = "junit";
    String obj2 = "junit";
    String obj3 = "test";
    String obj4 = "test";
    String obj5 = null;
    int var1 = 1;
    int var2 = 2;
    int[] arithmetic1 = {1,2,3};
    int[] arithmetic2 = {1,2,3};

    @Test
    public void assertEqualsTest() {
        System.out.println("Inside assertEqualsTest.");
        Assert.assertEquals(obj1, obj2);
    }

    @Test
    public void assertSameTest() {
        System.out.println("Inside assertSameTest.");
        Assert.assertSame(obj3, obj4);
    }

    @Test
     public void assertNotSameTest() {
        System.out.println("Inside assertNotSameTest.");
        Assert.assertNotSame(obj2, obj4);
    }

    @Test
    public void assertNotNullTest(){
        System.out.println("Inside assertNotNullTest.");
        Assert.assertNotNull(obj1);
    }

    @Test
     public void assertNullTest() {
        System.out.println("Inside assertNullTest.");
        Assert.assertNull(obj5);
     }

     @Test
     public void assertTrueTest(){
        System.out.println("Inside assertTrueTest.");
        Assert.assertTrue(var1 < var2);}

     @Test
     public void assertArrayEqualsTest(){
         System.out.println("Inside assertArrayEqualsTest.");
         Assert.assertArrayEquals(arithmetic1, arithmetic2);
     }

}
