package com.hanvon.kg.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Field;

/**
 * 设备
 * Created by MJF on 上午 11:45 2017/8/29 0029
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Equipment {
    @Field
    private String equipmentType;
}
