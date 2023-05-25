package com.QLBH.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "CTHD")
public class OrderDetailEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "SOHD")
	private int soHD;
	@Column(name = "SL")
	private int SL;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MASP")
    private ProductEntity productEntity;

	public int getSoHD() {
		return soHD;
	}

	public void setSoHD(int soHD) {
		this.soHD = soHD;
	}

	public int getSL() {
		return SL;
	}

	public void setSL(int sL) {
		SL = sL;
	}

	public ProductEntity getProductEntity() {
		return productEntity;
	}

	public void setProductEntity(ProductEntity productEntity) {
		this.productEntity = productEntity;
	}

	public OrderDetailEntity(int soHD, int sL, ProductEntity productEntity) {
		super();
		this.soHD = soHD;
		SL = sL;
		this.productEntity = productEntity;
	}

	public OrderDetailEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
}
