package com.xn2001.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by 乐心湖 on 2020/3/31 21:21
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult <T> {

    private Integer code;
    private String message;
    private T data;

    public CommonResult(Integer code,String message){
        this(code,message,null);
    }
}
