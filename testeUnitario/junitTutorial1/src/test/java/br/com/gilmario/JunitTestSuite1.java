package br.com.gilmario;

import junit.framework.TestResult;
import junit.framework.TestSuite;

/**
 * Created by gilmario on 17/02/17.
 * Página 24
 */
public class JunitTestSuite1 {
    public static void main(String[] args){
        //add the test's in the suite
        TestSuite suite = new TestSuite(TestJunit1Pagina19.class, TestJunit2Pagina20.class, TestJunit3.class);
        TestResult result = new TestResult();
        suite.run(result);
        System.out.println("Number of test cases: " + result.runCount());
    }
}
