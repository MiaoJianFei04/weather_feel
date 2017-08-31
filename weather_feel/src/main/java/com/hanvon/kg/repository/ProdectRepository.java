package com.hanvon.kg.repository;

import com.hanvon.kg.domain.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by MJF on 11:08 2017/8/31
 */

public interface ProdectRepository extends MongoRepository<Product,String> {
}
