package com.hanvon.kg.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Field;

/**
 * Created by MJF on 下午 14:15 2017/8/29 0029
 * 过滤器的值
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Strainer {
    @Field
    private int num1;
    @Field
    private int num2;
    @Field
    private int num3;

}
