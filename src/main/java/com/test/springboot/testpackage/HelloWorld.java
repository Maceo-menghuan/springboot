package com.test.springboot.testpackage;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

    @RequestMapping("/testhello")
    public String testhello() {
        return "Hello world!";
    }

}
