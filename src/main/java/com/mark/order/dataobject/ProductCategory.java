package com.mark.order.dataobject;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**
 * 类目
 */
@Entity
@DynamicUpdate //只更新修改的字段信息
@Data //lombok工具提供，注解在类上, 为类提供get/set方法, 此外还提供了 equals()、hashCode()、toString() 方法
public class ProductCategory {

    /** 类目ID */
    @Id
    @GeneratedValue
    private Integer categoryId;

    /** 类目名字*/
    private String categoryName;

    /** 类目编号 */
    private Integer categoryType;

    private Date createTime;

    private Date updateTime;


    public ProductCategory() {
    }

    public ProductCategory(String categoryName, Integer categoryType) {
        this.categoryName = categoryName;
        this.categoryType = categoryType;
    }

}
