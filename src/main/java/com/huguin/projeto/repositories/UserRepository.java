package com.huguin.projeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.huguin.projeto.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}
