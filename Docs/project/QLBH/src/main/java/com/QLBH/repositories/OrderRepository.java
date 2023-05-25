package com.QLBH.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.QLBH.entity.OrderEntity;

public interface OrderRepository extends JpaRepository<OrderEntity, Integer> {

}
