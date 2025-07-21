package com.ecommerce.backend.controller; // adapte selon ton package

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "Bienvenue dans mon API Spring Boot !";
    }
}
