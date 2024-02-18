package com.predicates.predicates.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.predicates.predicates.service.PredicateService;

import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class MainController {

    @Autowired
    private PredicateService service;

    @GetMapping("/service/{name}")
    public String getResponse (@PathVariable String name) {
        Boolean result = service.checkPredicateResult1(name);
        return "Is the name John Wick? : " + result;
    }

    @GetMapping("service")
    public String getMethodName(@RequestParam String name) {
        Boolean result = service.checkPredicateResult2(name);
        return "Is the name John Wick? : " + result;
    }
    
}
