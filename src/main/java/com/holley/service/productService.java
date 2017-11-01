package com.holley.service;

import com.holley.model.ProductinfoWithBLOBs;

import java.util.List;

/**
 * Created by Administrator on 2017/11/1.
 */
public interface ProductService {

    List<ProductinfoWithBLOBs> getProductList();

    int addProduct(ProductinfoWithBLOBs product);

    ProductinfoWithBLOBs getProduct(Integer id);
}
