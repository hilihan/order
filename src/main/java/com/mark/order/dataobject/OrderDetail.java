package com.mark.order.dataobject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Data
public class OrderDetail {

    @Id
    /** 详情ID */
    private String detailId;
    /** 订单ID */
	private String orderId;
	/** 商品ID */
	private String productId;
	/** 商品名称 */
	private String productName;
	/** 商品价格 */
	private BigDecimal productPrice;
	/** 商品数量 */
	private Integer productQuantity;
	/** 商品小图 */
	private String productIcon;

    private Date createTime;
    private Date updateTime;



}
