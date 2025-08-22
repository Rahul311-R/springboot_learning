package com.example.springboot;

import jakarta.validation.constraints.*;

public class User{
    @NotNull(message = "name should not null")
    @Size(min = 2,max =50,message = "Name must be 2–50 characters")
    private String name;

    @Min(value = 1,message = "age must be above 0")
    private int age;


    public User(String name,int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }
    public void setName(){
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}