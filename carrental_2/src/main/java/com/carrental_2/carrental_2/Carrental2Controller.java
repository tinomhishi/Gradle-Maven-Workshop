package com.carrental_2.carrental_2;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/cars_2")
public class Carrental2Controller {
    
    @GetMapping
    public List<String> getAvailableCars() {
        return List.of("Tesla Model S", "Toyota Prius", "Honda Accord");
    }
}