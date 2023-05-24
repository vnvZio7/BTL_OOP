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
	private int tenSP;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MASP")
    private ProductEntity productEntity;
	
}
