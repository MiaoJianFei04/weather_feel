package com.hanvon.kg.controller;

import com.hanvon.kg.domain.Product;
import com.hanvon.kg.repository.ProductRepository;
import com.hanvon.kg.sevices.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by MJF on 17:41 2017/8/31
 */
@RestController
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private ProductService productService;


    /**
     * Created by MJF on 17:44 2017/8/31
     *
     * @Description:保存一个产品的信息
     *
     */
    @PostMapping(value = "/save")
    public Product save(Product product){
       return productRepository.save(product);
    }


    /**
     * Created by MJF on 17:53 2017/8/31
     *
     * @Description:创建一个产品保存到数据库中
     */
    @GetMapping(value = "/keep")
    public Product keep(){
       return productService.keepProduct();
    }


}
