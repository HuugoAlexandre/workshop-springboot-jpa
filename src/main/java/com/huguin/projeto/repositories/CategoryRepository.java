package com.huguin.projeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.huguin.projeto.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	
}
