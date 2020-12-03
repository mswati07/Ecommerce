package com.swati.Ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.swati.Ecommerce.model.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
