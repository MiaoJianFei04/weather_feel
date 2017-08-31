package com.hanvon.kg.repository;

import com.hanvon.kg.domain.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;

/**
 * Created by MJF on 11:08 2017/8/31
 */
@Component
public interface ProductRepository extends MongoRepository<Product,String> {
}
