package com.example.orderwarehouse.component;

import com.example.orderwarehouse.service.ShippingOrdersService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ShippingOrdersUpdateComponent {
    @Value("${orders.shipping-orders-update-enabled}")
    private  boolean shippingOrdersUpdateEnabled;
    private final Logger logger = LoggerFactory.getLogger(ShippingOrdersUpdateComponent.class);
    private final ShippingOrdersService shippingOrdersService;

    public ShippingOrdersUpdateComponent(
            @Autowired ShippingOrdersService shippingOrdersService
    ) {
        this.shippingOrdersService = shippingOrdersService;
    }

    @Scheduled(fixedRate = 24L*60L*60000L)
    void updateShippingOrders() {
        if (shippingOrdersUpdateEnabled) {
            logger.info("Collection of a new batch of orders for shipment");
            shippingOrdersService.updateShippingOrders();
            logger.info("Shipping orders updated");
        } else {
            logger.warn("Shipping orders update cycle disabled. Skipping...");
        }
    }
}
