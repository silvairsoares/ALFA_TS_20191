package br.com.gilmario;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 * Created by gilmario on 17/02/17.
 */
public class JUnitRunner {
    public static void main(String[] args){
        Result result = JUnitCore.runClasses(AssertionsTest.class);

        for(Failure failure : result.getFailures()){
            System.out.println(result.toString());
        }

        if(result.wasSuccessful()){
            System.out.println("All test finished successfully...");
        }
    }
}
