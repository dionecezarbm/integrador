package com.example.howmuch.resources;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.example.howmuch.dto.TroubleshootDTO;
import com.example.howmuch.entities.Troubleshoot;
import com.example.howmuch.services.TroubleshootService;

@RestController
@RequestMapping(value = "/troubleshoots")
public class TroubleshootResource {
	
	@Autowired
	private TroubleshootService service;
	
	@GetMapping
	public ResponseEntity<List<TroubleshootDTO>> findAll() {
		List<TroubleshootDTO> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<TroubleshootDTO> findById(@PathVariable Long id) {
		TroubleshootDTO dto = service.findById(id);
		return ResponseEntity.ok().body(dto);
	}
	
	@PostMapping
	public ResponseEntity<Troubleshoot> insert(@RequestBody Troubleshoot obj) {
		obj = service.insert(obj);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri();
		return ResponseEntity.created(uri).body(obj);
	}

}