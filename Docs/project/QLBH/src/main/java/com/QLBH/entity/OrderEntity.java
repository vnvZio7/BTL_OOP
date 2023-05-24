package com.QLBH.entity;

import java.sql.Date;

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
@Table(name = "HOADON")
public class OrderEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "SOHD")
	private int soHD;
	
	@Column(name = "NGHD")
	private Date ngHD;
	
	@Column(name = "TRIGIA")
	private double trigia;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MAKH")
    private CustomerEntity customerEntity;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MANV")
    private EmployeeEntity employeeEntity;
	
	
}
