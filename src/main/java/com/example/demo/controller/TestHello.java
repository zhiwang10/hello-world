package com.example.demo.controller;

import com.example.demo.entiry.Student;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestHello {

    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }

    // 这是一个方法......12344
    @RequestMapping("/student")
    public Student student(){
        Student s = new Student();
        s.setAge(1);
        s.setName("12");
        return s;
    }

}
