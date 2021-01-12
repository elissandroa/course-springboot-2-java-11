package com.elissandro.course.resources;

import java.io.Serializable;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.elissandro.course.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource implements Serializable {
	private static final long serialVersionUID = 1L;

	@GetMapping
	public ResponseEntity<User> findALL(){
		User u = new User(1L, "Maria", "maria@gmail.com", "99999999", "12345");
		return ResponseEntity.ok().body(u);
	}
	
}
