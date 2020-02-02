package com.example.howmuch.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.example.howmuch.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
	@Transactional(readOnly = true)
	@Query("SELECT obj FROM Product obj WHERE obj.barCode = :barCode")
	Optional<Product> findByBarCode(String barCode);

}
