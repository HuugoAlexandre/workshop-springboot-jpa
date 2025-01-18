package com.huguin.projeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.huguin.projeto.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
}
