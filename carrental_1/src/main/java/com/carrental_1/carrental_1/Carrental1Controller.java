package com.carrental_1.carrental_1;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/cars")
public class Carrental1Controller {
    
    @GetMapping
    public List<String> getAvailableCars() {
        return List.of("Tesla Model 3", "Toyota Camry", "Ford Mustang");
    }
}