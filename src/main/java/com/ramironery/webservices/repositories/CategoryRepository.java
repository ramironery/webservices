package com.ramironery.webservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ramironery.webservices.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
