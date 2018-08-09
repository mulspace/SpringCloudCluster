
package com.example.service;

import org.springframework.stereotype.Component;



@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }

    @Override
    public String getUserFromClientOne() {
        return "failed ";
    }
}