package com.example.calculator.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class CalculatorController {
    
    @GetMapping("/add")
    public Double add(@RequestParam double a,@RequestParam double b){
       return a +  b;
    }
    @GetMapping("/minus")
    public Double minus(@RequestParam Double a,@RequestParam Double b) {
        return a -b;
    }
    
    @GetMapping("/multiplication")
    public Double multiplication(@RequestParam Double a,@RequestParam Double b) {
        return a * b;
    }
    
    @GetMapping("/division")
    public Double division(@RequestParam Double a,@RequestParam Double b) {
        if (b ==0){
            throw new ArithmeticException("division by zero is not allowed");
        }
        return a/b;
    }
    
}
