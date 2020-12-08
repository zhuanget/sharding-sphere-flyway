package com.zhuanget.job;

import com.zhuanget.config.PropertiesConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * 初始化表job，用于初始化分表，并每天动态新增及删除过期表
 *
 * @author Zhuang_ET
 * @since 2020-12-01 16:59:57
 */
@Component
@Slf4j
@Order(1)
public class InitTableJob implements CommandLineRunner {

    @Autowired
    private PropertiesConfig propertiesConfig;

    @Override
    public void run(String... args) throws Exception {

    }
}
