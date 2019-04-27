package br.com.gilmario;

import exceptions.OrderNotFoundException;
import exceptions.OrderSaveException;
import exceptions.OrderUpdateException;
import order.Order;
import order.OrderBo;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * Created by gilmario on 19/02/17.
 */
public class TestCheckedException {
    OrderBo orderBo;
    Order data;

    @BeforeTest
    void setUp(){
        orderBo = new OrderBo();
        data = new Order();
        data.setId(1);
        data.setCreatedBy("mkyong");
    }

    @Test(expectedExceptions = OrderSaveException.class)
    public void throwIfOrderIsNull() throws OrderSaveException{
        orderBo.save(null);
    }

    /*
    * Example: Multiple expected exceptions
    * Test is success if either of the exception is thrown
     */
    @Test(expectedExceptions = {OrderUpdateException.class, OrderNotFoundException.class})
    public void thrownIfOrderIsNotExists() throws OrderUpdateException, OrderNotFoundException{
        orderBo.update(data);
    }

}
