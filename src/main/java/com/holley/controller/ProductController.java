package com.holley.controller;

import com.holley.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/11/1.
 */
@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private UserService userService;

}
