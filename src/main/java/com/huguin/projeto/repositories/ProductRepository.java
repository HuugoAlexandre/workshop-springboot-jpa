package com.huguin.projeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.huguin.projeto.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
}
