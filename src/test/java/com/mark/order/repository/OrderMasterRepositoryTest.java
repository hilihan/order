package com.mark.order.repository;

import com.mark.order.dataobject.OrderMaster;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderMasterRepositoryTest {

    @Autowired
    private OrderMasterRepository repository;

    private final String OPEN_ID = "888888";

    @Test
    public void saveTest(){
        OrderMaster orderMaster = new OrderMaster();
        orderMaster.setOrderId("123457");
        orderMaster.setBuyerName("Mark");
        orderMaster.setBuyerPhone("12345678901");
        orderMaster.setBuyerAddress("李家山");
        orderMaster.setBuyerOpenid(OPEN_ID);
        orderMaster.setOrderAmount(new BigDecimal(2.5));

       OrderMaster result =  repository.save(orderMaster);
        Assert.assertNotNull(result);
    }


    @Test
    public void findByBuyerOpenid(){
        PageRequest request = new PageRequest(0,1);
        Page<OrderMaster> result =  repository.findByBuyerOpenid(OPEN_ID,request);
        Assert.assertNotEquals(0,result.getTotalElements());
        System.out.println(result.getTotalElements());
        System.out.println(result.getTotalPages());
    }

}