package com.atguigu.syt.hosp.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: HANG
 * @Date: 2022/3/22 17:36
 * @Desc:
 */
@Configuration
@MapperScan("com.atguigu.syt.hosp.mapper")
public class HospConfig {
}
