package com.elissandro.course.resources;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.elissandro.course.entities.Product;
import com.elissandro.course.services.ProductService;

@RestController
@RequestMapping(value = "/products")
public class ProductResource implements Serializable {
	private static final long serialVersionUID = 1L;

	@Autowired
	private ProductService service;
	
	@GetMapping
	public ResponseEntity<List<Product>> findALL(){
		List<Product> list = service.findALL();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Product> findById(@PathVariable Long id){
		Product obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}
