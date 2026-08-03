package com.kafka400.delivery_service.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;

@Getter
@Entity
@Table(name = "deliveries")
public class Delivery {

    @Id
    private String deliveryId;

    @Column(nullable = false, unique = true)
    private String orderId;

    @Column(nullable = false)
    private String customerName;

    @Column(nullable = false)
    private String deliveryAddress;

    @Column(nullable = false)
    private String itemName;

    @Column(nullable = false)
    private int quantity;

    @Column(nullable = false)
    private String status;

    protected Delivery() {
        // Required by JPA
    }

    public Delivery(
            String deliveryId,
            String orderId,
            String customerName,
            String deliveryAddress,
            String itemName,
            int quantity,
            String status
    ) {
        this.deliveryId = deliveryId;
        this.orderId = orderId;
        this.customerName = customerName;
        this.deliveryAddress = deliveryAddress;
        this.itemName = itemName;
        this.quantity = quantity;
        this.status = status;
    }

}
