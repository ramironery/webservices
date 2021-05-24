package com.ramironery.webservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ramironery.webservices.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
