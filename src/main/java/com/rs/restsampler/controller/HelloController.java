package com.rs.restsampler.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    //https://velog.io/@hyeok_1212/GDSC-Spring-Boot%EB%A1%9C-REST-API-%EB%A7%8C%EB%93%A4%EC%96%B4%EB%B3%B4%EA%B8%B0

    @GetMapping("/hello")
    public String Hello(){
        return "Hello, Spring!";
    }
}
