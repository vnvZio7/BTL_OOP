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
	@Column(name = "MASP")
	private String maSP;
	@Column(name = "tensp")
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
	public String getMaSP() {
		return maSP;
	}
	public void setMaSP(String maSP) {
		this.maSP = maSP;
	}
	public String getTenSP() {
		return tenSP;
	}
	public void setTenSP(String tenSP) {
		this.tenSP = tenSP;
	}
	public String getDvt() {
		return dvt;
	}
	public void setDvt(String dvt) {
		this.dvt = dvt;
	}
	public String getNuocSX() {
		return nuocSX;
	}
	public void setNuocSX(String nuocSX) {
		this.nuocSX = nuocSX;
	}
	public double getGia() {
		return gia;
	}
	public void setGia(double gia) {
		this.gia = gia;
	}
	public List<OrderDetailEntity> getOrderDetails() {
		return orderDetails;
	}
	public void setOrderDetails(List<OrderDetailEntity> orderDetails) {
		this.orderDetails = orderDetails;
	}
	public ProductEntity() {
		// TODO Auto-generated constructor stub
	}
	public ProductEntity(String maSP, String tenSP, String dvt, String nuocSX, double gia,
			List<OrderDetailEntity> orderDetails) {
		super();
		this.maSP = maSP;
		this.tenSP = tenSP;
		this.dvt = dvt;
		this.nuocSX = nuocSX;
		this.gia = gia;
		this.orderDetails = orderDetails;
	}
	
}
