package com.holley.service.impl;

import com.holley.mapper.ProductinfoMapper;
import com.holley.model.ProductinfoWithBLOBs;
import com.holley.service.productService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by Administrator on 2017/11/1.
 */
public class productServiceImpl implements productService {

    @Autowired
    private ProductinfoMapper productinfoMapper;

    @Override
    public List<ProductinfoWithBLOBs> getProductList()
    {
        return productinfoMapper.selectByExampleWithBLOBs(null);
    }

    @Override
    public int addProduct(ProductinfoWithBLOBs product) {
        return productinfoMapper.insert(product);
    }
}
