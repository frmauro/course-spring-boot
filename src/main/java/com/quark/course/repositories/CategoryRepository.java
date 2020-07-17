package com.quark.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.quark.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
