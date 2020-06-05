package com.xn2001.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 乐心湖
 * @date 2020/5/29 14:41
 **/
@RestController
@RefreshScope
public class ConfigClientController {

    @Value("${config.info}")
    private String configInfo;  //要访问的3344上的信息

    @Value("${server.port}")
    private String port;

    @GetMapping("/configInfo")    //请求地址
    public String getConfigInfo() {
        return "\t port：" + port + " text：" + configInfo;
    }

}
