package br.com.gilmario;

import br.com.gilmario.businness.EmpBusinessLogic;
import br.com.gilmario.model.EmployeeDetails;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by gilmario on 16/02/17.
 */
public class EmployeeDetailsTest {
    EmpBusinessLogic employeeBusinnessLogic = new EmpBusinessLogic();
    EmployeeDetails employee = new EmployeeDetails();

    //test do check appraisal
    @Test
    public void testCalculateAppraisal(){
        employee.setName("Reajeev");
        employee.setAge(25);
        employee.setMonthlySalary(8000);
        double appraisal = employeeBusinnessLogic.calculateAppraisal(employee);
        Assert.assertEquals(500, appraisal, 0.0);
    }

    //test to chech yearSalary
    @Test
    public void testCalculateYearSalary(){
        employee.setName("Reajeev");
        employee.setAge(25);
        employee.setMonthlySalary(8000);
        double salary = employeeBusinnessLogic.calculateYearlySalary(employee);
        Assert.assertEquals(96000, salary, 0.0);
    }
}
