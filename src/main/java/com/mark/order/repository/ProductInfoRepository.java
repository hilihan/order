package com.mark.order.repository;

import com.mark.order.dataobject.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductInfoRepository  extends JpaRepository<ProductInfo,String> {
    /**
     * 按照商品状态查询信息
     * @param productStatus 0 正常，1 下架
     * @return
     */
    List<ProductInfo> findByProductStatus(Integer productStatus);
}
