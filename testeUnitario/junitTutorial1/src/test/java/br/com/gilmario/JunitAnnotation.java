package br.com.gilmario;

import org.junit.*;

/**
 * Created by gilmario on 17/02/17.
 */
public class JunitAnnotation {
    //execute before class
    @BeforeClass
    public static void beforeClass(){
        System.out.println("In before class");
    }

    //execute after class
    @AfterClass
    public static void afterClass(){
        System.out.println("In after class");
    }

    //execute before test
    @Before
    public void before(){
        System.out.println("In before ");
    }

    //execute after test
    @After
    public void after(){
        System.out.println("In after");
    }

    //test case
    @Test
    public void test(){
        System.out.println("In test");
    }

    //test case
    @Test
    public void test1(){
        System.out.println("In test1");
    }

    //test case ignore and will not execute
    @Ignore
    public void ignore(){
        System.out.println("In ignore test");
    }
 }
