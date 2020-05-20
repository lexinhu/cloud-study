package com.xn2001.springcloud.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by 乐心湖 on 2020/5/20 17:35
 */
@Configuration
public class FeignConfig {
    @Bean
    Logger.Level feignloggerLevel(){
        return Logger.Level.FULL;
    }
}
