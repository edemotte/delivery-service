package com.kafka400.delivery_service.service;

import com.kafka400.delivery_service.event.OrderCreatedEvent;

public interface DeliveryService {
    void createDelivery(OrderCreatedEvent event);
}
