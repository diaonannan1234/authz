package com.example.jcasbin;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author : yx-0176
 * @description
 * @date : 2021/1/22
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Group {
    /**
     * 请求对象
     */
    private String rSub;

    /**
     * 策略对象
     */
    private String pSub;
}
