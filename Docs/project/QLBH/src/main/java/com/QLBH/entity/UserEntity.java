package com.QLBH.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class UserEntity {
	@Column(name = "TENND")
	private String username;
	
	@Column(name = "MK")
	private String password;
	
	@Column(name = "QUYEN")
	private String quyen;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getQuyen() {
		return quyen;
	}

	public void setQuyen(String quyen) {
		this.quyen = quyen;
	}

	public UserEntity(String username, String password, String quyen) {
		super();
		this.username = username;
		this.password = password;
		this.quyen = quyen;
	}
	
	
	
	
}
