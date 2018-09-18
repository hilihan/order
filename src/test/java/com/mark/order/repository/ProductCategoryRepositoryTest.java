package com.mark.order.repository;

import com.mark.order.dataobject.ProductCategory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.junit.Assert;
import org.springframework.transaction.annotation.Transactional;


import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryRepositoryTest {
    @Autowired
    private ProductCategoryRepository repository;

    @Test
    public void findOne(){
      ProductCategory productCategory =  repository.findOne(1);
      System.out.println(productCategory);
    }

    @Test
    public void findAll(){
        List<ProductCategory> productCategories =  repository.findAll();
        Assert.assertNotNull(productCategories);
        System.out.println(productCategories);
    }

    @Test
    @Transactional //测试数据会完全回滚
    public void saveOne(){
        ProductCategory productCategory = new ProductCategory();
        productCategory.setCategoryName("低价帮");
        productCategory.setCategoryType(4);
        ProductCategory result = repository.save(productCategory);
        Assert.assertNotEquals(null,result);
    }

    @Test
    public void findByCategoryTypeInTest(){
        List<Integer> categoryType = Arrays.asList(2,3,4);

        List<ProductCategory> result = repository.findByCategoryTypeIn(categoryType);

        Assert.assertNotEquals(0,result.size());
    }

}