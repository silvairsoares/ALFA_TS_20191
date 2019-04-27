package br.com.gilmario;

import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by gilmario on 19/02/17.
 */
public class ExceptionTestDemo {
    @Test(expectedExceptions = {IOException.class}, expectedExceptionsMessageRegExp = "Pass Message test")
    public void exceptionTestOne() throws Exception{
        throw new IOException("Pass Message test");
    }

    @Test(expectedExceptions = {IOException.class, NullPointerException.class}, expectedExceptionsMessageRegExp = ".* Message .*")
    public void exceptionTestTwo() throws Exception {
        throw new IOException("Pass Message test");
    }

    @Test(expectedExceptions = {IOException.class}, expectedExceptionsMessageRegExp = "Fail Message test")
    public void exceptionTestThree() throws Exception{
        throw new IOException("Fail Message test");
    }

    @Test(expectedExceptions = ArithmeticException.class)
    public void divisionWithException(){
        int i = 1/0;
    }
}
