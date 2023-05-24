package com.QLBH.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.QLBH.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, String>{

}
