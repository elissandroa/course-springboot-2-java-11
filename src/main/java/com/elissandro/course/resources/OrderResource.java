package com.elissandro.course.resources;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.elissandro.course.entities.Order;
import com.elissandro.course.services.OrderService;

@RestController
@RequestMapping(value = "/orders")
public class OrderResource implements Serializable {
	private static final long serialVersionUID = 1L;

	@Autowired
	private OrderService service;
	
	@GetMapping
	public ResponseEntity<List<Order>> findALL(){
		List<Order> list = service.findALL();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Order> findById(@PathVariable Long id){
		Order obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}
