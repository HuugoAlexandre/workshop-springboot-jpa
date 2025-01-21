package com.huguin.projeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.huguin.projeto.entities.OrderItem;
import com.huguin.projeto.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {
	
}
