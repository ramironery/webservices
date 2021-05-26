package com.ramironery.webservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ramironery.webservices.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
