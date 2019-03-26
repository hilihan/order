package com.mark.order.dto;

import com.mark.order.dataobject.OrderDetail;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Data
public class OrderDTO {

    /** 订单ID */
    private String orderId;
    /** 买家名字 */
    private String buyerName;
    /** 买家手机号 */
    private String buyerPhone;
    /** 买家地址 */
    private String buyerAddress;
    /** 买家微信 Openid */
    private String buyerOpenid;
    /** 订单总金额 */
    private BigDecimal orderAmount;
    /** 订单状态，默认为 0 新下单 */
    private Integer orderStatus;
    /** 支付状态，默认为 0 未支付 */
    private Integer payStatus;

    private Date createTime;
    private Date updateTime;

    List<OrderDetail> orderDetailList;

}
