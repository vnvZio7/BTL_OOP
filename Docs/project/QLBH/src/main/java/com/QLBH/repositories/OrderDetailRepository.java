package com.QLBH.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.QLBH.entity.OrderDetailEntity;
 
public interface OrderDetailRepository extends JpaRepository<OrderDetailEntity, Integer>{
	
}
