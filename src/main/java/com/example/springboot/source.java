package com.example.springboot;

import org.springframework.web.bind.annotation.*;

@RestController

public class source {
//    @RequestMapping("home")
//    public String m(){
//        return "i am rahul";
//    }
//
//    @RequestMapping("contact")
//    public String m1(){ return "rahul@gmail.com"; }
//
//    @RequestMapping("dept")
//    public String m2(){return "Artificial intelligence";}
//
//    @RequestMapping("/home/{name}")
//    public String m3(@PathVariable String name){
//        return "hello "+name+" !";
//    }
//
    @GetMapping("/greet")
    public String greet(@RequestParam(defaultValue = "rahul") String name) {
        return "Greetings, " + name + "!";
    }
//
//    @GetMapping("/user")
//    public User getuser(){
//        return new User("rahul",21);
//    }
    @PostMapping("/user")
    public User create(@RequestBody User user){
        return user;
    }


}
