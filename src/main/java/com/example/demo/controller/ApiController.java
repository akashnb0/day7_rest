package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Car;
import com.example.demo.service.ApiService;

@RestController
public class ApiController {
    @Autowired
    ApiService as;
    
    @PostMapping("post")
    public Car post2(@RequestBody Car c)
    {
    	return as.post1(c);
    }
    
    @GetMapping("owners/{s}")
    public List<Car> get03(@PathVariable String s)
    {
    	return as.get02(s);
    }
    @GetMapping("address/{s}")
    public List<Car> get13(@PathVariable String s)
    {
    	return as.get12(s);
    }
    @GetMapping("carname/{s}")
    public List<Car> get23(@PathVariable String s)
    {
    	return as.get22(s);
    }
    @GetMapping("carname/{s}/cartype/{s1}")
    public List<Car> get33(@PathVariable String s,@PathVariable String s1)
    {
    	return as.get32(s,s1);
    }
}