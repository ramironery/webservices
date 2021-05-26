package com.ramironery.webservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ramironery.webservices.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
