package com.kafka400.delivery_service.repository;

import com.kafka400.delivery_service.domain.Delivery;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeliveryRepository extends JpaRepository<Delivery, String> {

    boolean existsByOrderId(String orderId);
}
