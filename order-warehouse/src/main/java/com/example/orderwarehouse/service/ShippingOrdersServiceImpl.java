package com.example.orderwarehouse.service;

import com.example.orderwarehouse.data.entity.ShippingOrdersEntity;
import com.example.orderwarehouse.repo.crud.ShippingOrdersRepository;
import com.example.orderwarehouse.repo.jdbc.BuildRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShippingOrdersServiceImpl implements ShippingOrdersService{
    private static final Logger LOGGER = LoggerFactory.getLogger("Shipping orders service");
    private final BuildRepository buildRepository;
    private final ShippingOrdersRepository shippingOrdersRepository;
    public ShippingOrdersServiceImpl(
            @Autowired BuildRepository buildRepository,
            @Autowired ShippingOrdersRepository shippingOrdersRepository
     ) {
        this.buildRepository = buildRepository;
        this.shippingOrdersRepository = shippingOrdersRepository;
    }

    @Override
    public void updateShippingOrders(){
        LOGGER.info("Updating Shipping orders");
        Iterable<ShippingOrdersEntity> toSave = buildRepository.getShippingOrdersLines();
        shippingOrdersRepository.deleteAll();
        shippingOrdersRepository.saveAll(toSave);
    }


}
