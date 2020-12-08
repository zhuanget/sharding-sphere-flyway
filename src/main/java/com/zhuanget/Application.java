package com.zhuanget;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Zhuang_ET
 * @since 2020-10-20 13:59:48
 */
@SpringBootApplication
@MapperScan("com.zhuanget.mapper")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
