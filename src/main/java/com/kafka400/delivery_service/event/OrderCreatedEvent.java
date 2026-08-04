package com.kafka400.delivery_service.event;

import java.util.UUID;

public record OrderCreatedEvent(
        String eventId,
        UUID orderId,
        String customerName,
        String deliveryAddress,
        String itemName,
        int quantity
) {
}
