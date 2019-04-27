package com.tutorialspoint.mock;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InOrder;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.*;

/**
 * Created by gilmario on 14/02/17.
 */
// @RunWith attaches a runner with the test class to initialize the test data

// @RunWith attaches a runner with the test class to initialize the test data
@RunWith(MockitoJUnitRunner.class)
public class MathApplicationTester {

    MathApplication mathApplication;
    CalculatorService calcService;

    @Before
    public void setUp(){
        mathApplication = new MathApplication();
        calcService = mock(CalculatorService.class);
        mathApplication.setCalcService(calcService);
    }


    //test a simple add operation
    @Test
    public void testAdd(){

        //add the behavior of calc service to add two numbers
        when(calcService.add(10.0,20.0)).thenReturn(30.00);
        //test the add functionality
        Assert.assertEquals(mathApplication.add(10.0, 20.0),30.0,0);
    }

}
