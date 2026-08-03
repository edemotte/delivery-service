package com.kafka400.delivery_service.event;

public record OrderCreatedEvent(
        String eventId,
        String orderId,
        String customerName,
        String deliveryAddress,
        String itemName,
        int quantity
) {
}
