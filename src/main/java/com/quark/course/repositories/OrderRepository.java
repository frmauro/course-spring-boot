package com.quark.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.quark.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
