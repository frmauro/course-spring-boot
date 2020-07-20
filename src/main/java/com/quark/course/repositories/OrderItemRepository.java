package com.quark.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.quark.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
