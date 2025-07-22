package com.ecommerce.backend.repository;

import com.ecommerce.backend.entity.Shipping;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShippingRepository extends JpaRepository<Shipping, Long> {
}
