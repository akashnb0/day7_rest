package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Car;
import com.example.demo.repository.CarRepo;

@Service
public class ApiService {
    @Autowired
    CarRepo cr;
    
    public Car post1(Car c)
    {
    	return cr.save(c);
    }
    
    
    public List<Car> get02(String s)
    {
    	return cr.getCar01(s);
    }
    public List<Car> get12(String s)
    {
    	return cr.getCar11(s);
    }
    public List<Car> get22(String s)
    {
    	return cr.getCar21(s);
    }
    public List<Car> get32(String s,String s1)
    {
    	return cr.getCar31(s,s1);
    }
}