package com.zhuanget.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Zhuang_ET
 * @since 2020-10-20 14:01:11
 */
@RestController("/test")
@RequestMapping("/test")
public class TestController {

    @GetMapping("/app")
    public String testApp() {
        return "success";
    }
}
