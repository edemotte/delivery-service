package com.kafka400.delivery_service.service;

import com.kafka400.delivery_service.domain.Delivery;
import com.kafka400.delivery_service.event.OrderCreatedEvent;
import com.kafka400.delivery_service.repository.DeliveryRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Service
public class DeliveryService {

    private final DeliveryRepository deliveryRepository;

    public DeliveryService(DeliveryRepository deliveryRepository) {
        this.deliveryRepository = deliveryRepository;
    }

    @Transactional
    public void createDelivery(OrderCreatedEvent event) {
        if (deliveryRepository.existsByOrderId(event.orderId())) {
            return;
        }

        Delivery delivery = new Delivery(
                UUID.randomUUID().toString(),
                event.orderId(),
                event.customerName(),
                event.deliveryAddress(),
                event.itemName(),
                event.quantity(),
                "PENDING"
        );

        deliveryRepository.save(delivery);
    }
}
