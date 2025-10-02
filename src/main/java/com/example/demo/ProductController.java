package com.example.demo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/product")
@RestController
public class ProductController {
    @GetMapping("/hello")
    public String hello() {
        return "Hello World";
    }
    @GetMapping("/getproduct")
    public product getproduct() {
        product myproduct = new product("tv",499);
        return myproduct;
    }
}
