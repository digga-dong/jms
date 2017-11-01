package com.holley.service.impl;

import com.holley.mapper.ProductinfoMapper;
import com.holley.model.ProductinfoWithBLOBs;
import com.holley.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/11/1.
 */
@Service
public class ProductServiceImpl implements ProductService {

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

    @Override
    public ProductinfoWithBLOBs getProduct(Integer id) {
        return this.productinfoMapper.selectByPrimaryKey(id);
    }
}
