package com.example.demo;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class DemoConfigurationController {
    @Autowired
    private DemoServiceConfiguration demoServiceConfiguration;

    @GetMapping("/demo-configuration")
    public DemoServiceConfiguration retrieveCats() {
        return demoServiceConfiguration;
    }

}
