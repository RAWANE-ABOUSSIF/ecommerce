package com.ecommerce.backend.service;

import com.ecommerce.backend.entity.Shipping;
import com.ecommerce.backend.repository.ShippingRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShippingService {

    private final ShippingRepository shippingRepository;

    public ShippingService(ShippingRepository shippingRepository) {
        this.shippingRepository = shippingRepository;
    }

    public List<Shipping> getAllShippings() {
        return shippingRepository.findAll();
    }

    public Shipping saveShipping(Shipping shipping) {
        return shippingRepository.save(shipping);
    }
}
