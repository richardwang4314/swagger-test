package com.richard.swaggertest.testcontroller;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
@Api(tags = "測試相關接口", description = "提供測試相關的Rest API")
public class TestController {
    @GetMapping("/test")
    public void test() {
        System.out.println("test");
    }
}
