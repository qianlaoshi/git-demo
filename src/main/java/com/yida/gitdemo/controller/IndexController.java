package com.yida.gitdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
    @RequestMapping("/hello")
    public String hello() {
        return "hello world";
    }

    @RequestMapping("/world")
    public String world() {
        return "hello 宜达互联";
    }
}
