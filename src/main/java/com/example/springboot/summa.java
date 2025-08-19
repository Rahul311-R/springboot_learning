package com.example.springboot;

import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class summa {
    @RequestMapping("home")
    public String m(){
        return "i am rahul";
    }
}
