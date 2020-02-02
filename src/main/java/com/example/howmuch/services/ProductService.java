package com.example.howmuch.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.howmuch.dto.ProductDTO;
import com.example.howmuch.entities.Product;
import com.example.howmuch.exceptions.ResourceNotFoundException;
import com.example.howmuch.repositories.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository repository;
	
	public List<ProductDTO> findAll() {
		List<Product> list = repository.findAll();
		return list.stream().map(e -> new ProductDTO(e)).collect(Collectors.toList());
	}
	
	public ProductDTO findById(Long id) {
		Optional<Product> obj = repository.findById(id);
		Product entity = obj.orElseThrow(() -> new ResourceNotFoundException(id));
		return new ProductDTO(entity);
	}
	
	public ProductDTO findByBarCode(String barCode) {
		Optional<Product> obj = repository.findByBarCode(barCode);
		Product entity = obj.orElseThrow(() -> new ResourceNotFoundException(barCode));
		return new ProductDTO(entity);
	}
}