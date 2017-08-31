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
   /* private String Id;
    //设备类型
    private Equipment equipment;
    //序列号
    private String serial;
    //设备名称
    private String name;
    //状态:运行/关闭
    private boolean status;
    //定时开始时间:5:00
    @Field("start_timing")
    private String startTiming;
    //定时结束时间:9:00
    @Field("end_timing")
    private String endTiming;
    //滤网/128/64/48
    private Strainer strainer;
    //风速:/1/2/3
    private Wind windSpeed;
    //档位:自动
    private boolean gears;
    //循环:内/外
    private boolean circulation;
    //热交换:on/off
    private boolean hotSwap;*/
    public Product keepProduct(){
        Product product = new Product();
        product.setEquipment(new Equipment("空感一号"));
        product.setSerial("hwlt-kg-201708290001");
        product.setName("汉王新风机");
        product.setStatus(true);
        product.setStartTiming("5:00");
        product.setEndTiming("9:00");
        product.setStrainer(new Strainer(189,230,221));
        product.setWindSpeed(new Wind("3档"));
        product.setGears(true);
        product.setHotSwap(true);
       return productRepository.save(product);
    }

}
