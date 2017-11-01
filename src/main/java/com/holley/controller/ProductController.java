package com.holley.controller;

import com.holley.model.ProductinfoWithBLOBs;
import com.holley.service.ProductService;
import com.holley.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Administrator on 2017/11/1.
 */
@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private ProductService productService;


    @RequestMapping(value="/list", method = RequestMethod.GET)
    public List<ProductinfoWithBLOBs> getProductList()
    {
        return productService.getProductList();
    }

}
