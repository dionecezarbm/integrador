package com.example.howmuch.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.howmuch.dto.TroubleshootDTO;
import com.example.howmuch.entities.Troubleshoot;
import com.example.howmuch.exceptions.ResourceNotFoundException;
import com.example.howmuch.repositories.TroubleshootRepository;

@Service
public class TroubleshootService {
	
	@Autowired
	private TroubleshootRepository repository;
	
	public List<TroubleshootDTO> findAll() {
		List<Troubleshoot> list = repository.findAll();
		return list.stream().map(e -> new TroubleshootDTO(e)).collect(Collectors.toList());
	}
	
	public TroubleshootDTO findById(Long id) {
		Optional<Troubleshoot> obj = repository.findById(id);
		Troubleshoot entity = obj.orElseThrow(() -> new ResourceNotFoundException(id));
		return new TroubleshootDTO(entity);
	}
	
	public Troubleshoot insert(Troubleshoot obj) {
		return repository.save(obj);
	}
	
}