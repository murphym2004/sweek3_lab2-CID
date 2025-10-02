package com.example.demo;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RequestMapping("/product")
@RestController
public class ProductController {
    List<product> mylist = new ArrayList<product>();
    @GetMapping("/hello")
    public String hello() {
        return "Hello World";
    }
    @GetMapping("/getproduct")
    public product getproduct() {
        product myproduct = new product("tv",500);
        return myproduct;
    }
    @PostMapping("/addproduct")
    public product addproduct(@Valid @RequestBody product myproduct) {
        mylist.add(myproduct);
        return myproduct;
    }
    @GetMapping("/count")
    public int getproductcount() {
        return mylist.size();
    }
}
