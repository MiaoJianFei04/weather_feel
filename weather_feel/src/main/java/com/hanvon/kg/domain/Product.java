package com.hanvon.kg.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

/**
 * Created by MJF on 上午 10:39 2017/8/23 0023
 * 产品的信息
 */
@Data
@Document(collection = "kg_product")
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @Id
    private String Id;
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
    private boolean hotSwap;

    public Product(Equipment equipment, String serial, String name, boolean status, String startTiming, String endTiming, Strainer strainer, Wind windSpeed, boolean gears, boolean circulation, boolean hotSwap) {
        this.equipment = equipment;
        this.serial = serial;
        this.name = name;
        this.status = status;
        this.startTiming = startTiming;
        this.endTiming = endTiming;
        this.strainer = strainer;
        this.windSpeed = windSpeed;
        this.gears = gears;
        this.circulation = circulation;
        this.hotSwap = hotSwap;
    }
}
