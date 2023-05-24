package com.QLBH.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.QLBH.entity.EmployeeEntity;

public interface EmployeeRepository extends JpaRepository<EmployeeEntity, String>{

}
