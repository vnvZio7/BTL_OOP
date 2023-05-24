package com.QLBH.entity;


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
@Table(name = "SANPHAM")
public class ProductEntity {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "MASP")
	private String maSP;
	@Column(name = "TENSP")
	private String tenSP;
	@Column(name = "DVT")
	private String dvt;
	@Column(name = "NUOCSX")
	private String nuocSX;
	@Column(name = "GIA")
	private double gia;
	@JsonIgnore
	@OneToMany(mappedBy = "productEntity", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<OrderDetailEntity> orderDetails = new ArrayList<>();
}
