package br.com.gilmario;

import org.junit.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


import java.util.ArrayList;

/**
 * Created by gilmario on 16/02/17.
 * Página 11 do JUnit-Tutorial.pdf
 */
public class AnnotationsTest {

    private ArrayList testList;

    @BeforeClass
    public static void onceExecutedBeforeAll(){
        System.out.println("@BeforeClass: onceExecutedBeforeAll");
    }

    @Before
    public void executedBeforeEach(){
        testList = new ArrayList();
        System.out.println("@Before: executedBeforeEach");
    }

    @AfterClass
    public static void onceExecutedAfterAll(){
        System.out.println("@AfterClass: onceExecutedAfterAll");
    }

    @After
    public void executedAfterEach(){
        testList.clear();
        System.out.println("@After: executedAfterEach");
    }

    @Test
    public void emptyCollection(){
        assertTrue(testList.isEmpty());
        System.out.println("@Test: EmptyArrayList");
    }

    @Test
    public void oneItemCollection(){
        testList.add("oneItem");
        assertEquals(1, testList.size());
        System.out.println("@Test: oneItemCollection");

    }


}
