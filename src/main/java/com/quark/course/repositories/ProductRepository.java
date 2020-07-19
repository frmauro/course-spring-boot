package com.quark.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.quark.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
