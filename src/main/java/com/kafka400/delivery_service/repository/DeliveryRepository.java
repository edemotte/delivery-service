package com.kafka400.delivery_service.repository;

import com.kafka400.delivery_service.entity.Delivery;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface DeliveryRepository extends JpaRepository<Delivery, String> {

    boolean existsByOrderId(UUID orderId);
}
