package com.trucdulieu.productservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/products/hello")
public class HelloController {

    @GetMapping
    public String getHello(){
        return "Hello from product service";
    }
}
