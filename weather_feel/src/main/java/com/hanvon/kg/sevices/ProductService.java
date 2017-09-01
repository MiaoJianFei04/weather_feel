package com.hanvon.kg.sevices;

import com.hanvon.kg.domain.Equipment;
import com.hanvon.kg.domain.Product;
import com.hanvon.kg.domain.Strainer;
import com.hanvon.kg.domain.Wind;
import com.hanvon.kg.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by MJF on 17:55 2017/8/31
 */
@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public Product keepProduct(){
        Product product = new Product();
        product.setEquipment(new Equipment("空感二号"));
        product.setSerial("hwlt-kg-201708290002");
        product.setName("蓝天新风机");
        product.setStatus(false);
        product.setStartTiming("9:00");
        product.setEndTiming("21:00");
        product.setStrainer(new Strainer(299,330,121));
        product.setWindSpeed(new Wind("2档"));
        product.setGears(false);
        product.setHotSwap(false);
       return productRepository.save(product);
    }


    public void findPro(Product product) {
        String id = product.getId();
        Equipment equipment = product.getEquipment();
        String serial = product.getSerial();
        String name = product.getName();

    }
}
