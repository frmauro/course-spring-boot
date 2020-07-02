package com.quark.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.quark.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
