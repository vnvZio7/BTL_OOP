package com.QLBH.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.QLBH.entity.CustomerEntity;

public interface CustomerRepository extends JpaRepository<CustomerEntity, String>{

}
