package com.elissandro.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.elissandro.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
