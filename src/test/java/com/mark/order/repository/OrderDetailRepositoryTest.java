package com.mark.order.repository;

import com.mark.order.dataobject.OrderDetail;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderDetailRepositoryTest {
    @Autowired
    private OrderDetailRepository repository;

    @Test
    public void saveTest(){
        OrderDetail orderDetail = new OrderDetail();
        orderDetail.setDetailId("123456790");
        orderDetail.setOrderId("111111112");
        orderDetail.setProductIcon("http://xxxx.com/b.jpg");
        orderDetail.setProductId("111111113");
        orderDetail.setProductName("小笼包");
        orderDetail.setProductPrice(new BigDecimal(2));
        orderDetail.setProductQuantity(2);

        OrderDetail result = repository.save(orderDetail);
        Assert.assertNotNull(result);
    }

    @Test
    public void findByOrderId() {
       List<OrderDetail> orderDetailList =  repository.findByOrderId("111111112");
       Assert.assertNotEquals(0,orderDetailList.size());
    }
}