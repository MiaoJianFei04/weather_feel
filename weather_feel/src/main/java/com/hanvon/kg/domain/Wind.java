package com.hanvon.kg.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Field;

/**
 * Created by MJF on 下午 14:17 2017/8/29 0029
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Wind{
    @Field
    private String windSpeed;
}
