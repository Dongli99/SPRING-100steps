package com.example.demo;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class DemoController {

    @GetMapping("/cats")
    public List<Cat> retrieveCats() {
        return Arrays.asList(
                new Cat(1234L, "Miu"),
                new Cat(1266L, "oo"));
    }

}
