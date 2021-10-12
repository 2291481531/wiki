package com.jiawa.wiki.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Chen
 * @date 2021/9/27 10:09
 * @description
 */
@RestController
public class TestController {
    
    /**
     * GET, POST, PUT, DELETE
     *
     * @return
     */
    @GetMapping("/hello")
    public String hello() {
        return "Hello World!";
    }

    @PostMapping("/hello/post")
    public String helloPost(String name) {
        return "Hello World!" + name;
    }

}
