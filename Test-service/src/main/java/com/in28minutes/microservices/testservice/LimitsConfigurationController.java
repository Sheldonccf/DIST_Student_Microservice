package com.in28minutes.microservices.testservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsConfigurationController {

    @Autowired
    private Configuration configuration;

    @GetMapping("/limits")
    public Configuration retrieveLimitsFromConfigurations(){
//        return new LimitConfiguration(1000, 1);
//        return new LimitConfiguration(configuration.getUsername(), configuration.getPassword());
          return configuration;


    }
}
