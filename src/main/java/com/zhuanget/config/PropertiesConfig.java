package com.zhuanget.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author Zhuang_ET
 * @since 2020-12-01 17:07:54
 */
@Component
@Data
public class PropertiesConfig {

    @Value("${sharding.history.days:10}")
    private Integer historyDays;

    @Value("${sharding.future.days:10}")
    private Integer futureDays;
}
