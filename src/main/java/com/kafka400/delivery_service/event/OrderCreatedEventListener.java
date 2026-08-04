package com.kafka400.delivery_service.event;

import com.kafka400.delivery_service.service.DeliveryService;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class OrderCreatedEventListener {

    private final DeliveryService deliveryService;

    @KafkaListener(
            topics = "${app.kafka.topics.order-created}",
            groupId = "${spring.kafka.consumer.group-id}"
    )
    public void handle(OrderCreatedEvent event) {
        System.out.println("Received OrderCreatedEvent: " + event);
        deliveryService.createDelivery(event);
    }
}
