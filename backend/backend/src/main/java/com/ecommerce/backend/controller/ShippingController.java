package com.ecommerce.backend.controller;

import com.ecommerce.backend.entity.Shipping;
import com.ecommerce.backend.service.ShippingService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/shippings")
@CrossOrigin(origins = "http://localhost:3000")
public class ShippingController {

    private final ShippingService shippingService;

    public ShippingController(ShippingService shippingService) {
        this.shippingService = shippingService;
    }

    @GetMapping
    public List<Shipping> getAllShippings() {
        return shippingService.getAllShippings();
    }

    @PostMapping
    public Shipping createShipping(@RequestBody Shipping shipping) {
        return shippingService.saveShipping(shipping);
    }
}
