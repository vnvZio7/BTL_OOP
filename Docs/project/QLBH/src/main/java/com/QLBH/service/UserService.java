package com.QLBH.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.QLBH.entity.UserEntity;
import com.QLBH.repositories.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;
	public List<UserEntity> listAll(){
		return userRepository.findAll();
	}
}
