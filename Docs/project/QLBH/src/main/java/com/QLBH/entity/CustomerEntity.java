package com.QLBH.entity;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "KHACHHANG")
public class CustomerEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "MAKH")
	private String maKH;
	@Column(name = "HOTEN")
	private String hoten;
	@Column(name = "DCHI")
	private String diachi;
	@Column(name = "SODT")
	private String sdt;
	@Column(name = "NGSINH")
	private Date ngSinh;
	@Column(name = "NGDK")
	private Date ngDK;
	@Column(name = "DOANHSO")
	private double doanhso;
	@JsonIgnore
	@OneToMany(mappedBy = "customerEntity", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<OrderEntity> orders = new ArrayList<>();
}
