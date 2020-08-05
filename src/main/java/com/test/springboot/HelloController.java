package com.test.springboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试控制器
 * @author: @殷函为
 * @create: 2020-8-03
 */
@RestController
public class HelloController {

    @RequestMapping("/hello1")
    public String hello() {
        return "Hello Spring Boot!";
    }
}
