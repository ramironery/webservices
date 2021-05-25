package com.ramironery.webservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ramironery.webservices.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
