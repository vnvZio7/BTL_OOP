package com.QLBH.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.QLBH.entity.ProductEntity;

public interface ProductRepository extends JpaRepository<ProductEntity, String>{

}
