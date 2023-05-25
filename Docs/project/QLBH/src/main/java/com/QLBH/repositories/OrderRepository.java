package com.QLBH.repositories;

import java.sql.Date;
import java.time.LocalDate;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.QLBH.entity.OrderEntity;

public interface OrderRepository extends JpaRepository<OrderEntity, Integer>{

	
}
